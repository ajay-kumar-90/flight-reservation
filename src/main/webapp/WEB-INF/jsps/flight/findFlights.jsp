<%--
  Created by IntelliJ IDEA.
  User: Sangeetha Ajay
  Date: 24-06-2022
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Find Flights</title>
</head>
<body>
<form action="findFlights" method="post">
    <pre>
    <h2>Find Flights</h2>
    From: <input type="text" name="from"/>
    To: <input type="text" name="to"/>
    Departure Date: <input type="text" name="departureDate"/>
    <input type="submit" value="search"/>
    </pre>
</form>
</body>
</html>
