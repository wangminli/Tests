#! /usr/bin/env python
# -*-coding:utf-8 -*-

# python的迭代比java的抽象程度更高
for i in 'ABCD' :
	print i

# 对list
L=[1,2,3,4,5]
for i in L:
	print i

# 对tuple
t=(1,2,3,4,5)
for i in t:
	print i

# 对dict
d={"a":1, "b":2, "c":3}
for i in d:
	print i

#迭代dict的value
for i in d.itervalues():
	print i
