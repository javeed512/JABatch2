<%@ page language="java"   isELIgnored="false"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

JSP Scriplet:
<%
	String uname = (String)	session.getAttribute("uname");

		out.print(uname);
%>
<br>
JSP Expression:

<%=  session.getAttribute("uname") %>

<br>
EL-Expression:
 ${uname}                   <!--   session.getAttribute(k);  -->


</body>
</html>