<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="loginConf.jsp" method="post"><%--跳转到判断用户输入信息的页面 --%>
    	<table>
    		<tr>
    			<td>用户名</td>
    			<td><input type="text" name="username"/></td>
    		</tr>
    		<tr>
    			<td>密码</td>
    			<td><input type="text" name="upassword"/></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="登录"></td>
    			<td><input type="reset" value="重置"></td>
    			<td><a href="regist.jsp">注册</a></td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
