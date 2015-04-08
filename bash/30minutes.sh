#!/bin/bash
your_name="wangminli"
str="hello, i know you are \"$your_name\"!"
echo $str

your_name="qinjx"
greeting="hello, "$your_name" !"
greeting_1="hello, ${your_name} !"
echo $greeting $greeting_1

string="abcd"
echo ${#string} #输出 4

while true
do
	ls
done
