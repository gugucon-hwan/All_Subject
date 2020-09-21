<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chapter4_1</title>
</head>
<body>
1.JSP 페이지에서 제공하는 세 개의 디렉티브를 나열하고, 이들이 하는 역할을 기술하시오.
page 디렉티브 - JSP페이지에 대한 정보를 정의
(생성되는 문서의 타입, 스크립팅 언어, import할 클래스, 세션 및 버퍼의 사용 여부, 버퍼의 크기등 JSP페이지에서
필요한 설정 정보를 지정한다.)

include 디렉티브 - 여러 JSP 페이지에서 공통적으로 사용되는 내용이 있을 때, 이러한 내용을 별도의 파일로 저장해 두었다가
필요한 JSP페이지 내에 삽입할 수 있는 기능을 제공한다.

taglib 디렉티브 - 표현 언어(EL), JSTL, 커스텀 태크를 JSP 페이지 내에 사용할 때 필요하다.

</body>
</html>