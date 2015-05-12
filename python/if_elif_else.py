#! /usr/bin/env python
# -*-coding:utf-8 -*-

#age=raw_input()  #bug：使用这个不能正常判断
age=12
if age >= 18:
	print 'adult'
elif age >= 6:
	print 'teenager'
else:
	print 'kid'

