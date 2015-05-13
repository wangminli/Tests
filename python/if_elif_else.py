#! /usr/bin/env python
# -*-coding:utf-8 -*-

age=int(raw_input())  #raw_input()接收的是字符串，需要手动转成int类型
if age >= 18:
	print 'adult'
elif age >= 6:
	print 'teenager'
else:
	print 'kid'

