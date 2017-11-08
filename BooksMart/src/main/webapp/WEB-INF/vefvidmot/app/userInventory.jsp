<!-- @author Kári Geir Gunnarsson <kgg5@hi.is> -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html lang="en">

<head>
<title>Your books</title>
</head>
<body>
	<div id="header">
		<%@ include file="header.jsp"%>
	</div>
	<div id="content">
		<main>
		<div class="header--login">
			<h1>My books</h1>
			</div>
		<c:choose>
			<c:when test="${not empty userBooks}">
				<table class="books">
					<thead>
						<tr>
							<th>Title</th>
							<th>Ed.</th>
 							<th>Author</th>
 							<th>Course</th>
 							<th>Department</th>
 							<th>School</th>
 							<th>Book sold?</th>
						</tr>
					</thead>
					<c:forEach var="book" items="${userBooks}">
						<tr>
							<td>${book.getTitle()}</td>
							<td>${book.getEdition()}</td>
							<td>${book.getAuthor()}</td>
							<td>${book.getCourse().getName()}</td>
							<td>${book.getCourse().getDepartment().getName()}</td>
							<td>${book.getCourse().getDepartment().getSchool().getName()}</td>
							<td>
 								<form method=GET action="/app/deletion" >
 									<input name="username" type="hidden" value="${user}"/>
 									<input name="book_id" type="hidden" value="${book.getId()}" readonly/>
 									<input type="submit" value="Delete book"/>
 								</form>
 							</td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
			<c:otherwise>
				<h3>No books found.</h3>
			</c:otherwise>
		</c:choose> 
		</main>
	</div>
	<div id="footer">
		<%@ include file="footer.jsp"%>
	</div>
</body>

</html>