<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="resources/js/angular.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script>$(document).ready(function() {   
      var sideslider = $('[data-toggle=collapse-side]');
      var sel = sideslider.attr('data-target');
      var sel2 = sideslider.attr('data-target-2');
      sideslider.click(function(event){
          $(sel).toggleClass('in');
          $(sel2).toggleClass('out');
      });
  });</script>
 
  <style>
 /* Remove the navbar's default margin-bottom and rounded borders */
  
  body {
          padding-top: 50px;
          position: relative;
      }
      
      pre {
          tab-size: 8;
      }
     @media screen and (max-width: 768px) {
          .side-collapse-container{
              width:100%;
              position:relative;
              left:0;
              transition:left .4s;
          }
          .side-collapse-container.out{
              left:200px;
          }
          .side-collapse {
              top:50px;
              bottom:0;
              left:0;
              width:200px;
              position:fixed;
              overflow:hidden;
              transition:width .4s;
          }
          .side-collapse.in {
              width:0;
          }

</style>
</head>
<body class="body">
<header role="banner" class="navbar navbar-fixed-top navbar-inverse">

  
    <div class="navbar-header">
<button data-toggle="collapse-side" data-target=".side-collapse" data-target-2=".side-collapse-container" type="button" class="navbar-toggle pull-left"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
<!--      <a class="navbar-brand  brand-name"><h1 href="#" class="pull-left"><img src="resources/images/Logomakr_5x4BYF.png"></a></h1> -->
      
      <a class="navbar-brand" >
 <a  href="http://localhost:8080/FirstStep/"><img src="resources/images/Logo.png" style="display: inline-block;"></a>
</a>

   
    </div>
    <div class="navbar-inverse side-collapse in">
    <nav role="navigation" class="navbar-collapse">
      <ul class="nav navbar-nav">
        <li ><a href="http://localhost:8080/FirstStep/">Home</a></li>
        <li><a href="aboutous">About</a></li>
        <li><a href="contactous">Contact</a></li>
         </ul>
         <ul class="nav navbar-nav navbar-right">
        <sec:authorize access="isAuthenticated()">
         <sec:authentication property="principal.username" var="username" />
        <li> <a>WELCOME: ${username}</a></li>
        
        
<!--                        <ul class="nav navbar-nav navbar-right"> </ul> -->
          
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Profile <span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="profile">WELCOME: ${username}</a></li>
                <li><a href="profile">Profile</a></li>
                <li><a href="wishlist">MyWishlist</a></li>
                 <li><a href="#">MyOrders</a></li>
                <li class="divider"></li>
                <li><a href="#">Help link</a></li>
              </ul>
            </li>
       </sec:authorize>
     
    
      
     
      <c:if test="${pageContext.request.userPrincipal.name == null }">
       <li> <a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </c:if>
        
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <li><a href="perform_logout"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>
         </c:if>
        <li><a href="register"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
      </ul>
      </nav>
    </div>
  </div>
</header>

<!-- admin nav bar -->
 <div>
<sec:authorize access="hasRole('ROLE_ADMIN')">
  <div class="container side-collapse-container">     
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     
      
    </div>
    <ul class="nav navbar-nav">
    <sec:authentication property="principal.username" var="username" />
        <li><a> WELCOME ADMIN: ${username}</a></li>
      <li ><a href="categories">CATEGORY</a></li>
      <li><a href="subCategory">SUBCATEGORY</a></li>
      <li><a href="product">PRODUCT</a></li>
      <li><a href="newsupplier">SUPPLIER</a></li>
    </ul>
  </div>
</nav></div>
</sec:authorize> 
</div>
<!-- supplier nav bar -->
 <div>
<sec:authorize access="hasRole('ROLE_SUPPLIER')">
  <div class="container side-collapse-container">     
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
     
      
    </div>
    <ul class="nav navbar-nav">
    <sec:authentication property="principal.username" var="username" />
        <li><a> WELCOME SUPPLIER: ${username}</a></li>
      <li ><a href="categories">CATEGORY</a></li>
      <li><a href="subCategory">SUBCATEGORY</a></li>
      <li><a href="product">PRODUCT</a></li>
    </ul>
  </div>
</nav></div>
</sec:authorize> 
</div>

</body>
</html>

