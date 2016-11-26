<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
  <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
  <script src="resources/js/angular.min.js"></script>
  <script>$(document).ready(function(){
	    $(".dropdown").hover(            
	            function() {
	                $('.dropdown-menu', this).not('.in .dropdown-menu').stop(true,true).slideDown("400");
	                $(this).toggleClass('open');        
	            },
	            function() {
	                $('.dropdown-menu', this).not('.in .dropdown-menu').stop(true,true).slideUp("400");
	                $(this).toggleClass('open');       
	            }
	        );
	    });</script>
</head>
<body>
<div class="container">
  <nav class="navbar navbar">
    <div class="navbar-header">
    	<button class="navbar-toggle" type="button" data-toggle="collapse" data-target=".js-navbar-collapse">
			<span class="sr-only">Toggle navigation</span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="#">My Store</a>
	</div>
	
	<div class="collapse navbar-collapse js-navbar-collapse">
		<ul class="nav navbar-nav">
		  <c:forEach var="category" items="${listCategories}" >
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">${category.categoryName} <span class="caret"></span></a>				
				<ul class="dropdown-menu mega-dropdown-menu">

					</li>
					<c:forEach var="subcategory" items="${category.subcategory}" >
					<li class="col-sm-3">
						<ul>
						 
							<li class="dropdown-header"><a href="productlist?search=${subcategory.subcategoryName}">${subcategory.subcategoryName}</a></li>
							<c:forEach var="subcategory" items="${listproduct}" >
							<li><a href="productlist?search=${subcategory.productName}">${subcategory.productName}</a></li></c:forEach>
						</ul>
					</li></c:forEach>

				</ul>			
			</li></c:forEach>
            
	</div>
	
  </nav>
</div>
</body>
<style>
body {
  font-family: 'Open Sans', 'sans-serif';
}
.mega-dropdown {
  position: static !important;
}
.mega-dropdown-menu {
    padding: 20px 0px;
    width: 100%;
    box-shadow: none;
    -webkit-box-shadow: none;
}
.mega-dropdown-menu > li > ul {
  padding: 0;
  margin: 0;
}
.mega-dropdown-menu > li > ul > li {
  list-style: none;
}
.mega-dropdown-menu > li > ul > li > a {
  display: block;
  color: #222;
  padding: 3px 5px;
}
.mega-dropdown-menu > li ul > li > a:hover,
.mega-dropdown-menu > li ul > li > a:focus {
  text-decoration: none;
}
.mega-dropdown-menu .dropdown-header {
  font-size: 18px;
  color: #ff3546;
  padding: 5px 60px 5px 5px;
  line-height: 30px;
}

.carousel-control {
  width: 30px;
  height: 30px;
  top: -35px;

}
.left.carousel-control {
  right: 30px;
  left: inherit;
}
.carousel-control .glyphicon-chevron-left, 
.carousel-control .glyphicon-chevron-right {
  font-size: 12px;
  background-color: #fff;
  line-height: 30px;
  text-shadow: none;
  color: #333;
  border: 1px solid #ddd;
}
</style>
</html>


