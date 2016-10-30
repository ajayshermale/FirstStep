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
<form:form method="POST" action="add/newsupplier" modelAttribute="supplierdetail">
<form:input path="userId" hidden="true"/>
<label>SupplierName</label>
<form:input path="username"/>
<label>Password</label>
<form:input path="password"/>
<label>SupplierFirstname</label>
<form:input path="userfirstname"/>
<label>SupplierLastname</label>
<form:input path="userlastname"/>
<label>Email</label>
<form:input path="email"/>
<label>ContactNumber</label>
<form:input path="contactnumber"/>
<label>ShippingAddress</label>
<form:input path="shippingAddress.landmark"/>
<label>BillingAddress</label>
<form:input path="billingAddress.landmark"/>


<input type="submit" value="Submit"/>
</form:form>
<div ng-app="myApp" ng-controller="myCtrl">
<table>
<tbody>
<tr>


</tr>
</tbody>
</table>
</div>

  
</body>
</html>