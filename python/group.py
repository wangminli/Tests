#! /usr/bin/env python
# -*-coding:utf-8 -*-

'正则分组功能'
import re
m = re.match(r'^(\d{3})-(\d{3,8})$', '010-12345')
print m.group(0)
print m.group(1)
print m.group(2)

'''
010-12345
010
12345
'''
