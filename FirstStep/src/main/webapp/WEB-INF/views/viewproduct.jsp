<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
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

/* .container { */
/* 	padding-left: 0px; */
/* 	padding-right: 0px; */
/* 	max-width: 100%; */
/* } */

   </style>   
      
</head>
<body>
 <%@ include file="./header.jsp" %>

<div class="container">
 <form class="navbar-form navbar-left" role="search">
            <div class="form-group">
              <input type="text" class="form-control" placeholder="Search" >
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
               <ul class="nav navbar-nav navbar-right"> </ul>
           </div>





<div class="container">
<div ng-app="app" ng-controller="Ctrl">
	
			<div class="container">	
				<div class="col-md-12">
					<div class="product col-md-3 service-image-left">
                    
<!-- 						<center> -->
							<img id="item-display" src="resources/images/{{abc.productId}}.jpg"width="250" height="300" alt=""></img>
<!-- 						</center> -->
					</div>
									
				<div class="col-md-4">
					<div class="product-title">NAME:{{abc.productName}}</div>
					<div class="product-desc"><h4>{{abc.productDescription}}</h4></div>
					<div class="product-desc">
					<div class="actions">
					<a href="supplier-{{abc.supplierAddressId}}-supplier">
						<button type="button" class="btn btn-warning bnt-action">
							{{abc.supplierCompanyName}}</button>
						</a>
					</div>
					</div>
<!-- 					<div class="product-desc">SUPPLIER:{{abc.supplierCompanyName}}</div> -->
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
					
					<div class="btn-group buynow">
								<a href="buynow-{{abc.productId}}?userId=1" class="btn btn-success btn-product"><span class="glyphicon glyphicon-shopping-cart"></span> Buy</a></div>
					
					
					<div class="btn-group wishlist">
						<button type="button" class="btn btn-danger">
							Add to wishlist 
						</button>
					</div>
					<hr>
<!-- 					<div class="actions"> -->
<!-- 					<a href="supplier-{{abc.supplierAddressId}}-supplier"> -->
<!-- 						<button type="button" class="btn btn-warning bnt-action"> -->
<!-- 							Supplier -->
<!-- 						</button></a> -->
<!-- 					</div> -->
					</div>
					
<!-- 					<div class=" col-md-9 col-lg-9 ">  -->
<!--                   <table class="table table-user-information"> -->
                 
					
	
					<div class="product-title">DESCRIPTION:</div>
					<hr>	
							<div class="container">
							<table>
                            <tbody>
                           
							<td>Stock Keeping Unit</td>
							<td>:{{abc.sku}}</td>
                            <tr>
                            <td>SHOE TYPE</td>
                            <td>:{{abc.shoeType}}</td>
                            <tr>
                            <td>BRAND</td>
                            <td>:{{abc.brands}}</td>
                            <tr>
                            <td>COLOUR</td>
                            <td>:{{abc.colours}}</td>
                            <tr>
                            <td>UPPER MATERIAL</td>
                            <td>:{{abc.upperMaterial}}</td>
                            <tr>
                            <td>INNER MATERIAL</td>
                            <td>:{{abc.innerMaterial}}</td>
                            <tr>
                            <td>SOLE MATERIAL</td>
                             <td>:{{abc.soleMaterial}}</td>
                            <tr>
                            <td> HEEL HEIGHT</td>
                             <td>:{{abc.heelHeight}}</td>
								 
                                  </tbody>
                                    </table>
<!-- 							<hr> -->
<!--                  		<div class="actions"> -->
<!-- 					<a href="supplier-{{abc.supplierAddressId}}-supplier"> -->
<!-- 						<button type="button" class="btn btn-warning bnt-action"> -->
<!-- 							Supplier -->
<!-- 						</button></a> -->
<!-- 						<hr> -->
<!-- 					</div> -->
<!-- 					</div>						 -->
						<hr>
</div></div>
					
</div><hr>
 <script> 
var app = angular.module('app', []);
 app.controller('Ctrl', function($scope) {
    $scope.abc = ${productview};
 });
 </script> </div></div>
 <%@ include file="./footer.jsp" %>
</body>

</html>

