<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

.error{color:red}
</style>

</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h3>Customer Registration</h3>
<form:form action="processForm" modelAttribute="customer">
	First Name(*) :<form:input path="firstName"/>
	<!-- form:errors display error message if set -->
	<form:errors path="firstName" cssClass="error"> </form:errors>
	
	Last Name :<form:input path="lastName"/>
	<br><br>
	Free Passes :<form:input path="freePasses"/>
	<form:errors path="freePasses" cssClass="error"> </form:errors>

	<br><br>
	Postal Code :<form:input path="postalCode"/>
	<form:errors path="postalCode" cssClass="error"> </form:errors>
	<br><br>
	<br><br>
	Course Code :<form:input path="courseCode"/>
	<form:errors path="courseCode" cssClass="error"> </form:errors>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>