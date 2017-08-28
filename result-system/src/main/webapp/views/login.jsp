<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

	<form action="s_login" method="post">
		<div align="center"><font color="red">${error}</font></div>
		<table>
			<tr><td>User Name:</td>
			<td><input type="text" name="login" /></td></tr>
			<tr><td> Password:</td>
			<td><input type="password" name="password" /></td></tr>
			<tr><td colspan="2"><input type="submit" value="login" /></td></tr>
		</table>
	</form>
</div>
</body>
</html>