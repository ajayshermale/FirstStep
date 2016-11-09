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
<div class="container">
<form:form method="POST" action="add/categories" modelAttribute="category">
<form:input path="categoryId" hidden="true"/>
<div>
<label>CategoryName</label>
<form:input path="categoryName" class="form-control"/>
<label>CategoryDescription</label>
<form:input path="categoryDescription" class="form-control"/>
</div>
<input type="submit" value="Submit"/>
</form:form>
<div ng-app="myApp" ng-controller="myCtrl">
<table>
<tbody>
<tr>
<th>CategoryId</th>
<th>CategoryName</th>
<th>CategoryDescription</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<tr ng-repeat="x in abc">
      <td>{{x.categoryId}}</td>
      <td>{{x.categoryName}}</td>
      <td>{{x.categoryDescription}}</td>
      <td><a href="deleteCategory-{{x.categoryId}}">Delete</a></td>
      <td><a href="editCategory-{{x.categoryId}}">Edit</a></td>
</tr>
</tbody>
</table>
</div>

<script>
var app = angular.module('myApp', []);
 app.controller('myCtrl', function($scope) {
    $scope.abc = ${categoryjson};
 });
</script> 
</div>
</body>
</html>
<%@ include file="footer.jsp" %>