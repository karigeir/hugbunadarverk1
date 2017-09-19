<!-- @author Sævar Ingi Sigurğsson <sis108@hi.is> -->
<!-- .jsp skrá sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Hver er bókin?</title>
</head>
<body>

<h1></h1>

<form method="POST" action="/demo/hver">
	<input name="title" type="text" placeholder="Titill"></input>
	<input name="author" type="text" placeholder="Höfundur"></input>
	<input name="edition" type="text" placeholder="Útgáfa"></input>
	<input name="course" type="text" placeholder="Fag"></input>
	<input name="department" type="text" placeholder="Námsbraut"></input>
	<input name="school" type="text" placeholder="Skóli"></input>
	
</form>

</body>

</html>