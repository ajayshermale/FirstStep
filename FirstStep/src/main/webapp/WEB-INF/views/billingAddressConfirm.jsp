<%@ page isELIgnored="false" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%@ include file="./header.jsp" %>
<br>
<div class="container">
		<div class="content">
			<fieldset>
				<legend>Confirm BillingAddress Details</legend>
			
				<a href="">Home</a><br /><br />
				
				   <sf:form method="POST"  modelAttribute="billingAddress">
				   
					<sf:label path="billingaddressId">BILLING ADDRESS:</sf:label>${billingAddress.billingaddressId}
					<br /><br />
					
					<sf:label path="landmark">Address:</sf:label>${billingAddress.landmark}
					<br /><br />
					
					<sf:label path="city">City :</sf:label>${billingAddress.city}
					<br /><br />
					
					<sf:label path="state">State:</sf:label>${billingAddress.state}
					<br /><br />
					
					<sf:label path="pincode">Pin Code:</sf:label>${billingAddress.pincode}
					<br /><br />
					
<%-- 					<sf:label path="contactnumber">contact number :</sf:label>${shippingAddress.contactnumber} --%>
<!-- 					<br /><br /> -->
						
					
					<!-- for triggering webflow events using form submission,
					 the eventId to be triggered is given in "name" attribute as:
					-->
					<input name="_eventId_edit" type="submit" value="Edit" /> 
					<input name="_eventId_submit" type="submit" value="submit" /><br />
				</sf:form>
			</fieldset></div>
		</div>
<%@ include file="./footer.jsp" %>
</body>
</html>

