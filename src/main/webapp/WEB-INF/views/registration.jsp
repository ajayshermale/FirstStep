<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
 .error 
    {
        color: #ff0000;
        font-weight: bold;
    }
</style>
<head>
<title>FORM</title>
          <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<form:form method="POST" commandName="userDetail">
<form:input path="userId" hidden="true"/>
<div class="container">
<label>UserName</label>
<form:input path="username" class="form-control"   />

<!-- to display validation messages -->
<form:errors path="username" cssClass="error" />
<%-- 					<c:forEach   items="${flowRequestContext.messageContext.getMessagesBySource('username')}" var="err"  > --%>
<%-- 					  <div><span>${err.text}</span></div> --%>
<%-- 					</c:forEach> --%>
					<br>
<label>Password</label>
<form:input path="password" class="form-control"/>
<!-- to display validation messages -->
<form:errors path="password" cssClass="error" />
<br>
<label>UserFirstname</label>
<form:input path="userfirstname" class="form-control"/>
<!-- to display validation messages -->
<form:errors path="password" cssClass="error" />
<br>
<label>UserLastname</label>
<form:input path="userlastname" class="form-control"/>
<!-- to display validation messages -->
<form:errors path="password" cssClass="error" />
<br>
<label>Email</label>
<form:input path="email" class="form-control"/>
<!-- to display validation messages -->
<form:errors path="email" cssClass="error" />

<%--                    <c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('email')}" var="err"> --%>
<%-- 					  <div><span>${err.text}</span></div> --%>
<%-- 					</c:forEach> --%>
<br>					
<label>ContactNumber</label>
<form:input path="contactnumber" class="form-control"/>
<!-- to display validation messages -->
<form:errors path="contactnumber" cssClass="error" />
<%--                     <c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('contactnumber')}" var="err"> --%>
<%-- 					  <div><span>${err.text}</span></div> --%>
<%-- 				   	</c:forEach> --%>

<br>



 <div class="checkbox">
<input name="_eventId_submit" type="submit" value="Submit" />
</div>
 </div> 
</form:form>
</body>
</html>
<%@ include file="footer.jsp" %>