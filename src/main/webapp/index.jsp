<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body>
<h2>登陆</h2>
<form action="loginController" method="post">
	<input type="text" name="userName"/>
	<input type="password" name="password"/>
	<input type="submit" value="denglu">
</form>

</body>
</html>
