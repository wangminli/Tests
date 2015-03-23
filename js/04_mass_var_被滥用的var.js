### 滥用了的var

    JavaScript允许你在函数内部有多个var语句，但是却都表现的如同在函数的顶部声明一样。这个特性在你使用一个变量然后在后面又声明了这个变量时会导致一些奇怪的逻辑问题。对于JavaScript来说，只要变量在同一个作用域，那么就认为是声明了的，就算是在var语句之前使用也一样。看看这个例子：

myname = "global"; // global variable
function func() {
    alert(myname); // "undefined"
    var myname = "local";
    alert(myname); // "local"
}
func();

   在这个例子中，或许你期望第一次会弹出global，第二次弹出local。因为第一次的时候没有还没有使用var声明myname，这是应该是全局变量的myname，第二次声明了，然后alert之后应该是local的值。而事实上不是这样的，只要你在函数中出现了var myname，那么js就认为你在这个函数中声明了这个变量，但是在读取这个变量的值的时候，因为var语句还没有执行，所以是undefined，很奇怪的逻辑吧。上面的代码相当于：

myname = "global"; // global variable
function func() {
   var myname; // same as -> var myname = undefined;
   alert(myname); // "undefined"
   myname = "local";
   alert(myname); // "local"
}
func();
    我们来解释一下这个现象，在代码的解析中，分两个步骤，第一步先处理变量函数的声明，这一步处理整个代码的上下文。第二步就是代码的运行时，创建函数表达式以及未定义的变量。实际上，我们只是假设了这个概念，这并不在ECMAScript的规范中，但是这个行为常常就是这样解释的。
