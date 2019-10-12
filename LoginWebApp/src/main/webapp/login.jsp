<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${loginerror}
	<form action="login">
	 	<p>username:
  		<input type="text" name="username" placeholder="enter username"></p>
  		<p>password:
 		<input type="password" name="password" placeholder="enter password"></p>
 		<p>
  	   		 <input type="submit" value= "Login">
  	    </p>
	</form>
</body>
</html>