#! /usr/bin/env python
# -*-coding:utf-8 -*-


'正则表达式切分字符串的优势'

import re
#普通的字符串切分方法
print 'a b      c'.split(' ')  #['a', 'b', '', '', '', '', '', 'c']

#python切分方法
print re.split(r'\s+', 'a b      c')
print re.split(r'[\s\,]+', 'a,b,c     d   ,   e')
print re.split(r'[\s\,\;]+', 'a,b,c     d   ,   e;f;g; h')
