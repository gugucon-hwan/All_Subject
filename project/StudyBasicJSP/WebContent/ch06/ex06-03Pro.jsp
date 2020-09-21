<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>화면 처리</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<%
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		
		if(id.equals("abcd")&&passwd.equals("z1234")){
			out.println("로그인에 성공하셨습니다.");
		}else{
			out.println("로그인에 실패하셨습니다.");
		}
	%>
</body>
</html>