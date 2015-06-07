#! /usr/bin/env python
# -*-coding:utf-8 -*-

'multiprocessing'

from multiprocessing import Process
import os

def run_proc(name):
	print 'child process is %s , %s' %(name, os.getpid())

if __name__ == '__main__':
	print 'Parent process %s.' % os.getpid()
	p = Process(target=run_proc, args=('test',))
	print 'Process will start'
	p.start()
	p.join()
