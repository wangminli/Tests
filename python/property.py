#! /usr/bin/env python
# -*-coding:utf-8 -*-

'property可以简化getter和setter方法'
class Student(object):
	@property
	def score(self):
		return self.__score
	
	@score.setter
	def score(self, value):
		if not isinstance(value, int):
			raise ValueError('score must be a Integer')
		elif value < 0 or value > 100:
			raise ValueError('score must between 0 ~ 100')
		self.__score = value
		
	@property
	def birth(self):
		return self._birth
	@birth.setter
	def birth(self, value):
		self._birth = value
	@property
	def age(self):  #注意age没有setter方法，用这种方法实现只读
		return 2014 - self._birth


s = Student()
s.score = 87  #实际转化为set_score
print s.score	
s.score  = 147  
print s.score #实际转化为get_score
#注意到这个神奇的@property,我们在对实例属性操作的时候,就知道该属性很可能不是直
#接暴露的,而是通过 getter 和 setter 方法来实现的。

s.age = 23    #X：不能转换


