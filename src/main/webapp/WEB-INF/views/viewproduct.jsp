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
</head>
<body>
<br>
<div class="container">
<div ng-app="supplierapp" ng-controller="supplierCtrl">

           
      <td><img  src="resources/images/{{abc.productId}}.jpg"  class="img-rounded" alt="Cinque Terre" width="304" height="236"></td>
     
      
<!--       {{abc.productName}} -->
<!--       {{abc.productDescription}} -->
<!--       {{abc.productPrice}} -->
    
    
<div class="container">
  <h2> {{abc.productName}}</h2>
  <p></p>
  <table class="table">
    <thead>
      <tr>
        <th>PRODUCT DESCRIPTION</th>
<!--         <th>productPrice</th> -->
       
      </tr>
    </thead>
    <tbody>
      <tr>
<!--         <td>{{abc.productDescription}}</td> -->
     <tr><td>SKU<td>{{abc.sku}}</td>
      <tr><td>SHOE TYPE<td>{{abc.shoeType}}</td>
       <tr><td>BRAND<td>{{abc.brands}}</td>
       <tr><td>COLOUR<td>{{abc.colours}}</td>
       <tr><td>UPPER MATERIAL<td>{{abc.upperMaterial}}</td>
       <tr><td>INNER MATERIAL<td>{{abc.innerMaterial}}</td>
        <tr><td>SOLE MATERIAL<td>{{abc.soleMaterial}}</td>
        <tr><td> HEEL HEIGHT<td>{{abc.heelHeight}}</td>
         
         
<!--         <td> {{abc.productPrice}}</td> -->
      
   
      </tr>
    </tbody>
  </table>
    
    
<!--       <td><a href="viewproduct-{{abc. productId}}-product"></a></td> -->

</div></div>
<div>
 <script> 
var app = angular.module('supplierapp', []);
 app.controller('supplierCtrl', function($scope) {
    $scope.abc = ${productview};
 });
 </script> </div>
</body>

</html>