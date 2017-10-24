<!-- @author S�var Ingi Sigur�sson <sis108@hi.is> -->
<!-- .jsp skr� sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

	<head>
    		<title>BooksMart</title>
	</head>
	<body>

		<h1>BooksMart</h1>

		<form method="GET" action="/app/results">
			<input name="title" type="text" placeholder="Search for books..."> 
			<input type="submit" value="Search"><br>
			<input type="checkbox" value="title"> by title
			<input type="checkbox" value="course"> by Course
			<input type="checkbox" value="school"> by School
		</form>
		
		<a href="/app/"><button>Back</button></a>

	</body>

</html>