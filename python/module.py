#! /usr/bin/env python
# -*-coding:utf-8 -*-

# 测试使用sys模块，检测输入了多少个参数 
'a test module'		#what is this?
import sys
def test():
	args = sys.argv
	if len(args) == 1:
		print 'hello world'
	elif len(args) ==2:
		print 'Hello, %s' % args[1]
	else:
		print 'Too many arguments!'

if __name__ == '__main__':
	test()
