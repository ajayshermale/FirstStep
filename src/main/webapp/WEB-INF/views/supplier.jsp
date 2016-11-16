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

<br>
<div class="container">
<body>

<div ng-app="myApp" ng-controller="myCtrl">
<table>

<tr ng-repeat="x in abc">
       <td>{{x.supplierAddressId}}</td> 
      <td>{{x.supplierCompanyName}}</td>
      <td>{{x.supplierCompanyAddress}}</td>
      <td>{{x.supplierURL}}</td>
      <td>{{x.supplierCity}}</td>
      <td>{{x.supplierState}}</td>
      <td>{{x.supplierPincode}}</td>
      

</tr>
</table>
</div>

<script>
var app = angular.module('myApp', []);
 app.controller('myCtrl', function($scope) {
    $scope.abc = ${supjson};
 });
</script> 
</div>
</body>
</html>