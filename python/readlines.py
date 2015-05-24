#! /usr/bin/env python
# -*-coding:utf-8 -*-

'对简短的配置文件可以读入所有行'
try:
	f = open("/home/wangminli/git/tests/python/helloWorld.txt")
	for line in f.readlines():
		print( line.strip())
finally:
	if f:
		f.close()
