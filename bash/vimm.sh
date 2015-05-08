#!/bin/bash
# 创建文件的同时给文件赋上权限
function vimm(){
vim $2;
chmod $1 $2
}

