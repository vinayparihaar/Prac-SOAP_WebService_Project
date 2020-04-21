<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
	String name = (String)request.getAttribute("username");
	String email = (String)request.getAttribute("email");
	String password =(String) request.getAttribute("password");
	if (name != null) {
	%>
	<div style="text-align: center; color: red"><%=name%></div>
	<%
		}
	if (email != null) {
	%>
	<div style="text-align: center; color: red"><%=email%></div>
	<%
		}
	if (password != null) {
	%>
	<div style="text-align: center; color: red"><%=password%></div>
	<%
		}
	%>

	<form name="registrationform" action="./register" method="post">
		<table align="center">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>


			<tr>
				<td></td>
				<td><input type="submit" value="Register"></input></td>
			</tr>
		</table>
	</form>
</body>


</html>