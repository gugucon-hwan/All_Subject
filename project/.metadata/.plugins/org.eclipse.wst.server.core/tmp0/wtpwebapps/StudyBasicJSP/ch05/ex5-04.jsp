<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
	<%
		String id;
		String passwd;
		int age;
		
		id="test";
		passwd="testpass";
		age=20;
	%>
	회원정보<hr>
	<%=id %>님의 <br> 비밀번호는 <%=passwd %>이고, 나이는 ㅣ<%=age %>입니다.
</body>
</html>