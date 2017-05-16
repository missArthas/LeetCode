import csv
import io
import zipfile as zp
import math
from sklearn import preprocessing

def toBin(x,length):#number to binary
    bin_x = bin(x)[2:]
    diff = length - len(str(bin_x))
    l = ['0' for i in range(diff)]
    return l + (list(str(bin_x)))

zipFile = zp.ZipFile('pre.zip','r')
csv_writer = csv.writer(open('preprocessData.csv','wb'))

user_reader = csv.DictReader(io.StringIO(zipFile.read(zipFile.namelist()[6]).decode('utf-8')))
user_dict = {u['userID']:[u['userID'],u['age'],u['gender'],u['education'],u['marriageStatus'],u['haveBaby'],u['hometown'],u['residence']] for u in user_reader }


age_list=[]
education_list=[]
marriageStatus_list=[]
haveBaby_list=[]
hometown_list=[]
residence_list=[]

for user in user_dict:
    age_list.append(int(user_dict[user][1]))
    education_list.append(int(user_dict[user][3]))
    marriageStatus_list.append(int(user_dict[user][4]))
    haveBaby_list.append(int(user_dict[user][5]))
    hometown_list.append(int(user_dict[user][6]))
    residence_list.append(int(user_dict[user][7]))

max_age = max(age_list)
max_education=max(education_list)
max_marriageStatus = max(marriageStatus_list)
max_haveBaby = max(haveBaby_list)
max_hometown = max(hometown_list)
max_residence = max(residence_list)


for u in user_dict:
    user=user_dict[u]
    result=[]
    result.append(user[0])
    result.append(float(user[1])/max_age)
    if(user[2]==0):result.extend(['0','0'])
    elif(user[2]==1):result.extend(['0','1'])
    else:result.extend(['1','0'])
    result.append(float(user[3])/max_education)
    result.append(float(user[4])/max_marriageStatus)
    result.append(float(user[5])/max_haveBaby)
    result.extend(toBin(int(user[6]),int(math.ceil(math.log(max_hometown,2)))))
    result.extend(toBin(int(user[7]),int(math.ceil(math.log(max_residence,2)))))
    user_dict[u]=result
    csv_writer.writerow(result)


