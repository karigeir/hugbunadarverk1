<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- .jsp skrá sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="/BooksMart/BooksMart.css" type="text/css">

<html lang="en">

	<head>
    		<title>BooksMart</title>
	</head>
	<body>

		<h1>Create your user</h1>

		<form method="POST" action="/app/user_confirm">
			Username: <input name="username" type="text" placeholder="Joe Doeson" required/><br>
			Email: <input name="email" type="email" placeholder="john@doe.is" required/><br>
			Password: <input name="pw" type="password" required/><br>
			<input type="submit" value="Confirm"/>
		</form>
		<a href="/app/"><button>Back</button></a>


	</body>

</html>