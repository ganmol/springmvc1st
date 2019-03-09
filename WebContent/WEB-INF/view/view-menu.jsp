<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> MENU Page</p>


<h2>Spring MVC Demo - Home Page</h2>

<hr>

<a href="hello/showForm">Hello World form</a>

<br><br>

<a href="student/studentForm">Student form</a>

<br><br>
<a href="customer/showForm">Customer form</a>

<form method="post" action="dropDown.jsp">
<select name="sel">
<option value="Alto">Alto</option>
<option value="Esteem">Esteem</option>
<option value="Honda City">Honda City</option>
<option value="Chevrolet">Chevrolet</option>
</select>
<br>
<input type="Submit" value="Submit">
</form>


</body>
</html>