<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form action="processForm" modelAttribute="student">

FirstName :<form:input path="firstName"/>

<br><br>

LastName : <form:input path="secondName"/>

<br><br>

Country :  <form:select path="country">
<form:options items="${student.countryOptions}"/>

</form:select>

<br> <br>
Launguage known
Hindi <form:radiobutton path="language" value="Hindi"/>
English  <form:radiobutton path="language" value="English"/>
Both <form:radiobutton path="language" value="Both"/>
<br><br>

Intrests Area:

 Intrests1  <form:checkbox path="interests" value="Intrests1"/>
 Intrests2  <form:checkbox path="interests" value="Intrests2"/>
 Intrests3 <form:checkbox path="interests" value="Intrests3"/>
 Intrests4 <form:checkbox path="interests" value="Intrests4"/>
 Intrests5 <form:checkbox path="interests" value="Intrests5"/>
<br><br>
<input type="submit" value="submit">

</form:form>

</body>
</html>