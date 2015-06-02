#! /usr/bin/env python
# -*-coding:utf-8 -*-

'match正则匹配'
import re

s='010-10086'
flag = re.match(r'^\d{3}\-\d{3,8}$', s)  #注意{}里面不能有空格，如'{3,8}'不能写成‘{3, 8}’

if flag:
	print 'OK'
else:
	print 'failed'

print re.match(r'^\d{3}\-\d{3,8}$', '0-00001')  #注意{}里面不能有空格，如'{3,8}'不能写成‘{3, 8}’
