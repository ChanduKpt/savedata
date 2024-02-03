<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	label{
		color: red;
	}
	body {
		color: blue;
	}
	 
</style>
</head>
<body>
	<form action="save" method="post">
	<pre>
			  <label>LOGIN FORM</label>
	USERNAME :<input type="text" name="uname"><br/>
	PASSWORD :<input type="text" name="pwd"><br/>
	          <input type="submit" value="login">
	</pre>
	</form>
</body>
</html>