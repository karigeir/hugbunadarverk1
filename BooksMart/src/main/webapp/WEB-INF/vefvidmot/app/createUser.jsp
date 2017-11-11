<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- @author Kári Geir Gunnarsson <kgg5@hi.is> -->
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
<link rel="stylesheet" href="../../css/styles.css" />
</head>
<body>
	<div id="header">
		 <%@ include file = "header.jsp" %>
	</div>
	<div id="content">
		<main>
		<div class="header--createUser">
			<h1>Register</h1>
			<c:if test="${not empty error}">
				<div>${error}</div>
			</c:if>
			<c:if test="${not empty message}">
				<div>${message}</div>
			</c:if>
		</div>
		<div>
			<form method="POST" action="/app/user_confirm">
				Username: <input name="username" type="text"
					placeholder="Joe Doeson" required /><br> Email: <input
					name="email" type="email" placeholder="john@doe.is" required /><br>
				Password: <input name="pw" type="password" required /><br> <input
					type="submit" value="Confirm" />
			</form>
			<a href="/app/"><button>Back</button></a>
		</div>
		</main>
	</div>
	<div id="footer">
		<%@ include file = "footer.jsp" %>
	</div>
</body>

</html>