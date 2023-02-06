<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
    
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
 .navbar{
            background-color: black;
            border-radius: 30px;
            
        }
        .navbar ul{
            overflow: auto;
        }
        .navbar li{
            float:left;
            list-style: none; 
            margin: 13px 20px;
            
        }
        .navbar li a{
            padding: 3px 3px;
            text-decoration: none;
            color: white;
        }
        .navbar li a:hover{
            color: red
        }
        .search{
            float: right;
            color: white;
            padding: 12px 75px;
        }
        .navbar input{
            border: 2px solid black;
            border-radius: 14px;
            padding: 3px 17px;
            width: 129px;
        }
        
        label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}

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
<body><nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
                        <a class="nav-link" aria-current="page" href="customerhome">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="cchangepwd">Change Password</a>
                    </li>
                   
                        
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="viewcust">View Profile</a>
                    </li>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="visaapp">Apply for Visa</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="customerlogin">Logout</a>
                    </li>
                </ul>
                
            </div>
        </div>
    </nav>

    
<h2 align=center>Visa Application</h2>


<br>


<form action="addapplication" method="post" enctype="multipart/form-data">

<table align=center>

<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Gender</label></td>
<td>
<input type="radio" name="gender" value="male" required>MALE
<input type="radio" name="gender" value="female" required>FEMALE
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Date of Birth</label></td>
<td><input type="date" name="dob" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>E-mail</label></td>
<td><input type="text" name="email" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Passport Type</label></td>
<td>
<select name="passporttype" required>
<option value="-1">---Select---</option>
<option value="Ordinary">Ordinary</option>
<option value="Official">Official</option>
<option value="Diplomatic">Diplomatic</option>
</select>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Passport Number</label></td>
<td><input type="text" name="passportnumber" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Nationality</label></td>
<td><input type="text" name="nationality" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Visa Service</label></td>
<td>
<select name="visaservice" required>
<option value="-1">---Select---</option>
<option value="Tourist">Tourist</option>
<option value="Immigrant">Immigrant</option>
<option value="Student">Student</option>
<option value="Work">Work</option>
</select>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Destination</label></label></td>
<td><input type="text" name="destination"  required></td>
</tr>

<tr><td></td></tr>




<tr>
<td><label>Port of Arrival</label></td>
<td><input type="text" name="portofarrival" required></td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>Proofs</label></td>
<td><input type="file" name="Proofs" required="required"/></td>
</tr>

<tr><td></td></tr>


<tr align=center>
<td colspan=2><input type="submit" value="Submit Application" class="button"></td>
</tr>

</table>

</form>

</body>
</html>