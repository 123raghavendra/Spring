<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">



<title>Cake Information</title>
<style type="text/css">
body {
	background-image:
		url("https://t4.ftcdn.net/jpg/03/08/40/43/360_F_308404381_LqyMIXDPOR6Ut1TqE2cJRQdxomGsQegc.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
p {
	text-align: center;
	font-size: xx-large;
	font-weight: bold;
	font-style: oblique;
}


</style><!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
	<nav class="navbar navbar-expand-lg navbar-light bg-info">
		<div class="container-fluid">
		
			<button class="navbar-toggler" type="button"
				
				
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarScroll">
				<ul class="navbar-nav me-auto my-2 my-lg-0 navbar-nav-scroll"
					style="-bs-scroll-height: 100px;">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
              <a class="nav-link active" aria-current="page" href="search.jsp">SEARCH</a>
						
						

					<li class="nav-item dropdown">



						<ul class="dropdown-menu"
							aria-labelledby="navbarScrollingDropdown">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul>
					</li>

				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>


	<form action="save" method="post" style="text-align: center;">
	<p style="color: green;"> ${message}</p>
	<p style="color: red;"> ${error} </p>

          <h1 style="text-align: center;color:white">CAKE INFORMATION</h1>
<div style="padding-bottom: 10px;color:white;font-weight:bold">
	<pre>
    CAKEFLAVOUR<input type="text" name="cakeFlavour" value="${cakeEntity.cakeFlavour} ">

     CAKECOLOR<input type="text" name="cakeColour" value="${cakeEntity.cakeColour}">

          PRICE<input type="text" name="price" value="${cakeEntity.price}">

            KG <input type="text" name="kg" value="${cakeEntity.kg}">
            
               <input class="btn btn-primary" type="submit" value="SUBMIT">
            
</pre>
</div>
</form>
</body>
</html>