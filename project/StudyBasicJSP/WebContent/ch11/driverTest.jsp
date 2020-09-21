<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
  <h2>JDBC 드라이버 테스트</h2>
  
  <%
  	Connection conn=null;
    try{
    	String jdbcUrl="jdbc:mysql://localhost:3306/basicjsp";
    	String dbId="jspid";
    	String dbpass="jsppass";
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	conn=DriverManager.getConnection(jdbcUrl,dbId,dbpass);
    	out.println("제대로 연결되었습니다.");
    }catch(Exception e){
    	e.printStackTrace();
    }
  %>