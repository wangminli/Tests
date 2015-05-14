#! /usr/bin/env python
# -*-coding:utf-8 -*-

# dict
d={"wangminli":18, "lisi": 27, "wangwu":29}
print d
print d['wangminli']
print d['lisi']
print d['wangwu']

# 下面查找key存不存在，但不是value
print 'wangminli' in d
print 23 in d
print d.get('lisi')

#pop删除
d.pop('lisi')
print d
