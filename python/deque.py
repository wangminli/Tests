#! /usr/bin/env python
# -*-coding:utf-8 -*-

'deque,collections中的类。deque 是为了高效实现插入和删除操作的双向列表,适合用于队列和栈'

from collections import deque
d = deque(['a', 'b', 'c'])
d.append('x')
d.appendleft('y')

print d

d.pop()
d.popleft()
print d
