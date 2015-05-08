#!/bin/bash
# 作用：函数的使用
function fname(){
	echo $1;
	echo $2;
	echo $@;
	echo $*;
#	return 0;
	return $?;  #给出命令的返回值
}

# 使用函数
fname  zhangsan lisi wangwu

# 导出函数，这样函数的作用域可以扩展到子进程中
export -f fname
