<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
     pageEncoding="ISO-8859-1" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Bikes</h2>
<table>
<tr>
<th>Bike Sno</th>
<th>Bike ModelNo</th>
<th>Bike Manufacturer</th>
<th>Bike Price</th>
</tr>

<c:forEach items="${bikes }" var="bike">
<tr>
<td>${bike.bikenNo}</td>
<td>${bike.bikeModel}</td>
<td>${bike.manufacturer}</td>
<td>${bike.price}</td>
</tr>
</c:forEach>
</table>
</body>
</html>