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

    <title>Manager Login</title>
</head>
<style>

.btn{
    border: none;
    border-radius: 5px;
    color: #fff;
    text-transform: uppercase;
    padding-bottom: 15px;
    position: relative;
    background-image: linear-gradient(to top, #262626 0px, #404040 10px, #262626 10px, #333 100%);
}
.btn:hover{
    color: #fff;
}
.btn:after{
    content: "";
    width: 0;
    height: 10px;
    position: absolute;
    bottom: 0;
    left: 0;
    border-radius: 0 0 5px 5px;
    transition: all 0.35s ease 0s;
}
.btn:hover:after{
    width: 100%;
}
.btn.btn-sm{
    padding-bottom: 10px;
    background-image: linear-gradient(to top, #262626 0px, #404040 8px, #262626 8px, #333 100%);
}
.btn.btn-sm:after{
    height: 8px;
}
.btn.btn-xs{
    padding-bottom: 8px;
    background-image: linear-gradient(to top, #262626 0px, #404040 6px, #262626 6px, #333 100%);
}
.btn.btn-xs:after{
    height: 6px;
}
.btn.red:after{
    background: #ff6e6e;
}
.btn.blue:after{
    background: #5cbcf6;
}
.btn.orange:after{
    background: #ef965c;
}
.btn.green:after{
    background: #7ad79a;
}
@media only  screen and (max-width: 767px){
    .btn{ margin-bottom: 20px; }
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
                        <a class="nav-link active" aria-current="page" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/about.jsp">About</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            Login
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="customerlogin.jsp">Customer</a></li>
                            <li><a class="dropdown-item" href="managerlogin.jsp">Manager</a></li>
                            <li><a class="dropdown-item" href="accountantlogin">Accountant</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/contact.jsp">Contact Us</a>
                    </li>
                </ul>
                
            </div>
        </div>
    </nav>

    <h3 align=center>Manager Login</h3>

<br>
<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>
</span>
<br>

<form method="post" action="checkmanlogin">

<table align=center>

<tr>
<td><label>Username</label></td>
<td><input type="text" name="manname" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="manpwd" required></td>
</tr>

<tr><td></td></tr>

<tr align=center>

<td colspan="2"><input type="submit" value="Login" class="container row col-sm-3 btn btn-sm red"></td>

</tr>

</table>

</form>
</body>
</html>