<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- .jsp skrá containing HTML for a website with URL "../demo/hver" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<html lang="en">

	<head>
   	 	<title>Leitarniðurstöður</title>
	</head>
	<body>
		<div id="header">
    			<nav class="menu">
      			<div class="menuleft">
        				<a class="menutext" href="/app/">BooksMart</a>
      			</div>
      			<div class="menuright">
       				<a class="menubutton" href="./adv_search">Advanced Search</a>
        				<a class="menubutton" href="./create_user">Sign up</a>
        				<a class="menubutton" href="./login">Login</a>
     		 	</div>
    			</nav>
  		</div>
		<div>
			<form method="GET" action="/app/results" role="form" class="search--bar">
          		<input class="input--field" name="title" type="text" placeholder="Search for books...">
          		<input class="input--button" type="submit" value="Search">
        		</form>
		</div>
		<div>
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
								<th>Contact info.</th>
							</tr>
						</thead>
						<c:forEach var = "book" items="${books}">
							<tr>
								<td>${book.getTitle()}</td>
								<td>${book.getAuthor()}</td>
								<td>${book.getEdition()}</td>
								<td>${book.getCourse().getName()}</td>
								<td>${book.getCourse().getDepartment().getName()}</td>
								<td>${book.getCourse().getDepartment().getSchool().getName()}</td>
								<td>
									<input id="contact_email" type="text" value="${book.getUserContact()}" readonly/>
									<button onclick="copyEmail()">Copy</button>
								</td>
							</tr>
						</c:forEach>
					</table>
				</c:when>
				<c:otherwise>
					<h3>No books found.</h3>	
				</c:otherwise>
			</c:choose>
		</div>
		
		<script>
			function copyEmail() {
  				var copyText = document.getElementById("contact_email");
  				copyText.select();
  				document.execCommand("Copy");
  				alert("Copied the text: " + copyText.value);
			}
		</script>
	</body>

</html>