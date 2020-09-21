<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%--
	http://localhost:8080/StudyBasicJSP/ch08/ex08-04From.jsp?id=Eunnogi&passwd=1234
	
	수행결과
	아이디 : Eunnogi
	패스워드 : 1234
	
	
	http://localhost:8080/StudyBasicJSP/ch08/ex08-04From.jsp
	
	수행결과
	아이디 : test
	패스워드 : testPass
	 --%>


    <%
    	request.setCharacterEncoding("utf-8");
    %>
    <%
    	String id="";
    	String passwd="";
    	
    	id=request.getParameter("id");
    	passwd=request.getParameter("passwd");
    	
    	if(id==null||id.equals("")){
    		id="test";
    	}
    	
    	if(passwd==null||passwd.equals("")){
    		passwd="testPass";
    	}
    %>
    
    ex08-04To.jsp 페이지로 포워딩합니다.<br>
    
    <jsp:forward page="ex08-04To.jsp">
    		<jsp:param name="id" value="<%=id %>"/>
    		<jsp:param name="passwd" value="<%=passwd %>"/>
    </jsp:forward>