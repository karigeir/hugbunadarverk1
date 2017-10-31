<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="/BooksMart/BooksMart.css" type="text/css">

<html lang="en">

	<head>
    		<title>BooksMart</title>
	</head>
	<body>

		<h1>Login</h1>
		
		<c:if test="${not empty error}"><div>${error}</div></c:if>
		<c:if test="${not empty message}"><div>${message}</div></c:if>

		<form method="POST" action="/app/confirm">
			Username: <input name="username" type="text" placeholder="Joe Doeson" required/><br>
			Password: <input name="pw" type="password" required/><br>
			<input type="submit" value="Confirm"/>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
		<a href="/app/"><button>Back</button></a>


	</body>

</html>