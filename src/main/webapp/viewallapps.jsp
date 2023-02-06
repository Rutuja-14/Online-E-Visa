<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>

.button {
  background-color: grey;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

</style>
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
                        <a class="nav-link active" href="viewallapps">View all Application</a>
                    </li>
                        
                  
                    <li class="nav-item">
                        <a class="nav-link" href="managerlogin">Logout</a>
                    </li>
                </ul>
                
            </div>
        </div>
    </nav>

      

<br>



<br><br>

<h3 align=center>View All applications</h3>

<table align=center border=2>

<tr class="header">

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>E-mail</th>
<th>Passport Type</th>
<th>Passport Number</th>
<th>Nationality</th>
<th>Visa Service</th>
<th>Destination</th>
<th>Port of Arrival</th>
<th>Status</th>
<th>Approved</th>
<th>Declined</th>

</tr>

<c:forEach items="${applist}" var="app">

<tr>

<td> <c:out value="${app.id}"></c:out>   </td>
<td> <c:out value="${app.name}"></c:out>   </td>
<td> <c:out value="${app.gender}"></c:out>   </td>
<td> <c:out value="${app.dateofbirth}"></c:out>   </td>
<td> <c:out value="${app.email}"></c:out>   </td>
<td> <c:out value="${app.passporttype}"></c:out>   </td>
<td> <c:out value="${app.passportnumber}"></c:out>   </td>
<td> <c:out value="${app.nationality}"></c:out>   </td>
<td> <c:out value="${app.visaservice}"></c:out>   </td>
<td> <c:out value="${app.destination}"></c:out>   </td>
<td> <c:out value="${app.portofarrival}"></c:out>   </td>
<td> <c:out value="${app.status}"></c:out>   </td>
<td>

</td>
<td> 

<a href='<c:url value='updateapp?id=${app.id}'></c:url>'>Approved</a>&nbsp;&nbsp;
<a href='<c:url value='updateappdec?id=${app.id}'></c:url>'>Declined</a>&nbsp;&nbsp;
</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
