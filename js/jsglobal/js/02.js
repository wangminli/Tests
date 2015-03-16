//利用g来作为一个全局变量(glb)，在g的内部封装方法，不污染与全局的变量和方法。
var g = (function(g/*, $*/){
	g.goodbye =function(){
		alert("goodbye");
	};

	return g;
})(window.glb = window.glb || {}/*, jQuery*/)
