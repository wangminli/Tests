#! /usr/bin/env python
# -*-coding:utf-8 -*-

class Student(object):
	def __init__(self, name, score):
		self.__name = name
		self.__score = score
	def print_score(self):
		print '%s: %s'% (self.__name, self.__score)


wang = Student('wangminli', 88)
zhang = Student('zhangsan', 90)

wang.print_score()
zhang.print_score()
print wang.__name
