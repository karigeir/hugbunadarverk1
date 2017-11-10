<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>Book added</title>
</head>
<body>
	<div id="header">
		<%@ include file="header.jsp"%>
	</div>
	<div id="content">
		<main>
		<div class="header--login">
			<h3>${book.getTitle()} successfully added to database.</h3>
		</div>
		<a href="/app/"><button>Go back to front page</button></a>
		<a href="/app/add_book"><button>Add another book?</button></a> 
		</main>
	</div>
	<div id="footer">
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>