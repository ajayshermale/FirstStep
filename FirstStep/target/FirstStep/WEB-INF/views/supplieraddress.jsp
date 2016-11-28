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

</head>
<body>
<form:form method="POST" commandName="supplier">

<div class="container">
<label>SUPPLIER ADDRESS: </label>
<div>
<label>supplieCompanyname</label>
<form:input path="supplierCompanyName" class="form-control"/>

<label>supplieCompanyrAddress</label>
<form:input path="supplierCompanyAddress" class="form-control"/>

<label>supplierURL</label>
<form:input path="supplierURL" class="form-control"/>

<label>City</label>
<form:input path="supplierCity" />

<label>State</label>
<form:input path="supplierState"/>

<label>Pin Code</label>
<form:input path="supplierPincode"/>
</div>
<div>

</div>
 <div class="checkbox">
<input name="_eventId_submit" type="submit" value="Submit" />
</div></div>
</form:form>
  
</body>
</html>
<%@ include file="footer.jsp" %>