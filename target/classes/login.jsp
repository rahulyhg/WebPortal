<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Signin Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">

    
  </head>

  <body>
	<%@ page import="vit.automate.webportal.User" %>
	<%@ page import="java.util.*" %>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.util.ArrayList"%>
	<% if(request.getParameter("username") != null && request.getParameter("password") != null){				
				
				// create map to store
		        Map<String, String> param = new HashMap<String,String>();
		     
		        param.put("username", request.getParameter("username"));
		        param.put("password", request.getParameter("password"));
		        
		        try{
		        	User user = new User();
			        User current_user = user.checklogin(param);
			        session.setAttribute("user_id", current_user.getId());
		        	session.setAttribute("username", current_user.getUsername());
		        	session.setAttribute("type", current_user.getType());
		        	response.sendRedirect("dashboard.jsp");
		        } catch(Exception e){
		        	out.println(e.getMessage());
		        	response.sendRedirect("");
		        }
		        
		     	
		       
		        
		}
	%>
    <div class="container">				
      <form class="form-signin" method="POST" action="">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="Username" class="sr-only">Username</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password" required>
        
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div> <!-- /container -->


    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <!-- <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
  </body>
</html>
