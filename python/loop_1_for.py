#! /usr/bin/env python
# -*-coding:utf-8 -*-

# for
names = ['zhangsan', 'lisi', 'wangwu']
for name in names:
	print name

list=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
sum = 0
for i in list:
	sum += i
print sum

# range(n)会生成[0,n)的list
list=range(101) #从0到9
sum = 0;
for i in list:
	sum += i
print sum
