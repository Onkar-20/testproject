<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

h1{
  color:red;
  font-size:3opx;
  text-align:center;

}

form{
text-align:center;
padding-top:30px;

}

input[type=text]{
font-size:30px;

}

#bt{
font-size:30px;


}

label{
font-size:30px;

}

</style>

</head>
<body>
<!--  <h1> ${u.email}  </h1>
<h1> ${u.uname}  </h1>
<h1> ${u.pass}  </h1> -->

<h1> Play Quiz  </h1>

<form action="quiz" method="post">

<label> 1. What is the framework of python  </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="q1">
<br><br>


<label> 2. In which year java is developed  </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="q2">
<br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label> 3. What is the framework of java   </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="q3">

<br><br><br><br>

<button id="bt">Submit</button>






</form>

</body>
</html>