from math import log,ceil
import csv

list = ['1', '2','3','4']
dict={'a':list,'b':list}
out = open("test.csv", 'w')
csv_writer = csv.writer(open('test.csv','wb'))
csv_writer.writerow(dict['a'])
csv_writer.writerow(dict['b'])

# print ceil(log(3401,2))
# def toBin(x,length):
#     bin_x = bin(x)[2:]
#     diff = length - len(str(bin_x))
#     l = ['0' for i in range(diff)]
#     return l + (list(str(bin_x)))
#
# print toBin(4,10)
# print ceil(log(9,2))
#
# t=10
# bin_t=bin(t)[2:]
# print bin_t
# diff=10-len(str(bin_t))
# print diff
# l=['0' for i in range(diff)]
# print l+(list(str(bin_t)))