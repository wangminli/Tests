/*
 使用var声明的全局变量和没有使用var生成的全局变量还有一个区别在于删除：
    使用var声明创建的全局变量不能被删除
    没有使用var声明的全局变量可以被删除
    这说明没有使用var声明生成的全局变量不是真正的变量，他们只是全局对象的属性。属性可以通过delete删除，但是变量不行：
	http://blogread.cn/it/article/3924?f=wb
*/
// define three globals
var global_var = 1;
global_novar = 2; // antipattern
(function () {
   global_fromfunc = 3; // antipattern
}()); 
 
// attempt to delete
delete global_var; // false
delete global_novar; // true
delete global_fromfunc; // true 
 
// test the deletion
typeof global_var; // "number"
typeof global_novar; // "undefined"
typeof global_fromfunc; // "undefined"
