<%--
  Created by IntelliJ IDEA.
  User: Sangeetha Ajay
  Date: 25-06-2022
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Display Flights</title>
</head>
<body>

<table>
    <caption>Flights</caption>
    <tr>
        <%-- Heading --%>
        <th>Airline</th>
        <th>Departure City</th>
        <th>Arrival City</th>
        <th>Departure Time</th>
    </tr>

    <%-- table rows will inside for each loop --%>
    <core:forEach items="${flights}" var="flight">
        <tr>
            <!-- Data -->
            <td>${flight.operatingAirline}</td>
            <td>${flight.departureCity}</td>
            <td>${flight.arrivalCity}</td>
            <td>${flight.estimatedDepartureTime}</td>
            <td><a href="showReservation?flightId=${flight.id}">select</a></td>
        </tr>
    </core:forEach>
</table>

</body>
</html>
