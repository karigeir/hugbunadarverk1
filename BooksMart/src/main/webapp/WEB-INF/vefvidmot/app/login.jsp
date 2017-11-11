<!DOCTYPE html>
<!-- @Kári Geir Gunnarsson <kgg5@hi.is> -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="/BooksMart/BooksMart.css" type="text/css">

<html lang="en">

<head>
<title>Booksmart</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Lato|Merriweather" rel="stylesheet">
<link rel="stylesheet" href="../../css/styles.css" />
</head>
<body>
	<div id="header">
		 <%@ include file = "header.jsp" %>
	</div>
	<div id="content">
		<main>
		<div class="header--login">
			<h1>Sign in</h1>
		</div>
		<div>
			<c:if test="${not empty error}">
				<div>${error}</div>
			</c:if>
			<c:if test="${not empty message}">
				<div>${message}</div>
			</c:if>

			<form method="POST" action="/app/login">
				Username: <input name="username" type="text"
					placeholder="Joe Doeson" required /><br> Password: <input
					name="pw" type="password" required /><br> <input
					type="submit" value="Confirm" /> <input type="hidden"/>
			</form>
		</div>
		</main>
	</div>
	<div id="footer">
		<%@ include file = "footer.jsp" %>
	</div>
</body>

</html>