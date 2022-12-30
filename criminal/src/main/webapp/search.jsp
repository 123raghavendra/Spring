<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
form {
  font-weight:bolder;
  padding:30px;
  padding-left: 50px;
  
 }
 body {
	border-left-width:400px;
	border-right-width:400px; 
	border-bottom-width:400px;
    border-color: maroon;
    border-style: solid;
    border-radius: 4px;
  }
  

  
</style>
</head>
<body style="background: orange; text-transform: uppercase;">
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
      <form class="d-flex">
      </form>
    </div>
  </div>
</nav>
<p class="text-sucess" style="font-size:x-large; font-weight: bolder;">${message}</p>
<p class="text-danger" style="font-size:x-large;  font-weight: bolder;">${error}</p>


<form action="save" method="get" >

<pre>
	


Name :<input type="text" class="name" name="name" /><br>

JailName:<input type="text"  class="jailName" name="jailName" /><br>

<input type="submit" class="btn btn-primary" value="search"/>
</pre>
</form>
<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
</body>
</head>
</html>