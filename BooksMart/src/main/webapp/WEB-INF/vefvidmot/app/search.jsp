<!-- @author Sævar Ingi Sigurðsson <sis108@hi.is> -->
<!-- .jsp skrá sem containing HTML for website with URL "../demo/spyrjaNotanda" (see DemoController) -->
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
    <nav class="menu">
      <div class="menuleft">
        <a class="menutext" href="">BooksMart</a>
      </div>
      <div class="menuright">
        <a class="menubutton" href="./adv_search">Advanced Search</a>
        <a class="menubutton" href="./create_user">Sign up</a>
        <a class="menubutton" href="./login">Login</a>
      </div>
    </nav>
  </div>
  <div id="content">
    <main>
      <div class="logo">
        <img src="../../css/profile1.jpg" class="img--logo">
      </div>
      <div class="header--text">
        <h1>BooksMart</h1>
      </div>
      <div>
        <form method="GET" action="/app/results" role="form" class="search--bar">
          <input class="input--field" name="title" type="text" placeholder="Search for books...">
          <input class="input--button" type="submit" value="Search">
        </form>
      </div>
    </main>
  </div>
  <div id="footer">
    <div footer class="footer">
      <hr class="footerhr"> </hr>
      <div class="footercontent">
        <p class="footertext">© BooksMart 2017</p>
      </div>
      </footer>
    </div>
  </div>
</body>

</html>