#! /usr/bin/env python
# -*-coding:utf-8 -*-
# list
classmates = ['wangminli', 'zhangsan', 'lisi']
# 可以直接打印数组名称
print classmates
print len(classmates)
print classmates[0]
print classmates[1]
print classmates[2]

#可以倒数计算，但是也会溢出，如使用classmates[4]
print classmates[-1]
print classmates[-2]
print classmates[-3]

# list是变长的有序列表，可以使用append, pop等进行操作
classmates.append('wangwu')
print 'after append:', classmates
classmates.insert(1, 'insertName')
print 'after insert:', classmates
classmates.pop()
print 'after pop:', classmates
classmates.pop(1)
print 'after pop(1):', classmates

# list可以是不同类型的
L=['wangminli', 123, True]
print L

# list可以包含另一个list
s = ['wangminli', ['zhangsan', 123], 2134]
print s



'''
['wangminli', 'zhangsan', 'lisi']
3
wangminli
zhangsan
lisi
lisi
zhangsan
wangminli
after append: ['wangminli', 'zhangsan', 'lisi', 'wangwu']
after insert: ['wangminli', 'insertName', 'zhangsan', 'lisi', 'wangwu']
after pop: ['wangminli', 'insertName', 'zhangsan', 'lisi']
after pop(1): ['wangminli', 'zhangsan', 'lisi']
['wangminli', 123, True]
['wangminli', ['zhangsan', 123], 2134]
'''
