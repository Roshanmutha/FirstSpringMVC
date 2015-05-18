<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>User Information ${msg}</h2>

	User Name : ${user.username} <br>
	User Hobby : ${user.hobby}<br>
	User Date : ${user.dob}<br>
		
	<h1>Address info</h1>
	    
		Address street : ${user.address.streetAdd}<br>
		Address Lane :${user.address.lane}<br>
		Address Pin code : ${user.address.pin}<br>
	<br>
</body>
</html>	