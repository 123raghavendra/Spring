<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>success</h1>
	<p style="text-align: center; color: green;">${message}</p>
	<p>${entity}</p>
	<table class="table table- striped table dark">
		<thead>
			<tr>
				<th scope="col" style="color: black; font-size: larger;">id</th>
				<th scope="col">shopName</th>
				<th scope="col">shopAdress</th>
				<th scope="col">rent</th>
				<th scope="col">ownearName</th>
				<th scope="col">brandsAvailable</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach value="${entity}" var="entity">
				<tr>
					<td><c:out value="${entity.id}" /></td>
					<td><c:out value="${entity.shopName}" /></td>
					<td><c:out value="${entity.shopAdress}" /></td>
					<td><c:out value="${entity.rent}" /></td>
					<td><c:out value="${entity.ownearName}" /></td>
					<td><c:out value="${entity.brandsAvailable}" /></td>
					
					<!--<td>${entity.shopName}</td>
					<td>${entity.shopAdress}</td>
					<td>${entity.rent}</td>
					<td>${entity.ownearName}</td>
					<td>${entity.brandsAvailable}</td>-->
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>