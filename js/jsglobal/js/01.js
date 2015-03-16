//利用g来作为一个全局变量(glb)，在g的内部封装方法，不污染与全局的变量和方法。
var glb = (function(g/*, $*/){
	g.sayHello = function(){
		alert("hello !");
	};
	
	return g;
})(window.glb = window.glb || {}/*, jQuery*/)
