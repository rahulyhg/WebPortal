<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="vit.automate.webportal.TestSuite" %>
<% 
/* if(session.getAttribute("user_id") == null){
	response.sendRedirect("login.jsp");
} */
if("POST".equalsIgnoreCase(request.getMethod())){
	String[] testcases;
	
	testcases = request.getParameterValues("TestCases");
	
	//out.println(testcases);

	for(String testcase : testcases){
		out.println(testcase);
	}  		
	
	TestSuite test = new TestSuite(testcases);
	
	//test.test();
			
} else {
	response.sendRedirect("testcases.jsp");
}
%> 
</body>
</html>