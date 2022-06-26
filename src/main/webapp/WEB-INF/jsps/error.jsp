<%--
  Created by IntelliJ IDEA.
  User: Sangeetha Ajay
  Date: 25-06-2022
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Sorry! Something went wrong... </title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<div class="container p-3 text-center">
    <img src="image/error.png" alt=
            "error in page" class="img-fluid">

    <h1 class="display-3">Sorry Something went Wrong</h1>
    <p>${exceptionMsg}</p>
    <a class="btn btn-outline-primary" href=registerUser>Register Again</a>
</div>
</body>
</html>
