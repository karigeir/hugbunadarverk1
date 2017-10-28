<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- .jsp skrá sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

	<head>
    		<title>BooksMart</title>
	</head>
	<body>

		<h1>Advanced search</h1>

		<form method="GET" action="/app/test">
			<input name="title" type="text" placeholder="Title...">
			<input name="edition" type="number" min=1 max=99 placeholder="Ed.">
			<input name="author" type="text" placeholder="Author...">
			<input type="submit" value="Search"><br>
			<!-- <select name="dd_school">
				<c:forEach var="school" items="${schools}">
					<option value="${school.getId()}">${school.getName()}</option>
				</c:forEach>
			</select>  -->
		</form>
		
		<a href="/app/"><button>Back</button></a>

	</body>

</html>