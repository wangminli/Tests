#! /usr/bin/env python
# -*-coding:utf-8 -*-

# str是不可变对象，虽然有个replace方法，但是它的值依然不可改变
str = 'abc'
str1=str.replace('a', 'A')
print str1
print str

'''
Abc
abc
'''
