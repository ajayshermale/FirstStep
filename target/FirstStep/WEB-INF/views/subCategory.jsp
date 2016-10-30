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
<form:form method="POST" action="add/subCategory" modelAttribute="subCategory">
<form:input path="subcategoryId" hidden="true"/>
<label>SubcategoryName</label>
<form:input path="subcategoryName"/>
<label>SubcategoryDescription</label>
<form:input path="subcategoryDescription"/>
<label>CategoryName</label>
<form:select path="category.categoryName" items="${listCategory}" itemValue="categoryName" itemLabel="categoryName">
</form:select>
<input type="submit" value="Submit"/>
</form:form>
<div ng-app="myApp" ng-controller="myCtrl">
<table>
<tbody>
<tr>
<th>SubcategoryId</th>
<th>SubcategoryName</th>
<th>SubcategoryDescription</th>
<th>Delete</th>
<th>Edit</th>
</tr>
<tr ng-repeat="x in abc">
      <td>{{x.subcategoryId}}</td>
      <td>{{x.subcategoryName}}</td>
      <td>{{x.subcategoryDescription}}</td>
        <td><a href="deletesubCategory-{{x.subcategoryId}}">Delete</a></td>
      <td><a href="editsubCategory-{{x.subcategoryId}}">Edit</a></td>
</tr>
</tbody>
</table>
</div>

<script>
var app = angular.module('myApp', []);
 app.controller('myCtrl', function($scope) {
    $scope.abc = ${subCategoryjson};
 });
</script>  
</body>
</html>