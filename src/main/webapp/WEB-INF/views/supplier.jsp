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
 <h1 class="text-center text-primary title">SUPPLIER DETAIL</h1>
    <hr class="divider-title">
<br>
<div class="container">

<!-- <tr ng-repeat="x in abc"> -->
 <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <th>SUPPLIER CONPANY NAME</th>
                        <td>${supplier.supplierCompanyName}</td> 
                      </tr>
                        <tr>
                        <th>SUPPLIER URL</th>
                      <td>${supplier.supplierURL}</td>
                      </tr>
                       <tr>
                          <th>SUPPLIER CITY</th>
                           <td>${supplier.supplierCity}</td>
                      </tr>
                       <tr>
                          <th>SUPPLIER STATE</th>
                        <td>${supplier.supplierState}</td>
                      </tr>
                       <tr>
                          <th>SUPPLIER PINCODE</th>
                         <td>${supplier.supplierPincode}</td> 
                      </tr>
</table>
</div>
<%@ include file="./footer.jsp" %>
</body>
</html>
