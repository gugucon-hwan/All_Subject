<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>whileTest.jsp</title>
</head>
<body>
	<%
		int i=0;
		while(i<10){//0~9까지 값이 출력된다.
			out.println("출력되는 값 : "+i+"<br>");
			i++;
		}
	%>
</body>
</html>