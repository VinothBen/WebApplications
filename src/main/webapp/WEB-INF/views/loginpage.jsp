<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<body>
	<center>
		<form action="add" name="loginpage" method="POST">
			<table border="5">
				<h1 style="color: blue">LogPage.....Updated</h1>
				<tr>
					<td>LiginId:<input type="text" name="loginId" required /></td>
				</tr>
				<br>
				<tr>
					<td>LoginName:<input type="text" name="name" required /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
		<tr>
			<td><h2 style="color: green">${msg}</h2></td>
		</tr>
	</center>
</body>
</html>