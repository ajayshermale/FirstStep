<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>
   <style>
/*********************************************
    			Call Bootstrap
*********************************************/

@import url("bootstrap/bootstrap.min.css");
@import url("bootstrap-override.css");
@import url("//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css");

/*********************************************
        		Theme Elements
*********************************************/

.gold{
	color: #FFBF00;
}

/*********************************************
					PRODUCTS
*********************************************/

.product{
	border: 1px solid #dddddd;
	height: 321px;
}

.product>img{
	max-width: 230px;
}

.product-rating{
	font-size: 20px;
	margin-bottom: 25px;
}

.product-title{
	font-size: 20px;
}

.product-desc{
	font-size: 14px;
}

.product-price{
	font-size: 22px;
}

.product-stock{
	color: #74DF00;
	font-size: 20px;
	margin-top: 10px;
}

.product-info{
		margin-top: 50px;
}

/*********************************************
					VIEW
*********************************************/

.content-wrapper {
	max-width: 1140px;
	background: #fff;
	margin: 0 auto;
	margin-top: 25px;
	margin-bottom: 10px;
	border: 0px;
	border-radius: 0px;
}

.container-fluid{
	max-width: 1140px;
	margin: 0 auto;
}

.view-wrapper {
	float: right;
	max-width: 70%;
	margin-top: 25px;
}

.container {
	padding-left: 0px;
	padding-right: 0px;
	max-width: 100%;
}

/*********************************************
				ITEM 
*********************************************/

.service1-items {
	padding: 0px 0 0px 0;
	float: left;
	position: relative;
	overflow: hidden;
	max-width: 100%;
	height: 321px;
	width: 130px;
}

.service1-item {
	height: 107px;
	width: 120px;
	display: block;
	float: left;
	position: relative;
	padding-right: 20px;
	border-right: 1px solid #DDD;
	border-top: 1px solid #DDD;
	border-bottom: 1px solid #DDD;
}

.service1-item > img {
	max-height: 110px;
	max-width: 110px;
	opacity: 0.6;
	transition: all .2s ease-in;
	-o-transition: all .2s ease-in;
	-moz-transition: all .2s ease-in;
	-webkit-transition: all .2s ease-in;
}

.service1-item > img:hover {
	cursor: pointer;
	opacity: 1;
}

.service-image-left {
	padding-right: 50px;
}

.service-image-right {
	padding-left: 50px;
}

.service-image-left > center > img,.service-image-right > center > img{
	max-height: 155px;
}

   </style>   
      
</head>
<body>
<br>
<div class="container">
<div ng-app="app" ng-controller="Ctrl">
<div class="container-fluid">
    <div class="content-wrapper">	
		<div class="item-container">	
			<div class="container">	
				<div class="col-md-12">
					<div class="product col-md-3 service-image-left">
                    
<!-- 						<center> -->
							<img id="item-display" src="resources/images/{{abc.productId}}.jpg"width="250" height="300" alt=""></img>
<!-- 						</center> -->
					</div>
					

					
				<div class="col-md-7">
					<div class="product-title">NAME:{{abc.productName}}</div>
					<div class="product-desc">{{abc.productDescription}}</div>
					<div class="product-desc">{{abc.supplierCompanyName}}</div>
					<div class="product-rating"><i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star gold"></i> <i class="fa fa-star-o"></i> </div>
					<hr>
					<div class="product-price">RS.{{abc.productPrice}}</div>
					<div class="product-stock">In Stock</div>
					<hr>
					<div class="btn-group cart">
						<button type="button" class="btn btn-success">
							Add to cart 
						</button>
					</div>
					<div class="btn-group wishlist">
						<button type="button" class="btn btn-danger">
							Add to wishlist 
						</button>
					</div>
					<hr>
					<div class="actions">
					<a href="supplier-{{abc.supplierAddressId}}-supplier">
						<button type="button" class="btn btn-warning bnt-action">
							Supplier
						</button></a>
					</div>
					
				</div>
			</div> 
		</div>
		<div class="container-fluid">		
			<div class="col-md-12 product-info">
					<ul id="myTab" class="nav nav-tabs nav_tabs">
						
						<li ><a href="#service-one" data-toggle="tab">DESCRIPTION</a></li>
