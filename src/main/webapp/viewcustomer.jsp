<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Untitled</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Bitter:400,700">
    <link rel="stylesheet" href="custhome.css">
</head>

    <div>
        <div class="header-dark">
            <nav class="navbar navbar-dark navbar-expand-md navigation-clean-search">
                <div class="container"><a class="navbar-brand" href="#">Online E-Visa</a><button class="navbar-toggler" data-toggle="collapse" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse"
                        id="navcol-1">
                        <ul class="nav navbar-nav">
                            <li class="nav-item" role="presentation"><a class="nav-link" href="customerhome">Home</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="viewcust">View Profile</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="visaapp">Apply for Visa</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="cchangepwd">Change Password</a></li>
                            <li class="nav-item" role="presentation"><a class="nav-link" href="customerlogin">Logout</a></li>
                            
                        </ul>
                        </div>
                </div>
            </nav>
            <div class="container hero">
                <div class="row">
                    <div class="col-md-8 offset-md-2">
                    <h1 class="text-center">Welcome&nbsp;<c:out value="${custname}"></c:out></h1>
                        
                        
                        <table align=center>

<tr><th>ID:</th>&nbsp;<td>${cust.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${cust.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${cust.gender}</td></tr>
<tr><th>Date of Birth:</th>&nbsp;<td>${cust.dateofbirth}</td></tr>
<tr><th>Designation:</th>&nbsp;<td>${cust.typeofvisa}</td></tr>
<tr><th>Location:</th>&nbsp;<td>${cust.location}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${cust.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${cust.contactno}</td></tr>



</table>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>




</body>
</html>

 
