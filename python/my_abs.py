#! /usr/bin/env python
# -*-coding:utf-8 -*-
def my_abs(x):
	if x >= 0:
		return x
	else:
		return -x

print my_abs(-2)

# 函数可以赋给另一个变量
a=my_abs
print a(-2)
