<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login</title>
</head>
<body>
<h1>Login</h1>
<s:form action="login">
<s:textfield name="username" label="username"></s:textfield>
<s:password name="password" label="password"></s:password>
<s:submit value = "submit"></s:submit>
<s:reset value= "reset"></s:reset>
</s:form>
</body>
</html>