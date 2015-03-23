传统版
for (var i = 0; i < myarray.length; i++) {
   // do something with myarray[i]
}

增强版
for (var i = 0; i < myarray.length; i++) {
   // do something with myarray[i]
}

 这样缓存了参数的长度，在每次迭代的时候就不用再去查找计算了。

    在查找HTML元素集合的时候，缓存参数长度可以带来可观的性能提升，Safari下面提高两倍的速度，在IE7下面提高190倍的速度。
