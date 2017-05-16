# -*- coding: utf-8 -*-
"""
Created on Thu Apr 13 16:56:49 2017

@author: LiuFeng
"""

# create a synthetic dataset for logistic regression
import io
import csv
import zipfile as zp
import tensorflow as tf

def weight_variable(shape):
    initial = tf.truncated_normal(shape, stddev = 0.1)
    return tf.Variable(initial)

def bais_variable(shape):
    initial = tf.constant(0.1, shape=shape)
    return tf.Variable(initial)



zipFile = zp.ZipFile('pre.zip','r')

# 广告特征文件：ad.cvs 
#ad_reader = csv.reader(io.StringIO(zipFile.read(zipFile.namelist()[1]).decode('utf-8')))
#print(ad_reader)

# 上广告位特征文件 position.csv
#position_reader = csv.reader(io.StringIO(zipFile.read(zipFile.namelist()[3]).decode('utf-8')))
#print(position_reader)

# App特征文件 app_categories.csv
#app_categories_reader = csv.reader(io.StringIO(zipFile.read(zipFile.namelist()[2]).decode('utf-8')))
#print(app_categories_reader)

# 用户App安装流水文件 user_app_actions.csv
#user_app_actions_reader = csv.reader(io.StringIO(zipFile.read(zipFile.namelist()[7]).decode('utf-8')))
#print(user_app_actions_reader)

# 用户App安装列表文件 user_installedapps.csv
#user_installedapps_reader = csv.reader(io.StringIO(zipFile.read(zipFile.namelist()[8]).decode('utf-8')))
#print(user_installedapps_reader)

# 用户基础特征文件件 user.cvs
user_reader = csv.DictReader(io.StringIO(zipFile.read(zipFile.namelist()[6]).decode('utf-8')))
user_dict = {u['userID']:[u['userID'],u['age'],u['gender'],u['education'],u['marriageStatus'],u['haveBaby'],u['hometown'],u['residence']] for u in user_reader }

# 训练数据 train.csv
train_reader = csv.DictReader(io.StringIO(zipFile.read(zipFile.namelist()[5]).decode('utf-8')))

# 测试数据 test.csv
#test_reader = csv.reader(io.StringIO(zipFile.read(zipFile.namelist()[4]).decode('utf-8')))
#print(test_reader)

records = [[x['label'],x['creativeID'],x['userID'],x['positionID'],x['connectionType'],x['telecomsOperator'] ] for x in train_reader ]
for record in records:
  for val in user_dict[record[2]]:
    record.append(val)

y_data = [float(x[0]) for x in records]
x_data = [x[1:13] for x in records]
for i in range(len(x_data)):
  for j in range(len(x_data[i])):
    x_data[i][j] = float(x_data[i][j])

# optimize linear regression with tensorflow
W = weight_variable([12,1])
b = bais_variable([1])

y = tf.sigmoid(tf.matmul(x_data,W) + b)

one = tf.ones(y.get_shape(), dtype=tf.float32)
print(one.get_shape())

loss = -tf.reduce_mean(y_data * tf.log(y) + (one-y_data) * tf.log(one-y))

optimizer = tf.train.GradientDescentOptimizer(0.5)
train = optimizer.minimize(loss)

init = tf.global_variables_initializer()

sess = tf.Session()
sess.run(init)

print ('params-before-training', sess.run(W), sess.run(b), '\n')

thresholdvec = tf.ones_like(one, dtype=tf.float32) * 0.5
print ( sess.run(thresholdvec))

correct_prediction = tf.equal(tf.cast(y_data, tf.int32), tf.cast(tf.greater(y, thresholdvec), tf.int32))
accuracy = tf.reduce_mean(tf.cast(correct_prediction, tf.float32))

for step in range(200):
  sess.run(train)
  
  # print type(y_data)
  if step % 50 == 0:
    print('accuracy: ', sess.run(accuracy))
    print ('params:', step,'\n')
    print ('W',sess.run(W),'\n')
    print ('b',sess.run(b),'\n')

sess.run(train)
result_file = open('result.txt','a')
result_file.write(','.join(str(v) for v in sess.run(y)))
result_file.write('\n')
result_file.close