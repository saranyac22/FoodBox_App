<!DOCTYPE html>
<html>
<title>Welcome to FoodBox!</title>
<head>
<style>
body {
    background-image: url("icon.png");
}
.no-background {
    background-image: url("icon.png");
}
</style>
</head>
<meta charset="ISO-8859-1">
<body>
<div style="color:Red;font-size:20px;" align="right">
<h1>Welcome to FoodBox!</h1>
</div>
	<div align="right">
		<form action="<%=request.getContextPath()%>/login" method="post">
			<h1>User Login</h1>
			<table style="with: 100%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>

			</table>
			<input type="submit" value="Sign In" />
		</form>
			<form action="<%=request.getContextPath()%>/signup" method="post">
			<input type="submit" value="Sign Up" />
		</form>
	</div>
	<div align="left">
		<form action="<%=request.getContextPath()%>/admin" method="post">
			<h1>Admin Login</h1>
			<table style="with: 100%">
				<tr>
					<td>User Name</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>

			</table>
			<input type="submit" value="Sign In" />
		</form>
	</div>
<div style="color:Red;font-size:6px;" align="right">
</div>
</body>
</html>