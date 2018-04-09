<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="shaf" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
<title>Todo</title>
</head>
<body>
 Welcome ${name}
 <div>Todos are</div>
 <ol>
 	<shaf:forEach items="${Todos}" var="todo">
 		<li>${todo.name} &nbsp;&nbsp;&nbsp;&nbsp;<a href="/Delete-Todo.do?todo=${todo.name}">Delete</a></li>
 	</shaf:forEach>
 </ol>
 <form action="/Add-Todo.do" method="post">
 	<input type="text" name="todo"/>
 	<input type="submit" value="Add todo"/>
 </form>
 
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 
</body>
</html>