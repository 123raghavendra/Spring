<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Temple Information</title>
    <style type="text/css">
    body {
background-image:url("https://assets.seniority.in/media/ktpl_blog/Temples_-_main_image.jpg");
    background-repeat: no-repeat;
    background-size: 100%;
}
p {
	text-align: center;
	font-size: medium;
	font-weight: bolder;
	font-style: normal;
}
form {
	text-align: center;
	font-size:large;
	font-style: italic;
	font-weight: bold;
     color: orange;
}
h1 {
	text-align: center;
	font-size: xx-large;
	font-style: italic;
	font-weight: bold;
	text-decoration: underline;
    color: blue;
}    </style>
     </head>
  <body>
 
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
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
      </ul>
    </div>
  </div>
</nav>
  <h1 style="color: orange;">Temple Information </h1>
        <p style="color: blue;">${message }
        <p style="color: red;">${error}
   
    <form action="save" method="post" text-align: center;" > 
       <pre>
      Name:  <input type="text"  name="name"   value ="${dto.name}">
     
     Location <select name="location" value ="${dto.name}">
  
           <option>BTM</option>
           <option>UlsoorLake</option>
           <option>JayaNagar</option>
           <option> VasanthNagar</option>
           <option>UlsoorLake</option>
  </select>
  
      MainGod <select name="mainGod" value ="${dto.mainGod}">
           <option>LordRama</option>
           <option>LordHanuman</option>
           <option>LordAyyappa</option>
           <option> LordVenkatesha</option>
           <option>LordLakshmiNarasimha</option>
  </select>
  
   PinCode <select name="pinCode" value ="${dto.pinCode}">
           <option>530068</option>
           <option>560001</option>
           <option> 560002</option>
           <option> 560003</option>
           <option>560004</option>
  </select>
  
   Fees   <input type="number" name="fees" value ="${dto.fees}">
  
   OpenTime   <input type="text" name="openTime" value ="${dto.openTime}">
  
   CloseTime    <input type="text" name="closeTime" value ="${dto.closeTime}">
  
   <input type="Submit" name ="save">

    
    
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