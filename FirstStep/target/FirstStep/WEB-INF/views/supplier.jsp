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
<div class="container">
<body>
<form:form method="POST" action="add/supplier" modelAttribute="supplier">
<form:input path="supplierId" hidden="true"/>
<label>SupplierName</label>
<form:input path="supplierName"/>
<label>SupplierDesccription</label>
<form:input path="supplierDescription"/>
<input type="submit" value="Submit"/>
</form:form>
<div ng-app="myApp" ng-controller="myCtrl">
<table>
<tr>
<th>SupplierId</th>
<th>SupplierName</th>
<th>SupplierDesccription</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<tr ng-repeat="x in abc">
      <td>{{x.supplierId}}</td>
      <td>{{x.supplierName}}</td>
      <td>{{x.supplierDescription}}</td>
      <td><a href="deleteSupplier-{{x.supplierId}}">Delete</a></td>
      <td><a href="editSupplier-{{x.supplierId}}">Edit</a></td>
</tr>
</table>
</div>

<script>
var app = angular.module('myApp', []);
 app.controller('myCtrl', function($scope) {
    $scope.abc = ${supplierjson};
 });
</script> 
</div>
</body>
</html>