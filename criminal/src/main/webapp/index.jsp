<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criminal Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<style type="text/css">
 form {
  font-weight:bolder;
  padding:10px;
  padding-left: 90px;
 }
 body {
	border-left-width:400px;
	border-right-width:400px; 
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
<body  style="background-color: orange;text-transform: uppercase;">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        
      </ul>
      <form class="d-flex">
        
        <a class="btn btn-primary" href="search.jsp">Search</a>
      </form>
    </div>
  </div>
</nav>

<h4 style="text-align: left;">Information Of Crime</h4>

<p class="text-sucess" style="font-size:x-large; font-weight: bolder;">${message}</p>
<p class="text-sucess" style="font-size:x-large;  font-weight: bolder;">${error}</p>

<form action="save" method="post" class="row g-3 needs-validation"  enctype="multipart/form-data">

<fieldset >

  <div class="col-md-3">
    <label for="validationCustom01" class="form-label">Name :</label>
    <input type="text" class="form-control"  name="name" required="required">
    <div class="invalid-feedback">
      Please fill the name.
    </div>
  </div><br>
  <div class="col-md-3">
    <label for="validationCustomUsername" class="form-label">Total Years Awarded :</label>
    <div class="input-group has-validation">
      <input type="number" class="form-control" id="validationCustomUsername" aria-describedby="inputGroupPrepend" required="required" name="totalYearsAwarded">
      <div class="invalid-feedback">
        Please fill the year.
      </div>
    </div>
  </div><br>
  <div class="col-md-3">
    <label for="validationCustom03" class="form-label">Alias Name :</label>
    <input type="text" class="form-control" id="validationCustom03" name="aliasName">
    <div class="valid-feedback">
    </div>
  </div><br>
  <div class="col-md-3">
    <label for="validationCustom05" class="form-label">Jail Name :</label>
    <input type="text" class="form-control" id="validationCustom05" name="jailName">
    <div class="valid-feedback">
    </div>
  </div><br>
  <div class="col-md-3">
    <label for="validationCustom04" class="form-label">Description :</label>
    
    <div>
    <textarea rows="1" name="description"  ></textarea>
    </div>
    <div class="invalid-feedback">
      Please fill the description.
    </div>
  </div><br>
  
  <div class="col-md-6" >
    <label for="validationCustom02" class="form-label">Crime :</label>
    <select name="crime" required="required">
    <option>---select---</option>
    <option>kidnaping</option>
    <option>child abuse</option>
    <option>forgery</option>
    <option>cybercrime</option>
    <option>drug use</option>
    <option>murder</option>
    <option>robbery</option>
    <option>rape</option>
    </select> 
    <div class="invalid-feedback">
      Please choose a crime.
    </div>
  </div><br>
  <div class="col-12">
    
    <input type="file" name="file">
    
  </div><br>
  <div class="col-12">
    <button class="btn btn-primary" type="submit">Submit</button>
  </div>
  </fieldset>
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
</html>