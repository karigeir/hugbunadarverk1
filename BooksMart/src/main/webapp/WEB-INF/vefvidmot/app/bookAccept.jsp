<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<title>Book added</title>
	</head>
	<body>
		<h3>${book.getTitle()} successfully added to database.</h3>
		<a href="/app/"><button>Go back to front page</button></a>
		
		

	</body>
</html>