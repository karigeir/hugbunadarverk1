<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- .jsp skrá sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
<title>Booksmart</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Lato|Merriweather"
	rel="stylesheet">
<link rel="stylesheet" href="../../css/stylesFrontpage.css" />
</head>

<body>
	<div id="header">
		<%@ include file = "header.jsp" %>
	</div>
	<div id="content">
		<main>
		<div class="header--AdvSearch">
			<h1>Advanced search</h1>
		</div>
		<div>

			<form method="GET" action="/app/test">
				<input name="title" type="text" placeholder="Title..."> <input
					name="edition" type="number" min=1 max=99 placeholder="Ed.">
				<input name="author" type="text" placeholder="Author..."> <input
					type="submit" value="Search"><br>
				<!-- <select name="dd_school">
				<c:forEach var="school" items="${schools}">
					<option value="${school.getId()}">${school.getName()}</option>
				</c:forEach>
			</select>  -->
			</form>
		</div>
		</main>
	</div>
	<div id="footer">
		<%@ include file = "footer.jsp" %>
	</div>
</body>

</html>