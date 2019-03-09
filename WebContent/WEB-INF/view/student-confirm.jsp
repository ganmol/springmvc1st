<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The student is confirmed : ${student.firstName} ${student.secondName}
Language : ${student.language}

Intrests Area are :

<c:forEach  var="temp" items="${student.interests}" }>
<ul>
<li>${temp}</li>
</ul>
</c:forEach>
</body>
</html>