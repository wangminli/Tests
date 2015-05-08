#!/bin/bash
# 作用：使用关联数组
# 声明关联数组
declare -A ass_array
# 使用索引-值列表法对整体赋值
ass_array=([index1]=val1 [index2]=val2)

# 使用索引-值赋值
ass_array[index3]=wangminli
ass_array[zhang]=zhangsan

echo ${ass_array[index2]}
echo ${ass_array[index3]}
echo ${ass_array[zhang]}

declare -A fruit_value
fruit_value=([apple]="21 dollars" [orange]="25 dollars")
fruit_value[banana]="30 dollars"

echo "Apple costs ${fruit_value[apple]}"
echo "Banana costs ${fruit_value[banana]}"

# 列出数组中的值
echo ${fruit_value[*]}
echo ${fruit_value[@]}
# 列出数组索引，注意不是列出其值
echo ${!fruit_value[*]}
echo ${!fruit_value[@]}
