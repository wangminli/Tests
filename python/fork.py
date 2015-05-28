#! /usr/bin/env python
# -*-coding:utf-8 -*-

'fork'
import os
print "Process(%s) start...." %os.getpid()
pid = os.fork()
if pid == 0:
	print 'i am child process (%s) and my parent process is (%s)' %( os.getpid(), os.getppid())
else:
	print 'i(%s) just created a child process (%s)' %(os.getpid(), pid)

