<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
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
      margin:2% 2%
      height:40px;
      border-radius: 5px;
      -moz-border-radius: 5px;
      -webkit-border-radius: 5px;
    }
.flex-container {
width:25%
    display: -webkit-flex;
    display: flex;
    -webkit-flex-flow: row wrap;
    flex-flow: row wrap;
    text-align: center;
}
.flex-container > * {
    padding: 15px;
    -webkit-flex: 1 100%;
    flex: 1 100%;
}

footer {background: #aaa;color:white;}


.nav ul {
    list-style-type: none;
 padding: 0;
}
 


@media all and (min-width: 768px) {

    .nav {text-align:left;
      -webkit-flex: 1 auto;
       flex:1 auto;
      -webkit-order:1;
       order:1;}
    .article {-webkit-flex:5 0px;
         flex:5 0px;
         -webkit-order:2;
           order:2;}
    footer {-webkit-order:3;
          order:3;}
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
        <li class="active"><a href="">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Projects</a></li>
        <li><a href="#">Contact</a></li> 
      </ul>
      <ul class="nav navbar-nav navbar-right">
      <c:if >
       <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
       </c:if>
       <li><sec:authorize access="isAuthenticated()">
         <sec:authentication property="principal.username" var="username" />
         <a> ${username}</a>
         
       <c:if ${username} == null>
        <li><a href="logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
        </c:if>
        
          </sec:authorize></li>
      </ul>
      
    </div>
  </div>
</nav>

<div class="flex-container">
<header>
  <h1>First Step</h1>
</header>

<nav class="nav">
<ul>
  <li><a href="categories">Categories</a></li>
  <li><a href="subCategory">Subcategory</a></li>
  <li><a href="product">Product</a></li>
  <li><a href="supplier">Supplier</a></li>
</ul>
</nav>


</div>

</body>
</html>

