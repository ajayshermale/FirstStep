<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
  <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>

</head>
<body>
<%@ include file="./header.jsp" %>
<div ng-app="supplierapp" ng-controller="supplierCtrl">

<div class="container">
<div class="row">
<div class="col-md-12"><h4>Cart List</h4>
<div></div>
<br>
<div class="table-responsive">
<table id="mytable" class="table table-bordred table-striped" >
<thead>
<tbody>
<tr>
<!-- <th>cartId</th> -->
<!-- <th>quantity</th> -->
<th>ProductName</th>
<th>ProductPrise</th>

<th>Date</th> 
<th>productImage</th>
<th></th>
<!-- <th>Delete|Edit|View</th> -->
</tr>
<!-- <td>{{x.cartItemId}}</td> -->
<!-- <td>{{x.quantity}}</td> -->
<td>{{x.productName}}</td>
<td>{{x.amount}}</td>
<td>{{x.orderDate}}</td> 
<td><img  src="resources/images/{{x.productId}}.jpg" width="100px" height="100px"> </td>
<td><a href="checkout-{{x.productId}}" class="btn btn-default">Checkout</a></td>
</tr>
</tbody>
</table>
</div>
</div>
</div>
</div>
</div>

 <script> 
var app = angular.module('supplierapp', []);
 app.controller('supplierCtrl', function($scope) {
    $scope.x = ${cartItemlist};
  
 });
 </script> 
 <%@ include file="./footer.jsp" %>  
</body>
</html>
