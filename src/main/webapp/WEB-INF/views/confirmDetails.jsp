<%@ page isELIgnored="false" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow </title>
		<link href="style.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
	 <%@ include file="./header.jsp" %>
	<div class="container">
		<div class="content">
			<fieldset>
				<legend>Confirm Details</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as: -->
				<a href="">Home</a><br /><br />
				
				   <sf:form method="POST"  modelAttribute="userDetail">
					<sf:label path="username">UserName:</sf:label>${userDetail.username}
					<br /><br />
					
					<sf:label path="password">Password:</sf:label>${userDetail.password}
					<br /><br />
					
					<sf:label path="userfirstname">firstname :</sf:label>${userDetail.userfirstname}
					<br /><br />
					
					<sf:label path="userlastname">lastname:</sf:label>${userDetail.userlastname}
					<br /><br />
					
					<sf:label path="email">Email Id:</sf:label>${userDetail.email}
					<br /><br />
					
					<sf:label path="contactnumber">contact number :</sf:label>${userDetail.contactnumber}
					<br /><br />
						
					
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
