<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Class Management</h1>
  <form action="<%= request.getContextPath() %>/class" method="post">
   <table style="with: 80%">
    <tr>
     <td>Class ID</td>
     <td><input type="text" name="classid" /></td>
    </tr>
    <tr>
     <td>Class Name</td>
     <td><input type="text" name="classname" /></td>
    </tr>
    <tr>
     <td>Teacher ID</td>
     <td><input type="text" name=teacherid /></td>
    </tr>
    <tr>
     <td>Teacher First Name</td>
     <td><input type="text" name="teacherfirstname" /></td>
    </tr>
       <tr>
     <td>Teacher Last Name</td>
     <td><input type="text" name="teacherlastname" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>