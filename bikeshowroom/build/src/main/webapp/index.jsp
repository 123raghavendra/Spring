<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Bike Information</title>
     <style type="text/css">
    body {
	background-color: green;
background-image:url("https://wallpapercave.com/wp/wp9343692.jpg");
    background-repeat:no-repeat;
    background-size: 100%;
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
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark" style="font-style: oblique;">
  <img alt="" src="https://th.bing.com/th/id/OIP.Mp0cCCo0I7N5bfbcbfbNCAHaEo?w=292&h=182&c=7&r=0&o=5&pid=1.7" width="150" height="75" >
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
       
        </li>
      </ul>
    </div>
  </div>
</nav>
<h1>Bike ShowRoom Information</h1>
<p style="color:yellow; ">${message}</p>
<p style="color: red;">${error}</p>
    
  <form  action="save" method="post" style=" text-align: center;">
      <pre>
  Brand :      <input type="text" name="brand" value="${dto.brand}">
  
  ownerName:   <input type="text" name="ownerName" value="${dto.ownerName}">
  
  Location:    <input type="text" name="location" value="${dto.location}">
  
  Ambassador:  <input type="text" name="ambassador" value="${dto.ambassador}">
  
  Description: <input type="text" name="description" value="${dto.description}">
  
     <input type="submit" value="submit" class="btn-primary">
         <!-- -  <button type="button" class="btn btn-primary" value="save">Submit</button> --->
    
     </pre>
    
    
    
    
    </form>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>