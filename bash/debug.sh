#!/bin/bash
# 显示调式信息，set -x  | set +x
for i in {1..6}
do
set -x
echo $i
set +x
done 
echo "Script executed"


