#! /usr/bin/env python
# -*-coding:utf-8 -*-

'__slots__的功能是用来限制自用添加额外的属性，只能添加其内部tuple中的属性'
class Student(object):
	__slots__ = ('name', 'age')

s = Student()
s.name = 'wangminli'
s.age = 23
s.sex = 'male'   # X:这个属性不允许添加

# 注意：__slots__ 只对当前类其作用，对继承类是不起作用的
class GraduateStudent(Student):
	pass

g = GraduateStudent()
g.sex = 'male'  # 可以


