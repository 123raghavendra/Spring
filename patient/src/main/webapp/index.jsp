<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="ISO-8859-1"">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Index page</title>
<style type="text/css">
body {
	background-color: maroon;
	background-size: 100%;
	background-repeat: no-repeat;
}
p {
	text-align: center;
	font-size: xx-large;
	font-weight: bold;
	font-style: oblique;
}
form {
	font-size:x-large;
	font-weight: bold;
	font-style: italic;
	color: fuchsia;
}
h1 {
	text-align: center;
	font-size: xx-large;
	font-style: italic;
	font-weight: bolder;
	text-decoration: underline;
	color: fuchsia;
}
</style>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="search.jsp">SEARCH</a></li>
				
					
					
				</ul>
		
				
			</div>
		</div>
	</nav>
	<h1>Patient Information Details</h1>
	<p style="color: yellow;">${message}</p>
	<p style="color: red;">${error}</p>

	<form action="save" method="post" style="text-align: center;">
		<pre>  
	     Name   <input type="text" name="name" value=" ${dto.name}">
	
	      Email  <input type="email" name=" email "value=" ${dto.email}">
	
	       Age    <input type="number" name="age" value=" ${dto.age}">
	
              Mb-No  <input type="number" name="mobileNumber"
				value=" ${dto.age}">
	
Gender   <input type="radio" name="gender"> Male
	   <input type="radio" name="gender"> Female
	   <input type="radio" name="gender"> Other
	
	
        IdProof  <select name="idProof">
	          <option>AdharCard</option>
	          <option>VoterId</option>
	          <option>DrivingLicence</option>
	          <option>RationCard</option>
	          <option>PanCard</option>
	          <option>Passport</option>
	          </select>
	
              IdValue  <input type="text" name="idValue">
	
     BPlCard  <input type="radio" name="bplCard" value="yes"> Yes
	     <input type="radio" name="bplCard" value="No"> No
	
   Insurance <input type="radio" name="insurance"> Yes
	    <input type="radio" name="insurance"> No
	    
	    
	    <input type="submit" name="save" value="save">
	         </pre>





	</form>



	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->

	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>