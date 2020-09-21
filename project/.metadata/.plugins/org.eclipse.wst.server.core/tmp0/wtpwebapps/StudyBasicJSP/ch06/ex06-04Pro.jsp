<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06-04Pro.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(request.getParameter("localNum"));
		
		out.println("	<table border=1>" 
				+"<th>글번호</th>"
				+"<th>글제목</th>"
				+"<th>글내용</th>");
		for(int i=num;i>0;i--){
			out.println("<tr>"+
				"<td>"+i+"</td>"
				+"<td>제목 "+i+"</td>"
				+"<td>내용 "+i+"</td>"
				+"</tr>"				
					);
		}
		out.println("</table>");		
	%>

</body>
</html>