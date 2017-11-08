<!DOCTYPE html>
<html lang="en">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>
<%@ page import="is.hi.booksmart.model.User" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
HttpSession session = request.getSession(false);
User loggedInUser = session != null ? (User) session.getAttribute("myUser") : null;
%>

<head>
<title>Booksmart</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Lato|Merriweather"
	rel="stylesheet">
<link rel="stylesheet" href="../../css/stylesFrontpage.css" />

<div id="header">
	<nav class="menu">
		<div class="menuleft">
			<a class="menutext" href="/app/">BooksMart</a>
		</div>
		<div class="menuright">
				<% if (loggedInUser == null) { %>
					<a class="menubutton" href="./create_user">Sign up</a>
					<a class="menubutton" href="./login">Login</a>
				<% } else { %>
					<a class="menubutton" href="./add_book">Sell a book</a> 
					<a class="menubutton" href="./userInventory">My Profile</a> 
					<a class="menubutton" href="./logout">Logout</a>
				<% } %>
		</div>
	</nav>
</div>