<%--
  Created by IntelliJ IDEA.
  User: Sangeetha Ajay
  Date: 25-06-2022
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Reservation</title>
</head>
<body>
Airline: ${flight.operatingAirline} <br/>
Departure City: ${flight.departureCity} <br/>
Arrival City: ${flight.arrivalCity} <br/>

<form action="saveReservation" method="post">
<pre>
<h2>Passenger Details</h2>
    First Name: <input type="text" name="firstName"/>
    Last Name: <input type="text" name="lastName"/>
    Email: <input type="text" name="email"/>
    Phone: <input type="text" name="phone"/>

    <h2>Card Details</h2>
    Name on Card: <input type="text" name="nameOnCard"/>
    Card Number: <input type="text" name="cardNumber"/>
    Expiry Date <input type="text" name="expirationDate"/>
    CVV Number <input type="text" name="securityCode"/>
    <input type="hidden" name="flightId" value="${flight.id}"/>
    <input type="submit" value="confirm"/>
</pre>
</form>

</body>
</html>
