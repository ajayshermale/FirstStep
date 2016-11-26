
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
<script>$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});</script>

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
 <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>

<style>


.nav-tabs {
  display: inline-block;
  
  border-bottom: none;
  padding-top: 15px;
  font-weight: bold;
}
.nav-tabs > li > a, 
.nav-tabs > li > a:hover, 
.nav-tabs > li > a:focus, 
.nav-tabs > li.active > a, 
.nav-tabs > li.active > a:hover,
.nav-tabs > li.active > a:focus {
  border: none;
  border-radius: 0;
  
}

.mega-dropdown { position: static  }
.mega-dropdown-menu {
  padding: 20px 15px 15px;
  text-align: center;
  width: 100%;
}

     .carousel-inner img {

      width: 100%; /* Set width to 100% */
      margin: auto;
      min-height:200px;
  }


  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none;
    }
  }
  
  /* second navbar*/
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
  
<!--product css -->

body{
    background:#fff;;
}
.title{
    text-shadow: 2px 2px 0px rgba(0, 0, 0, 0.4) !important;    
}

.divider-title{
    border:1px solid #dddddd;
}

.project {
    margin-bottom: 30px;
    vertical-align: top;
    margin-right: 30px;
    float: left;
    cursor: pointer;
    width:100%;
}

.project figure {
    position: relative;
    display: inline-block;
    width: 283px;
    -moz-box-shadow: 0 3px 0 #e2e2e2,transparent 0 0 0;
    -webkit-box-shadow: 0 3px 0 #e2e2e2,transparent 0 0 0;
    box-shadow: 0 3px 0 #e2e2e2,transparent 0 0 0;
    -webkit-box-shadow: 0 3px 0 #e2e2e2;
    -moz-box-shadow: 0 3px 0 #e2e2e2;
    box-shadow: 0 3px 0 #e2e2e2;
}

.project figure figcaption {
    position: relative;
    z-index: 10;
    padding: 8px 18px 11px;
    background: #fff;
    -ms-transition: all .2s ease-out;
    -webkit-transition: all .2s ease-out;
    -moz-transition: all .2s ease-out;
    -o-transition: all .2s ease-out;
    transition: all .2s ease-out;
    text-align: left;
    color: #555;
}

.project figure:hover .actions {
    opacity: 1;
}

.project figure .actions {
    display: block;
    position: absolute;
    top: 0;
    z-index: 1;
    width: 100%;
    height: 100%;
    opacity: 0;
    background-color: rgba(29,29,29,.7);
    -ms-transition: all .2s ease-out;
    -webkit-transition: all .2s ease-out;
    -moz-transition: all .2s ease-out;
    -o-transition: all .2s ease-out;
    transition: all .2s ease-out;
}

.project figure img {
    border: 0;
    width: 100%;
}
.btn-warning bnt-action{
    margin: 0% 0% auto;    
}

figcaption .project-details {
    display: block;
    font-size: 16px;
    line-height: 33px;
    color: #0093d0;
    height: 27px;
    width: 85%;
    margin-bottom: 5px;
    overflow: hidden;
}

figcaption .project-price {
    position: absolute;
    right: 15px;
    top: 12px;
    font-size: 22px;
    text-align: right;
    margin-top: 8px;
    letter-spacing: -1px;
    -webkit-font-smoothing: antialiased;
}

figcaption .project-creator {
    font-size: 13px;
    color: #545454;
    display: block;
}

figcaption .project-creator {
    font-size: 13px;
    color: #545454;
    display: block;
}


.project figure .actions button {
    padding: 13px 20px;
    font-size: 16px;
    top: 32%;
    position: absolute;
    left: 50%;
    width: 90%;
    margin-left: -45%;
    line-height: 18px;
    letter-spacing: 1px;
} 


</style>

</head>
<body>

<%@ include file="./header.jsp" %>

<div></div>
<div class="container side-collapse-container">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#"></a>
    </div>
