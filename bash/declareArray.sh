#!/bin/bash
# 作用：使用关联数组
# 声明关联数组
declare -A ass_array
# 使用索引-值列表法对整体赋值
ass_array=([index1]=val1 [index2]=val2)
# 使用索引-值赋值
ass_array[index3]=wangminli
echo ${ass_array[index2]}
echo ${ass_array[index3]}


