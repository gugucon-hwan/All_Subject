<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String realFolder="";//웹 어플리케이션상의 절대 경로
	
	//파일이 업로드되는 폴더를 지정한다.
	String saveFolder="/fileSave";
	String encType="utf-8";
	int maxSize=5*1024*1024;//최대 업로드될 파일크기 5mb
	
	ServletContext context=getServletContext();
	//현재 jsp 페이지의 웹 어플리케이션상의 절대 경로를 구한다.
	realFolder=context.getRealPath(saveFolder);
	out.println("the realpath is : "+realFolder+"<br>");
	
	try{
		MultipartRequest multi=null;
		
		//전송을 담당할 컴포넌트를 생성하고 파일을 전송한다.
		//전송할 파일명을 가지고 있는 객체, 서버상의 절대 경로, 최대 업로드될 파일 크기, 문자 코드, 기본 보안 적용		
		multi=new MultipartRequest(request,realFolder,maxSize,encType,new DefaultFileRenamePolicy());
		
		//Form의 파라미터 목록을 가져온다.
		Enumeration<?> params = multi.getParameterNames();//폼의 요소들 중 <input type="file"> 아닌 파라미터들을 Enumeration객체 타입으로 리턴한다.
		
		//파라미터를 출력한다.
		while(params.hasMoreElements()){
			String name=(String)params.nextElement();//전송되는 파라미터이름
			String value=multi.getParameter(name);//전송되는 파라미터값
			out.println(name+" = "+value+"<br>");			
		}//while
		
		out.println("--------------------------<br>");
		
		//전송한 파일 정보를 가져와 출력한다.
		Enumeration<?> files=multi.getFileNames();//폼의 요소들 중 <input type="file">로 된 파라미터들을 받아서 Enumeration타입의 객체를 리턴한다.
		
		//파일 정보가 있다면
		while(files.hasMoreElements()){
			//input태그의 속성이 file인 태그의 name속성값 : 파라미터이름
			String name=(String)files.nextElement();
		
			//서버에 저장된 파일 이름
			String filename=multi.getFilesystemName(name);
			
			//전송전 원래의 파일 이름
			String original =multi.getOriginalFileName(name);
			
			//전송된 파일의 내용 타입
			String type=multi.getContentType(name);
			
			//전송된 파일 속성이 file인 태그의 name속성값을 이용해 파일 객체 생성
			File file=multi.getFile(name);
			
			out.println("파라메터 이름 : "+name+"<br>");
			out.println("실제 파일 이름 : "+original+"<br>");
			out.println("저장된 파일 이름 : "+filename+"<br>");
			out.println("파일 타입 이름 : "+type+"<br>");
			
			if(file!=null){
				out.println("크기 : "+file.length());
				out.println("<br>");
			}//if
		}//while
	}catch(IOException ioe){
		System.out.println(ioe);
	}catch(Exception ex){
		System.out.println(ex);
	}

%>
