#! /usr/bin/env python
# -*-coding:utf-8 -*-

# set
s=set([1,2,3])
print s
s=set([1,1,2,2,3]) #删除重复的key
print s
s=set([3,2,1])	#自动排序了
print s
s=set([1,1,3,4,2,2,2,2])	#删除重复的key
print s

# 删除
s.remove(4)
print s
 
# 交集并集操作
s1=set([1,2,3])
s2=set([2,3,4])
print s1&s2
print s1|s2
