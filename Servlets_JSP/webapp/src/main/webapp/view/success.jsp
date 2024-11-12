<%@ page language="java"  isELIgnored="false" import="java.util.* , com.hexaware.entity.*"  contentType="text/html; charset=UTF-8"
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


		//out.print(list);
%>
<br>
  ${empList}
<br>
	<table  style="background-color:yellow"  border="1">
	
	 <tr><th>EID</th><th>ENAME</th><th>SALARY</th></tr>
	
	<% 
	
		
			for(Employee emp: list){
			
			out.print("<tr> <td>"+emp.getEid()+"</td><td>"+emp.getEname() +"</td><td>"+ emp.getSalary()+"</td> </tr>");
			
			}
	
	%>  		
		
			
	
	</table>



</body>
</html>