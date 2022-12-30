<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
form {
  font-weight:bolder;
  padding:10px;
  
 }
 body {
	border-left-width:200px;
	border-right-width:200px; 
	border-bottom-width:400px;
    border-color: black;
    border-style: solid;
    border-radius: 4px;

  }
  
  input-control{
  border: 2px;
  border-radius: 4px;
  
}
  








</style>

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
        <a href="index.jsp">
          <button class="btn-primary" type="submit">Home</button></a>
        </li>
      </ul>
     
    </div>
  </div>
</nav>
<p class="text-sucess" style="font-size:x-large; font-weight: bolder;">${message}</p>
<p class="text-sucess" style="font-size:x-large;  font-weight: bolder;">${error}</p>
<body>
<table class="table table-success table-striped" >
<thead>
<tr style="color: black;font-size: larger;">
<th scope="col" >id</th>
<th scope="col" >name</th>
<th scope="col" >image</th>
<th scope="col" >crime</th>
<th scope="col" >totalYearsAwarded</th>
<th scope="col" >aliasName</th>
<th scope="col" >description</th>
<th scope="col" >jailName</th>


</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="dto">
<tr>
<td>${dto.id}</td>
<td>${dto.name}</td>
<td><img alt="img" src="save/files/${dto.fileName}/?${dto.contentType}"> </td>
<td>${dto.crime}</td>
<td>${dto.totalYearsAwarded}</td>
<td>${dto.aliasName}</td>
<td>${dto.description}</td>
<td>${dto.jailName}</td>

</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>