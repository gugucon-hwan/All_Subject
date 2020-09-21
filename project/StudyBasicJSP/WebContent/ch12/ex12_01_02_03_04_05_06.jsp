<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<%--
	1. 웹 브라우저와 서버간의 상태를 유지하기 위해 쿠키와 세션을 사용 
	쿠키는 정보를 웹브라우저에 저장하고 세션은 서버에 저장
	2. JSP에서 쿠키를 생성할 때는(Cookie)클래스를 사용
	쿠키를 생성한 후에 반드시 (response)객체의 (addCookie())메소드를 사용해서 쿠키를 추가해 주어야 한다.
	쿠키 생성 후 쿠키의 값을 새로운 값으로 지정할 때는 (setValue())메소드를 사용한다.
	3. 쿠키의 수명시간을 0으로 설정하면, 해당 쿠키를 더 이상 사용하지 않는다는 의미를 갖는다.
	4. 세션의 속성을 설정하는 메소드와 세션의 속성을 읽어오는 메소드를 기술하시오.
	session.setAttribute(), session.getAttribute();
	5.session.setAttribute("id",id);
--%>