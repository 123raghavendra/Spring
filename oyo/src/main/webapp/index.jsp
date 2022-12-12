<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Oyo Room Information</title>
    <style type="text/css">
    body {
    background-color:lime;
    background-repeat:no-repeat;
    background-size: 100%;
}
p {
	text-align: left;
	font-size: xx-large;
	font-weight: bold;
	font-style: oblique;
}
form {
	font-size:x-large;
	font-weight: bold;
	font-style: italic;
	color: blue;
	
}
h1 {
	text-align: justify;
	font-size: xx-large;
	font-style: italic;
	font-weight: bolder;
	text-decoration: underline;
	color:maroon;
}

    </style>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light" style="font-style: oblique;">
<img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ7Iuf9CZ4Qcl3GVmKwxXBDxASILG5e0a9iRg&usqp=CAU" height="100" width=" 200">
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
                              <h1>OYO INFORMATION</h1>
<p style="color: green;">${message}</p>
<p style="color: red;">${error}</p>
  <form  action="save" method="post" style=" text-align:left;">
  <pre>
    
             OwnerName: <input type="text"  name="ownerName" value="${dto.ownerName}">
  
            RentPerDay: <input type="text"  name="rentPerDay" value="${dto.rentPerDay}">
  
           Maintenance: <input type="radio" name="maintenance"   value="Yes" >Yes
                        <input type="radio" name="maintenance"   value="No">No
        
          NoOfWindows : <input type="text" name="noOfWindows" value="${dto.noOfWindows}">
        
            NoOfEntrys: <input type="text" name="noOfEntrys" value="${dto.noOfEntrys}"> 

          fanAvailable: <input type="radio" name="fanAvailable" value="Yes" >Yes
                        <input type="radio" name="fanAvailable"  value="No">No 
        
                Mirror: <input type="radio" name="mirror"  value="Yes">Yes
                        <input type="radio" name="mirror"   value="No">No
        
              NoOfBeds: <input type="text" name="noOfBeds" value="${dto.noOfBeds}"> 
        
                  Type: <select name="type" value="${dto.type }" >
                        <option> Luxurious Stay</option>
                        <option>NonL Luxurious Stay</option>
                        </select>
        
             RoomColour:<input type="text"  name="roomColour" value="${dto.roomColour}">
        
   
                       <input type="Submit" value="save"  class="btn-primary">
        
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