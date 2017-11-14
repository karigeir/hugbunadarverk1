<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BooksMart</title>
</head>
<body>
	<div id="header">
		<%@ include file="header.jsp"%>
	</div>

	<div class="ab-background">
	<div class="form-wrapper">	
		
<form class="form-table" method="POST" action="/app/book_confirm">
	<ul>
	<li>
	    <label for="title">Title</label>
	    <input type="text" name="title" maxlength="100" placeholder="derp" required>
	</li>
	<li>
	    <label for="author">Author</label>
	    <input type="text" name="author" maxlength="100" placeholder="derp" required>
	</li>
	<li>
	    <label for="edition">Edition</label>
	    <input type="number" name="edition" min=1 max=99 maxlength="100" placeholder="derp" required>
	</li>
	<li>
	    <label for="course">Course</label>
	    <input type="text" name="course" maxlength="100" placeholder="derp" required>
	</li>
	<li>
	    <label for="department">Department</label>
	    <input type="text" name="department" maxlength="100" placeholder="derp" required>
	</li>
	<li>
	    <label for="school">School</label>
	    <input type="text" name="school" maxlength="100" placeholder="derp" required>
	</li>
	<li>
		<input type="submit" value="Confirm" >
	</li>
	</ul>
	</form>
			
		
		</div>
	
	</div>
	<div id="footer">
		<%@ include file="footer.jsp"%>
	</div>
</body>
</html>