<div>

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
	
	<div class="collapse navbar-collapse js-navbar-collapse" >
		<ul class="nav navbar-nav">
		  <c:forEach var="category" items="${listCategories}" >
			<li class="dropdown mega-dropdown">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">${category.categoryName} <span class="caret"></span></a>				
				<ul class="dropdown-menu mega-dropdown-menu">

					
					<c:forEach var="subcategory" items="${category.subcategory}" >
					<li class="col-sm-3">
						<ul>
						 
							<li class="dropdown-header"><a href="productlist?search=${subcategory.subcategoryName}">${subcategory.subcategoryName}</a></li>
							<c:forEach var="subcategory" items="${subcategory.product}" >
							<li><a href="productlist?search=${subcategory.productName}">${subcategory.productName}</a></li></c:forEach>
						</ul>
					</li></c:forEach></ul></li>
					</c:forEach>
				</ul>			
			</li>
            
	</div>
	
  </nav>
</div>


</div>

  
  <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search" ng-model="searchKeyword"  >
            </div>
           <a  href="productlist"><button type="submit" class="btn btn-default">Submit</button></a>
  </form>
               <ul class="nav navbar-nav navbar-right"> </ul>
           </div>

 
<!-- body -->
<div class="container side-collapse-container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
      <img src="resources/images/scrole2.jpg" alt="Image">
      <!--    <img src="https://placehold.it/1200x400?text=IMAGE" alt="Image">-->
        <div class="carousel-caption">
          <h3>Sell $</h3>
          <p>Money Money.</p>
        </div>
      </div>

      <div class="item">
      <!--  <img src="https://placehold.it/1200x400?text=Another Image Maybe" alt="Image"> -->
        <img src="resources/images/scrole1.jpg" alt="Image">
        <div class="carousel-caption">
          <h3>More Sell $</h3>
          <p>Lorem ipsum...</p>
        </div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>

<br>
<div>
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-danger">
       
        <div class="panel-body" ><a  href="http://localhost:8080/FirstStep/productlist"><img src="resources/images/sale.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
       <!--   <div class="panel-footer">Buy 2 Shoes and get a gift card</div>-->
      </div>
    </div>
    <div class="col-sm-4">
      <div class="panel panel-danger">
      <!--   <div class="panel-heading"></div>--> 
        <div class="panel-body"><a  href="http://localhost:8080/FirstStep/productlist"><img src="resources/images/new_arrivals_1.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
     
      </div>
    </div>
    <div class="col-sm-4">
      <div class="panel panel-success">
     <!--     <div class="panel-heading">BLACK FRIDAY DEAL</div>-->
        <div class="panel-body"><a  href="http://localhost:8080/FirstStep/productlist"><img src="resources/images/499_store.jpg" class="img-responsive" style="width:100%" alt="Image"></a></div>
   <!--      <div class="panel-footer">Buy 50 mobiles and get a gift card</div>-->
      </div>
    </div>
  </div>


 <div class="container"> 
<div>



    <h1 class="text-center text-primary title">Top Selling</h1>
    <hr class="divider-title">
     <div ng-app="supplierapp" ng-controller="supplierCtrl">
     
    <div class="col-ms-10 col-md-4 col-sm-4" ng-repeat="x in abc">
        <div class="project">
            <figure class="img-responsive">
              <img class="group list-group-image" src="resources/images/{{x.productId}}.jpg" width="400px" height="300px" />
            
                <figcaption>
                    <span class="project-details"><strong>{{x.productName}}</strong></span>
                    <span class="project-price"><strong><p1>Rs</p1>{{x.productPrice}}</strong></span>
<%--                     <span class="container">${product.productDescription}</span> --%>
                </figcaption>
   
                <span class="actions">
                <a href="viewproduct-{{x. productId}}-product">
                        <button  class="btn btn-warning bnt-action" type="submit" >View </button></a>
                </span>
                   
                 </figure>
                             <div class="row">
							<div class="col-md-3">
								<a href="wishlist-{{x.productId}}?userId=1"class="btn btn-primary btn-product"><span class="glyphicon glyphicon-thumbs-up"></span> Like</a> 
							</div>
							<div class="col-md-4">
								<a href="wishlist-{{x.productId}}?userId=1"class="btn btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> Add to cart </a> 
							</div>
			
							<div class="col-md-2">
								<a href="buynow-{{x.productId}}?userId=1" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
					</div>
					 
  </div>
  </div>
   </div>
</div>
</div>
 <script> 
var app = angular.module('supplierapp', []);
 app.controller('supplierCtrl', function($scope) {
    $scope.abc = ${productjson}; 
      
 });
 </script>

</div></div></div>



<%@ include file="./footer.jsp" %>
</body>
</html>




