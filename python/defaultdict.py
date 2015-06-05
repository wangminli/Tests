#! /usr/bin/env python
# -*-coding:utf-8 -*-

'defaultdict,对dict添加一个默认值'
from collections import defaultdict
dd = defaultdict(lambda: '==> :no this value')
dd['key1'] = 'abc'
print dd['key1']
print dd['key2']
