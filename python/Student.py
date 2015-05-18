#! /usr/bin/env python
# -*-coding:utf-8 -*-

'python的面向对象设计'
class Student(object):
	def __init__(self, name, score):
		self.name = name
		self.score = score
	def print_score(self):
		print '%s:%s' %(self.name, self.score)

wang = Student('wangminli', 88)
zhang = Student('zhangsan', 90)
print wang #<__main__.Student object at 0x7ff54af38c90>
wang.print_score()
zhang.print_score()
