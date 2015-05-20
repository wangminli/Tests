#! /usr/bin/env python
# -*-coding:utf-8 -*-

'a test module'		#第一行的字符串被视为代码的注释
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
	
