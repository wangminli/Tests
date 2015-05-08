#!/bin/bash
# 作用：遍历array数组
arr=(1 2 3 4 5 6);  #没有逗号

echo "--数组长度--"
echo ${#arr[*]}

echo "---"

echo "--遍历数组--"
echo '0. 使用${arr[0]}' 
echo ${arr[0]}
echo ${arr[1]}
echo ${arr[2]}
echo ${arr[3]}
echo ${arr[4]}
echo ${arr[5]}

echo ""

echo '1. for i in ${arr[@]};'
for i in ${arr[@]};
do 
	echo $i;
done

echo ""

echo '2. ${arr[*]}'
echo ${arr[*]}

echo ""

echo '3. ${arr[@]}'
echo ${arr[@]}

echo ""
# 列出数组索引
echo ${!arr[@]}
echo ${!arr[*]}
