<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Add User</title>
</head>
<body>

	<form:form action="/FirstSpringMVC/saveUser" commandName="user">

		<%-- <form action="/FirstSpringMVC/saveUser" method="post"> --%>

		User Name : <input type="text" name="username"><form:errors path="username" />
		<br>
		User Hobby :<input type="text" name="hobby"><form:errors path="hobby" />
		<br>
		User Date : <input type="text" name="dob">
		<br>

		<form:errors path="dob" />

		<h1>Address info</h1>
	    
		Address street : <input type="text" name="address.streetAdd">
		<br>
		Address Lane :<input type="text" name="address.lane">
		<br>
		Address Pin code : <input type="text" name="address.pin">
		
		<form:errors path="address.pin" />
		<br>


		<input type="submit" name="Save">
		<br>
	</form:form>
	<%-- </form> --%>


</body>
</html>