<%@ page language="java"   import="java.util.*"    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>WELCOME TO JSP</h2>
 	Hello Friends!
 	
 	
 	
 	
 	
 	
 	<h1>JSP Template</h1>
 	
 	
 	<%  int  x = 100;   %>
 	
 	Value of X : <% out.print(x); %>  <br>
 	
 	Value of X using JSP Exp : <%= x  %>  <br>
 
 	<% 
 	
 		List<String>  list = new ArrayList<String>();
 			list.add("king");
 			list.add("adam");
 			list.add("scott");
 			
 			out.print(list);
 	
 	%>
 	
 	<%! 
 	
 		int studentID;
 		String  studentName;
 	
 		static String city;
 		
 		public void m1(){
 			
 			
 		}
 	
 	%>
 
 
 
</body>
</html>