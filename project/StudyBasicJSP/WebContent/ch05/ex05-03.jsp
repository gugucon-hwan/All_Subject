<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex5-03</title>
</head>
<body>
	<%! 
		String name="hwan";
		String getName(){
			return name;
		}
	%>
	<%
		String hobby="Reading a book";		
	%>
	이름은 <%=getName() %>이고 취미는 <%=hobby %>입니다.
</body>
</html>