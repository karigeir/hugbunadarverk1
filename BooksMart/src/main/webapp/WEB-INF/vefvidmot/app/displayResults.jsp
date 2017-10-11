<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- .jsp skrá containing HTML for a website with URL "../demo/hver" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<html lang="en">

	<head>
   	 	<title>Leitarniðurstöður</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${not empty books}">
				<table class="books">
					<thead>
						<tr>
							<th>Title</th>
							<th>Author</th>
							<th>Ed.</th>
							<th>Course</th>
							<th>Dept.</th>
							<th>School</th>
						</tr>
					</thead>
					<c:forEach var = "book" items="${books}">
						<tr>
							<td>${book.title}</td>
							<td>${book.author}</td>
							<td>${book.edition}</td>
							<td>${book.course}</td>
							<td>${book.course.department}</td>
							<td>${book.course.department.school}</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<:otherwise>
				<h3>No books found.</h3>	
			</:otherwise>
		</c:choose>
	</body>

</html>