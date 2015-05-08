#!/bin/bash
# 作用：函数的使用
function fname(){
	echo $1;
	echo $2;
	echo $@;
	echo $*;
	return 0;
}

fname  zhangsan lisi wangwu

