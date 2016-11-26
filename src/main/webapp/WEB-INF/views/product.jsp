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
 <div class="container side-collapse-container">
<form:form method="POST" action="addproduct" modelAttribute="product"  enctype="multipart/form-data">
<form:input path="productId" hidden="true"/>


<label>PRODUCT NAME</label>
<form:input path="productName"  class="form-control"/>
<br>
<label>PRODUCT DESCRIPTION</label>
<form:input path="productDescription"  class="form-control"/>
<br>
<label>PRODUCT PRISE</label>
<form:input path="productPrice"  class="form-control"/>
<br>



 <div class="form-group">
<label class="sr-only">Stock Keeping Unit:</label>
<form:input path="sku" placeholder="Enter Stock Keeping Unit:"/>

<label class="sr-only">ShoeType:</label>
<form:input path="shoeType" placeholder="Enter ShoeType:" />
</div>


 <div class="form-group">
<label class="sr-only">Brands:</label>
<form:input path="brands" placeholder="Enter Brands:" />

<label class="sr-only">Colour:</label>
<form:input path="colours" placeholder="Enter Colour:" />
</div>


 <div class="form-group">
<label class="sr-only">Upper Material:</label>
<form:input path="upperMaterial" placeholder="Enter Upper Material:" />

<label class="sr-only">Inner material:</label>
<form:input path="innerMaterial"  placeholder="Enter Inner material:"/>
</div>


 <div class="form-group">
<label class="sr-only">Sole Material:</label>
<form:input path="soleMaterial"  placeholder="Enter Sole Material:"/>

<label class="sr-only">Heel Height:</label>
<form:input path="heelHeight"  placeholder="Enter Heel Height:" />
</div>

<label class="sr-only">quantity:</label>
<form:input path="quantity"  placeholder="Enter quantity:" />
<br>
<br>
 <div class="form-group">
<label>SUBCATEGORY NAME:</label>
<form:select path="Subcategory.subcategoryName" items="${listsubCategory}" itemValue="subcategoryName" itemLabel="subcategoryName">
</form:select>

<label>SUPPLIERCOMPANY NAME:</label>
<form:select path="Supplier.supplierCompanyName" items="${SupplierList}" itemValue="supplierCompanyName" itemLabel="supplierCompanyName">
</form:select>
</div>

<br><br>
<div class="form-group">
<label for="image">Upload File</label>
 <form:input class="form-control" path="productImage" type="file" value="Upload Image"/>
</div> 

<input type="submit" value="Submit"/>
</form:form>

<div ng-app="supplierapp" ng-controller="supplierCtrl">


<div class="row">
	       <div class="col-md-12">
               <h4>Product List</h4>
                              <div>
<label>Search</label>
<input type="text" ng-model="test"/>
</div><br>
   <div class="table-responsive">
                    <table id="mytable" class="table table-bordred table-striped" bgcolor="#00FF00">
                    <thead>
<tbody>
<tr>
<th>ProductId</th>
<th>ProductName</th>
<th>ProductPrise</th>
<th>productDescription</th>
<td>Date</td> 
<th>productImage</th>

<th>Delete|Edit|View</th>
<!-- <th>Edit</th> -->
<!-- <th>view</th> -->
</tr>
<tr ng-repeat="x in abc| filter: test  ">
      <td>{{x.productId}}</td>
      <td>{{x.productName}}</td>
      <td>{{x.productPrice}}</td>
       <td>{{x.productDescription}}</td> 
       <td>{{x.orderDate}}</td> 
<!--       <td>{{x.supplierCompanyName}}</td> -->
      <td><img  src="resources/images/{{x.productId}}.jpg" width="100px" height="100px"> 
      <td><a href="deleteproduct-{{x.productId}}" class="btn btn-default">Delete</a>
      <a href="editproduct-{{x.productId}}" class="btn btn-default">Edit</a>
     <a href="viewproduct-{{x. productId}}-product"class="btn btn-default">View</a></td>
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
    $scope.abc = ${productjson};
  
 });
 </script>   
</div>
</sec:authorize>
<%@ include file="./footer.jsp" %>
</body>
</html>

