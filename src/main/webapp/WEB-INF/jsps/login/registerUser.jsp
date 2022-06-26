<%--
  Created by IntelliJ IDEA.
  User: Sangeetha Ajay
  Date: 19-06-2022
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register User</title>
</head>
<body>
<form action="registerUser" method="post">
<pre>
    <h2>User Registration</h2>
First Name: <input type="text" name="firstName"/>
Last Name:    <input type="text" name="lastName"/>
User Name:    <input type="text" name="email"/>
Password:    <input type="password" name="password"/>
Confirm Password: <input type="password" name="confirmPassword"/>

    <input type="submit" value="register"/>
</pre>
</form>
</body>
</html>
