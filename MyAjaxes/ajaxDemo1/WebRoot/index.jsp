<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>AjaxDemo1</title>
	<script type="text/javascript">
		//1.创建异步请求对象
		var xmlHttp;
		function createXMLHttpRequest(){
			if(window.ActiveXObject){
				xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			else if(window.XMLHttpRequest){
				xmlHttp = new XMLHttpRequest();
			}
		}
		function showMsg(){
			//1.创建异步请求对象
			createXMLHttpRequest();
			//2.绑定ajax回调处理函数，用于处理服务器端的相应。
			xmlHttp.onreadystatechange = myFun;
			//3.建立服务器通信的连接
			xmlHttp.open("POST","message");
			//4.发送一部请求
			xmlHttp.send(null);
		}
		//5.调用回调处理函数
		function myFun(){
			if(xmlHttp.readyState==4 && xmlHttp.status==200){
				document.getElementById("d1").innerHTML = xmlHttp.responseText;
			}
		}
	</script>

  </head>
  
  <body>
  	<div id="d1"></div>
  	<a href="#" onclick="showMsg()">点我启用Ajax</a>
  </body>
</html>
