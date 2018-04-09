<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP</title>
</head>
<body>
<%
System.out.println("test of java code");
Date date = new Date();
String name = request.getParameter("name");
%>
<div>Current Date is <%=date%></div>
<div>Parameter passed is <%=name%></div>
<div>My First JSP ${name}</div>
</body>
</html>