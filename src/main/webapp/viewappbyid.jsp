<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Online E-Visa</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="managerhome">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="viewallcusts">View all Citizens</a>
                    </li>
                   <li class="nav-item">
                        <a class="nav-link active" href="viewallapps">View all Applications</a>
                    </li>
                        
                   
                    <li class="nav-item">
                        <a class="nav-link" href="managerlogin">Logout</a>
                    </li>
                </ul>
                
            </div>
        </div>
    </nav>

    
<br>



<br>

<h3 align=center>Welcome&nbsp;<c:out value="${manname}"></c:out></h3>

<br>

<table align=center>

<tr><th>ID:</th>&nbsp;<td>${app.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${app.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${app.gender}</td></tr>
<tr><th>Date of Birth:</th>&nbsp;<td>${app.dateofbirth}</td></tr>
<tr><th>E-Mail:</th>&nbsp;<td>${app.email}</td></tr>
<tr><th>Passport Type:</th>&nbsp;<td>${app.passporttype}</td></tr>
<tr><th>Passport Number:</th>&nbsp;<td>${app.passportnumber}</td></tr>
<tr><th>Nationality:</th>&nbsp;<td>${app.nationality}</td></tr>
<tr><th>Visa Service:</th>&nbsp;<td>${app.visaservice}</td></tr>
<tr><th>Destination:</th>&nbsp;<td>${app.destination}</td></tr>
<tr><th>Port of Arrival:</th>&nbsp;<td>${app.portofarrival}</td></tr>
&nbsp;&nbsp;&nbsp;&nbsp;<td><div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
    Status
  </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#">Accepted</a></li>
    <li><a class="dropdown-item" href="#">Rejected</a></li>
  </ul>
</div>
                    </td>


</table>



</body>
</html>

 
