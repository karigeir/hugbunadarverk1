<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nýskrá bók</title>
</head>
<body>
	<div id="header">
		<%@ include file="header.jsp"%>
	</div>
	<div id="content">
		<main>
		<div class="header--login">
			<h1>Register your book</h1>
		</div>

		<form method="POST" action="/app/book_confirm">
			Titill: <input name="title" type="text" placeholder="Title" required /><br>
			Höfundur: <input name="author" type="text" placeholder="Author"
				required /><br> Útgáfa: <input name="edition" type="number"
				placeholder="Edition" required /><br> Fag: <input
				name="course" type="text" placeholder="Course" required /><br>
			Námsbraut: <input name="department" type="text"
				placeholder="Department" required /><br> Skóli: <input
				name="school" type="text" placeholder="School" required /><br>
			<input type="submit" value="Confirm" />
		</form>
		<a href="/app/"><button>Back</button></a> </main>
	</div>
	<div id="footer">
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>