<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>

<style>
body {
    background-image: url("user.png");
}
.no-background {
    background-image: url("user.png");
}
</style>

</head>
<body>
 <div align="center">
  <h1>New User Registration</h1>
  <form action="<%= request.getContextPath() %>/signupuser" method="post">
   <table style="with: 80%">
    <tr>
     <td>User ID</td>
     <td><input type="text" name="userid" /></td>
    </tr>
     <tr>
     <td>Password</td>
     <td><input type="text" name="password" /></td>
    </tr>
    <tr>
     <td>First Name</td>
     <td><input type="text" name="fname" /></td>
    </tr>
    <tr>
     <td>Last Name</td>
     <td><input type="text" name="lname" /></td>
    </tr>
    <tr>
     <td>Email ID</td>
     <td><input type="text" name="emailid" /></td>
    </tr>
    <tr>
     <td>Contact Number</td>
     <td><input type="text" name="contactno" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>