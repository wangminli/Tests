#! /usr/bin/env python
# -*-coding:utf-8 -*-

'读文件,法1'
try:	
	print '----读文件,法1----'
	f = open("/home/wangminli/git/tests/python/helloWorld.txt")
	print f.read()
finally:
	if f:
		f.close()

#‘读文件，法2’
with open("/home/wangminli/git/tests/python/helloWorld.txt") as f:
	print '----读文件,法2----'
	print f.read()