<!-- 						<li><a href="#service-two" data-toggle="tab">PRODUCT INFO</a></li> -->
<!-- 						<li><a href="#service-three" data-toggle="tab">REVIEWS</a></li> -->
						
					</ul>
				<div id="myTabContent" class="tab-content">
						<div class="tab-pane fade in active" id="service-one"> 
							<section class="container product-info">
							 <table>
                            <tbody><tr>
							<tr><td>Stock Keeping Unit<td>:   {{abc.sku}}</td>
                            <tr><td>SHOE TYPE<td>:   {{abc.shoeType}}</td>
                            <tr><td>BRAND<td>:   {{abc.brands}}</td>
                            <tr><td>COLOUR<td>:   {{abc.colours}}</td>
                            <tr><td>UPPER MATERIAL<td>:   {{abc.upperMaterial}}</td>
                            <tr><td>INNER MATERIAL<td>:   {{abc.innerMaterial}}</td>
                            <tr><td>SOLE MATERIAL<td>:   {{abc.soleMaterial}}</td>
                            <tr><td> HEEL HEIGHT<td>:   {{abc.heelHeight}}</td>
								  </tr>
                                  </tbody>
                                    </table>
							</section>
										  
						</div>
					<div class="tab-pane fade" id="service-two">
						
						<section class="container">
								
						</section>
						
					</div>
					<div class="tab-pane fade" id="service-three">
												
					</div>
				</div>
				<hr>
			</div>
		</div>
	</div>
</div>

<!-- <div class="container"> -->
<!-- <div ng-app="supplierapp" ng-controller="supplierCtrl"> -->

           
<!--       <td><img  src="resources/images/{{abc.productId}}.jpg"  class="img-rounded" alt="Cinque Terre" width="304" height="236"></td> -->
     
      
<!-- <!--       {{abc.productName}} --> 
<!-- <!--       {{abc.productDescription}} --> 
<!-- <!--       {{abc.productPrice}} --> 
    
    
<!-- <div class="container"> -->
<!--   <h2> {{abc.productName}}</h2> -->
<!--   <p></p> -->
<!--   <table class="table"> -->
<!--     <thead> -->
<!--       <tr> -->
<!--         <th>PRODUCT DESCRIPTION</th> -->
<!-- <!--         <th>productPrice</th> --> 
       
<!--       </tr> -->
<!--     </thead> -->
<!--     <tbody> -->
<!--       <tr> -->
<!-- <!--         <td>{{abc.productDescription}}</td> --> 
<!--      <tr><td>SKU<td>{{abc.sku}}</td> -->
<!--       <tr><td>SHOE TYPE<td>{{abc.shoeType}}</td> -->
<!--        <tr><td>BRAND<td>{{abc.brands}}</td> -->
<!--        <tr><td>COLOUR<td>{{abc.colours}}</td> -->
<!--        <tr><td>UPPER MATERIAL<td>{{abc.upperMaterial}}</td> -->
<!--        <tr><td>INNER MATERIAL<td>{{abc.innerMaterial}}</td> -->
<!--         <tr><td>SOLE MATERIAL<td>{{abc.soleMaterial}}</td> -->
<!--         <tr><td> HEEL HEIGHT<td>{{abc.heelHeight}}</td> -->
         
         
<!-- <!--         <td> {{abc.productPrice}}</td> --> 
      
   
<!--       </tr> -->
<!--     </tbody> -->
<!--   </table> -->
    
    
<!-- <!--       <td><a href="viewproduct-{{abc. productId}}-product"></a></td> --> 

<!-- </div></div> -->
<!-- <div> -->
 <script> 
var app = angular.module('app', []);
 app.controller('Ctrl', function($scope) {
    $scope.abc = ${productview};
 });
 </script> </div>
</body>

</html>
<%@ include file="footer.jsp" %>
