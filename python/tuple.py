#! /usr/bin/env python
# -*-coding:utf-8 -*-

# tuple有叫元组，它一旦初始化就不能修改，可以存放list等元素
classmates=('wangminli', 'zhangsan', 'lisi')
print classmates
t = (1, 2)
print t
print t[1]

#注意当tuple只有一个元素时要避免和小括号的功能产生歧义，要使用(var,)消除歧义
t = (1)		#这只是()的功能
print t
t = (1,)
print t

#可以放入list，但不影响list改变其中的内容
t=('a', 'b', ['A', 'B'])
print t
print t[2][1]
t[2][0]='C'
t[2][1]='D'
print t
#t[3]=['C', 'D'] # bug
#t[3]=['C', 'D', 'E'] #bug

