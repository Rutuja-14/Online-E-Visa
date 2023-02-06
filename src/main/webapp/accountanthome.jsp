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
                        <a class="nav-link active" aria-current="page" href="accountanthome">Home</a>
                    </li>
                    <!--<li class="nav-item">
                        <a class="nav-link" href="viewallcusts">View All Citizens</a>
                    </li>-->
                   <li class="nav-item">
                        <a class="nav-link" href="viewallmans">View All Managers</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="addmanager">Add Manager</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="viewallcusts">View All Customers</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="accountantlogin">Logout</a>
                    </li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
                <div class="mx-2">
                    <button class="btn btn-secondary" data-bs-toggle="modal" data-bs-target="#loginModal">Login</button>
                    <button class="btn btn-success" data-bs-toggle="modal" data-bs-target="#signupModal">SignUp</button>

                </div>
            </div>
        </div>
    </nav>

    

<h3 align=center>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>

</body>
</html>