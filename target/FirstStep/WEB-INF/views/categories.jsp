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
  <style> 
  .categories{
    width:70%
 padding: 0;
}
 </style>
</head>
<body class="categories">
<form:form method="POST" action="add/categories" modelAttribute="category">
<form:input path="categoryId" hidden="true"/>
<label>CategoryName</label>
<form:input path="categoryName"/>
<label>CategoryDescription</label>
<form:input path="categoryDescription"/>
<input type="submit" value="Submit"/>
</form:form>
<div ng-app="myApp" ng-controller="myCtrl">
<table>
<tbody>
<tr>
<th>CategoryId</th>
<th>CategoryName</th>
<th>CategoryDesccription</th>
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
</body>
</html>