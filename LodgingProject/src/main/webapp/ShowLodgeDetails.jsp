<%@page import="com.krupa.web.Lodge"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Lodge log = (Lodge)request.getAttribute("log");

out.println(log);
	
%>

</body>
</html>