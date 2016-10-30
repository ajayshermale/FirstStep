<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="index.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>FORM</title>
      <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>

</head>
<body>
<form:form method="POST" action="add/product" modelAttribute="product">
<form:input path="productId" hidden="true"/>
<label>ProductName</label>
<form:input path="productName"/>
<label>ProductDescription</label>
<form:input path="productDescription"/>
<label>ProductPrice</label>
<form:input path="productPrice"/>

<label>SubcategoryName</label>
<form:select path="Subcategory.subcategoryName" items="${listsubCategory}" itemValue="subcategoryName" itemLabel="subcategoryName">
</form:select>
<label>SupplierName</label>
<form:select path="Supplier.supplierName" items="${SupplierList}" itemValue="supplierName" itemLabel="supplierName">
</form:select>
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
<th>Delete</th>
<th>Edit</th>
</tr>
<tr ng-repeat="x in abc">
      <td>{{x.productId}}</td>
      <td>{{x.productName}}</td>
      <td>{{x.productDescription}}</td>
      <td>{{x.productPrice}}</td>
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
</body>
</html>