# get bash
---
- 查看终端进程相关的环境变量  
`env`
- 查看系统变量 
```
at /proc/$PID/environ
```  

上面的显示使用null（\0）分割，将\0替换成\n，可以使用tr命令实现：  
```
at /proc/$PID/environ | tr '\0' '\n'
``` 
查找$PID可以使用pgrep。   
- 获得字符长度  
`length=${#var}`  
如：  
```
var=1234567890
echo ${#var}	#10
```














-----
# Q
- 如何遍历数组？
