
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>FORM</title>
 
      
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
 <br>
 
>


<label>PRODUCT NAME</label>


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
</body>
</html>
<%@ include file="footer.jsp" %>
