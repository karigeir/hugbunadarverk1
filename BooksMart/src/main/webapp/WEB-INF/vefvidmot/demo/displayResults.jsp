<!-- @author S�var Ingi Sigur�sson <sis108@hi.is> -->
<!-- .jsp skr� containing HTML for a website with URL "../demo/hver" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>

<html lang="en">

	<head>
   	 	<title>Leitarni�urst��ur</title>
	</head>
	<body>
	
		<div>Listinn: 
			<ul>
				<c:forEach var="listVal" items="${list}">
					<li> ${listVal.title}</li>
				</c:forEach>
			</ul>
		</div>

	</body>

</html>