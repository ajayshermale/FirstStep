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

</head>
<body>
<%@ include file="./header.jsp" %>
<br>
<form:form method="POST" commandName="shippingAddress"  >
<div class="container">
<label>SHIPPING ADDRESS: </label>
<div>
<label>Address</label>
<form:input path="landmark" class="form-control"/>
<br>
<label>City</label>
<form:input path="city"/>

<label>State</label>
<form:input path="state"/>

<label>Pin Code</label>
<form:input path="pincode"/><br>
</div>
<div>

</div>
 <div class="checkbox">
<input name="_eventId_submit" type="submit" value="Submit" />
</div></div>
</form:form>
  <%@ include file="./footer.jsp" %>
</body>
</html>
