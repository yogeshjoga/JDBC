<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Login" method="post">
		<table>

			<tr>
				<td>User Name</td>
				<td><input type="text" name="Username"></td>
			</tr>
			<tr>
				<td>PassWord</td>
				<td><input type="password" name="password"></td>
			</tr>
			
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="Phone"></td>
			</tr>
			
			<tr>
				<td>Email Address</td>
				<td><input type="text" name="email"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Signup"></td>
			</tr>
		</table>
	</form>

</body>
</html>