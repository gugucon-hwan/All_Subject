<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page errorPage="error.jsp"    	
    %>
    
    <%
    	Date date = new Date();
    	SimpleDateFormat simpleDate= new SimpleDateFormat("yyyy-MM-dd");
		String strdate=simpleDate.format(date);    	
    %>
    보통의 JSP 페이지의 형태입니다.<br>
    
    오늘 날짜는 <%=strdate%>입니다.