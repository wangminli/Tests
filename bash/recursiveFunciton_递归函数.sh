#!/bin/bash
# 作用：递归函数的使用

i=1;
F(){
	let i++;
	echo $i;
	F $i;
	sleep 9;
}
# 执行F函数
F
