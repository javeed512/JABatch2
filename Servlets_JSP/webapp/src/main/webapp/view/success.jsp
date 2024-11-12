<%@ page language="java" import="java.util.* , com.hexaware.entity.*"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to Success Page</h1>

<%

  List<Employee> list = (List<Employee>)	 session.getAttribute("empList");


		out.print(list);
%>



</body>
</html>