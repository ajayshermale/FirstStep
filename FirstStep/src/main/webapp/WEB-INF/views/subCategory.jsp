<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>FORM</title>
      <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>
      
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      
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
<%@ include file="./header.jsp" %>
<br>
<sec:authorize access="hasAnyRole('ROLE_ADMIN', 'ROLE_SUPPLIER')">
<div class="container">
<form:form method="POST" action="add/subCategory" modelAttribute="subCategory">
<form:input path="subcategoryId" hidden="true"/>
<label>SubcategoryName</label>
<form:input path="subcategoryName" class="form-control"/><br>
<label>SubcategoryDescription</label>
<form:input path="subcategoryDescription" class="form-control"/><br>
<label>CategoryName</label>
<form:select path="category.categoryName" items="${listCategory}" itemValue="categoryName" itemLabel="categoryName">
</form:select><br>
<input type="submit" value="Submit"/>
</form:form><br>
<div ng-app="myApp" ng-controller="myCtrl">
<div style="overflow-x:auto;">
<table>
<tbody>
<tr>
<th>SubcategoryId</th>
<th>SubcategoryName</th>
<th>SubcategoryDescription</th>
<th>Delete</th>
<th>Edit</th>
</tr>
 <div>
<label>Search</label>
<input type="text" ng-model="test"/>
</div><br>

<tr ng-repeat="x in abc | filter: test  ">
      <td>{{x.subcategoryId}}</td>
      <td>{{x.subcategoryName}}</td>
      <td>{{x.subcategoryDescription}}</td>
      <td> <a href="deletesubCategory-{{x.subcategoryId}}" class="btn btn-default">Delete</a></td>
      <td><a href="editsubCategory-{{x.subcategoryId}}" class="btn btn-default">Edit</a></td>
</tr>
</tbody>
</table>
</div></div>
</div>
<script>
var app = angular.module('myApp', []);
 app.controller('myCtrl', function($scope) {
    $scope.abc = ${subCategoryjson};
 });
</script>  
</sec:authorize>
<%@ include file="./footer.jsp" %>
</body>
</html>
