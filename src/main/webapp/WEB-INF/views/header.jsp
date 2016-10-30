<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
 /* Remove the navbar's default margin-bottom and rounded borders */
    .navbar { 
      height:40px;
      border-radius: 5px;
      -moz-border-radius: 5px;
      -webkit-border-radius: 5px;
    }
  
  </style>
</head>
<body class="body">

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Projects</a></li>
        <li><a href="#">Contact</a></li>
        <sec:authorize access="isAuthenticated()">
         <sec:authentication property="principal.username" var="username" />
        <li> <a> ${username}</a></li>
         </sec:authorize>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <c:if test="${pageContext.request.userPrincipal.name == null }">
       <li> <a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </c:if>
        
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span>Logout</a></li>
         </c:if>
        
      </ul>
    </div>
  </div>
</nav>

</body>
</html>

