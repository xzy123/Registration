<%@ page language="java" import="java.util.* , java.sql.* , regist.model.* ,regist.action.*"
	pageEncoding="GB18030"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
	+ request.getServerName() + ":" + request.getServerPort()
	+ path + "/";
	
	User user = new User();
	user.setUsername(request.getParameter("username"));
	user.setPassword(request.getParameter("password"));
	
	registerAction service = new registerAction();
%>


