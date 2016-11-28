<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>FORM</title>
      <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>
  <style> 
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}
 </style>
</head>
<body>
 
<form:form method="POST" action="addproduct" modelAttribute="product"  enctype="multipart/form-data">
<form:input path="productId" hidden="true"/>

<div class="container">
<label>PRODUCT NAME</label>
<form:input path="productName"  class="form-control"/>

<label>PRODUCT DESCRIPTION</label>
<form:input path="productDescription"  class="form-control"/>

<label>PRODUCT PRISE</label>
<form:input path="productPrice"  class="form-control"/>

<label>SUBCATEGORY NAME</label>
<form:select path="Subcategory.subcategoryName" items="${listsubCategory}" itemValue="subcategoryName" itemLabel="subcategoryName">
</form:select>
<label>SUPPLIERCOMPANY NAME</label>
<form:select path="Supplier.supplierCompanyName" items="${SupplierList}" itemValue="supplierCompanyName" itemLabel="supplierCompanyName">
</form:select>

<div class="form-group">
<label for="image">Upload File</label>
 <form:input class="form-control" path="productImage" type="file"/>
</div> 

<input type="submit" value="Submit"/>
</form:form>

<div ng-app="supplierapp" ng-controller="supplierCtrl">
<table>
<tbody>
<tr>
<th>ProductId</th>
<th>ProductName</th>
<th>ProductDescription</th>
<th>ProductPrise</th>
<th>productImage</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<tr ng-repeat="x in abc">
      <td>{{x.productId}}</td>
      <td>{{x.productName}}</td>
      <td>{{x.productDescription}}</td>
      <td>{{x.productPrice}}</td>
      <td><img  src="resources/images/{{x.productId}}.jpg"> 
      <td><a href="deleteproduct-{{x.productId}}">Delete</a></td>
      <td><a href="editproduct-{{x.productId}}">Edit</a></td>
</tr>
</tbody>
</table>
</div>

 <script> 
var app = angular.module('supplierapp', []);
 app.controller('supplierCtrl', function($scope) {
    $scope.abc = ${productjson};
 });
 </script>   
</div>
</body>
</html>
<%@ include file="footer.jsp" %>