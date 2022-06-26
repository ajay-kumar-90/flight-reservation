<%--
  Created by IntelliJ IDEA.
  User: Sangeetha Ajay
  Date: 20-06-2022
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>User login</title>
</head>
<body>
<form action="login" method="post">
<pre>
<h2>Login:</h2>
    User Name: <input type="text" name="email"/>
    Password: <input type="password" name="password"/>
    <input type="submit" value="login"/>
</pre>
</form>
${msg}
</body>
</html>
