#! /usr/bin/env python
# -*-coding:utf-8 -*-

'python的setter和getter'
class Student(object):
	def __init__(self, name, score):
		self.__name = name
		self.__score = score
	def print_score(self):
		print '%s: %s'% (self.__name, self.__score)
	# setter & getter
	def set_name(self, name):
		self.__name = name
	def set_score(self, score):
		self._score = score
	def get_name(self):
		return self.__name
	def get_score(self):
		return self.__score
	
	

wang = Student('wangminli', 88)
print wang.get_name()
wang.set_name('wangwu')
print wang.get_name()
