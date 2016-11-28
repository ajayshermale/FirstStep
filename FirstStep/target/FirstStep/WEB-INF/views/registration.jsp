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
<form:form method="POST" commandName="userDetail">
<form:input path="userId" hidden="true"/>
<div class="container">
<label>UserName</label>
<form:input path="username" class="form-control"/>
<!-- to display validation messages -->
					<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('username')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach>
					
<label>Password</label>
<form:input path="password" class="form-control"/>

<label>UserFirstname</label>
<form:input path="userfirstname" class="form-control"/>

<label>UserLastname</label>
<form:input path="userlastname" class="form-control"/>

<label>Email</label>
<form:input path="email" class="form-control"/>

                   <c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('email')}" var="err">
					  <div><span>${err.text}</span></div>
					</c:forEach>
					
<label>ContactNumber</label>
<form:input path="contactnumber" class="form-control"/>

                    <c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('contactnumber')}" var="err">
					  <div><span>${err.text}</span></div>
				   	</c:forEach>


<!-- <label>SHIPPING ADDRESS: </label></div> -->
<!-- <div> -->
<!-- <label>Landmark</label> -->
<%-- <form:input path="shippingAddress.landmark"/> --%>
<!-- <label>State</label> -->
<%-- <form:input path="shippingAddress.state"/> --%>
<!-- <label>City</label> -->
<%-- <form:input path="shippingAddress.city"/> --%>
<!-- <label>Pincode</label> -->
<%-- <form:input path="shippingAddress.pincode"/> --%>
<!-- </div> -->
<!-- <div> -->
<!-- <label>BILLING ADDRESS: </label></div> -->
<!-- <div> -->
<!-- <label>Landmark</label> -->
<%-- <form:input path="billingAddress.landmark"/> --%>
<!-- <label>State</label> -->
<%-- <form:input path="billingAddress.state"/> --%>
<!-- <label>City</label> -->
<%-- <form:input path="billingAddress.city"/> --%>
<!-- <label>Pincode</label> -->
<%-- <form:input path="billingAddress.pincode"/> --%>
<!-- </div> -->


 <div class="checkbox">
<input name="_eventId_submit" type="submit" value="Submit" />
</div>
 </div> 
</form:form>
</body>
</html>
<%@ include file="footer.jsp" %>