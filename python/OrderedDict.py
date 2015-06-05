#! /usr/bin/env python
# -*-coding:utf-8 -*-

'OrderedDict.对dict排序'
from collections import OrderedDict
d = dict([('a',1), ('b', 2),('c', 3)])
print d
# {'a': 1, 'c': 2, 'b': 3}
od = OrderedDict([('a',1), ('b', 2),('c', 3)])
#od = OrderedDict(d)   # 失败，尚不知何故
print od
