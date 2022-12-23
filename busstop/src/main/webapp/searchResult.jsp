<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search page</title>

  <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<style type="text/css">
       </style>
  </head>
  <body>
  <nav class="navbar navbar-expand-lg navbar-light bg-light" style="font-style: oblique;">
<img alt="adress is wrong" src="https://www.volvobuses.com/content/dam/volvo/volvo-buses/markets/global/en-en/news/2020/1860x1050-Volvo-Bus-KSRTC-2020.jpg" width="200" height="100">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
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
<h1>Bus Stop Information</h1>
${msg}

<table>
<thead>
<tr>
<th scope="col">BusName</th>
<th scope="col">FromStopName</th>
<th scope="col">DestinationStopName</th>
<th scope="col">NoOfBuses</th>
<th scope="col">TicketPrize</th>
<th scope="col">Maintenance</th>
</tr>

</thead>
<tbody>
<c:forEach items="${dto}" var="xyz">
<tr>
<td>${xyz.busName}</td>
<td>${xyz.fromStopName}</td>
<td>${xyz.destinationStopName}</td>
<td>${xyz.noOfBuses}</td>
<td>${xyz.ticketPrize}</td>
<td>${xyz.maintenance}</td>
</tr>
</c:forEach>
</tbody>
</table>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
  
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    
  </body>
</html>