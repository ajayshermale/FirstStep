<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="./header.jsp" %>

<form:form method="POST" commandName="billingAddress">
<form:input path="billingaddressId" hidden="true"/>
<br>
<div class="container">
<label>BILLING ADDRESS: </label>
<div>
<label>Address</label>
<form:input path="landmark" class="form-control"/>
<br>
<label>City</label>
<form:input path="city"/>
<label>State</label>
<form:input path="state"/>

<label>Pin Code</label>
<form:input path="pincode"/>
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
