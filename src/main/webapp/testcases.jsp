<%@page import="java.util.StringTokenizer"%>
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

    <title>WebPortal Automation Dashboard</title>
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/offcanvas.css" rel="stylesheet">

   
  </head>

  <body>
 <%@ page import="vit.automate.webportal.ListTestCases" %> 
  <%@ page import="java.util.List" %>
  <% 
  	if(session.getAttribute("user_id") == null){
  		response.sendRedirect("login.jsp");
  	}   
  
  	List<String> cases = new ListTestCases().testCases(); 
  	
  	/* if(cases.isEmpty()){
  		out.println("No TEst Cases Available");
  		System.exit(0);
  	} */
  
  %>  
    <nav class="navbar navbar-fixed-top navbar-inverse">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="dashboard.jsp">Web Portal Automation</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">                                          
            <li><a href="testcases.jsp">TestCases</a></li>
            
            <li class="dropdown">
              <a id="drop2" href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" role="button" aria-expanded="false">
                Employees
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu" aria-labelledby="drop2">
                <li role="presentation"><a role="menuitem" tabindex="-1" href="create_employee.jsp">Create</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="employees.jsp">List</a></li>               
                <li role="presentation" class="divider"></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Approved schedule</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a id="drop2" href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" role="button" aria-expanded="false">
                Schedule
                <span class="caret"></span>
              </a>
              <ul class="dropdown-menu" role="menu" aria-labelledby="drop2">
                <li role="presentation"><a role="menuitem" tabindex="-1" href="schedule.jsp">Create</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="https://twitter.com/fat">List</a></li>               
                <li role="presentation" class="divider"></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="https://twitter.com/fat">Approved schedule</a></li>
              </ul>
            </li>
            <li><a href="logout.jsp">LogOut</a></li>
            <li><a href="report.jsp">View Report</a></li>
          </ul>
          
          
        </div><!-- /.nav-collapse -->
      </div><!-- /.container -->
    </nav><!-- /.navbar -->
	
    <div class="container"> 
    	<div class = "row">
    		 
   				<h2 class="text-center">TestCases Available</h2>
			   
    	</div>          
		<div class = "row">		
   		<div class="col-lg-10 col-lg-offset-1">     		   
		<table class="table table-hover">
		<form method = "POST" action = "runTestcases.jsp">
	      <thead>
	        <tr>
	          <th>	          
	          	<a class="btn btn-default pull-left" href="#" role="button">Select All</a>
	          </th>
	          <th>S.N</th>
	          <th>File Name</th>
	          <th>TestCase Name</th>
	          <th>Status</th>
	          <th>	          
	          	<button onclick="$(this).closest('form').submit()">Run</button>
	          </th>
	        </tr>
	      </thead>
	      <tbody>	      
	      <% int count = 1;for(String filename : cases){ 
	    	StringTokenizer token =  new StringTokenizer(filename,".");
	    	String testcase_name = token.nextToken();
	    	  %>
		    <tr class="success">
		      <th><div class="checkbox">
			  <label>
			    <input type="checkbox"  name = "TestCases" value="<% out.println(testcase_name); %>">			    
			  </label>
			</div></th>
	          <th scope="row"><% out.println(count++); %></th>
	          <td><% out.println(filename); %></td>
	          <td><% out.println(testcase_name); %></td>
	          <td><% out.println("NOT ADDED"); %></td>
	          <td>
	          	<div class="btn-group">
				  <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
				    Action <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu" role="menu">
				    <li><a href="#">Add Testcase</a></li>
				    <li><a href="#">RunTestcase</a></li>					    
				    <li class="divider"></li>
				    <li><a href="#">Separated link</a></li>
				  </ul>
				</div>
	          </td>
	        </tr>
	        
	        <% } %>  			     
	        
	      </tbody>
	</form>
    </table>
    </div>
    
    </div>
    </div><!--/.container-->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    

  </body>
</html>
