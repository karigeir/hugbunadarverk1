<!-- @author S�var Ingi Sigur�sson <sis108@hi.is> -->
<!-- .jsp skr� sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Hver er notandinn?</title>
</head>
<body>

<h1></h1>

<form method="POST" action="/demo/hver">
	Hva� heitir�u? 
	<input name="nafn" type="text" placeholder="Nafn"></input>
	<input type="submit" value="� lagi"></input>
</form>

</body>

</html>