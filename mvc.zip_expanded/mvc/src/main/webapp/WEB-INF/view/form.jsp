<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

h1{

font-size:40px;
text-align:center;
color:red;

}

form{

text-align:center;
padding-top:40px;


}

.container{

padding-top:80px;
border:3px solid black;
border-radius:6px;
padding-bottom:30px;

}

#log{

font-size:30px;
background-color:pink;
border:2px solid black;
border-radius:6px;

}

#log:hover{
background-color:green;

}

input[type=text]{

font-size:20px;
background-color:lightblue;


}

input[type=password]{

font-size:20px;
background-color:lightblue;


}








</style>

</head>
<body>
<form action="modelattribute" method="post">
<h1>  Registration Form   </h1>
<br>
<hr>
<div class="container">
<b>Enter Email</b> :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="email">
<br><br><br><br>
<b>Enter UserName </b>:&nbsp;&nbsp;&nbsp; <input type="text" name="uname">
<br><br><br><br>
<b>Enter Password </b> :&nbsp;&nbsp;&nbsp;&nbsp; <input type="password" name="pass">
<br><br><br><br>
<input type="submit" value="Login" id="log">
</div>
<hr>
</form>
</body>
</html>