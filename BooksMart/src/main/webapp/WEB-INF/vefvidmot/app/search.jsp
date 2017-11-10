<!-- @author S�var Ingi Sigur�sson <sis108@hi.is> -->
<!-- .jsp skr� sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
  <title>Booksmart</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link href="https://fonts.googleapis.com/css?family=Lato|Merriweather" rel="stylesheet">  
  <link rel="stylesheet" href="../../css/stylesFrontpage.css" />
              

</head>

<body>
  <div id="header">
    <%@ include file = "header.jsp" %>
  </div>
  <div id="content">
    <main class="main--frontpage">
      <div class="logo">
<!--         <img src="../../css/profile1.jpg" class="img--logo"> -->
      </div>
      <div class="header--text">
        <h1>BooksMart</h1>
      </div>
      <div>
        <form method="GET" action="/app/results" role="form" class="search--bar">
          <input class="input--field" name="title" type="text" placeholder="Search for books...">
<!--           <input class="input--button" type="submit" value=""> -->
        </form>
      </div>
    </main>
  </div>
  <div id="footer">
   <%@ include file = "footer.jsp" %>
  </div>
</body>

</html>