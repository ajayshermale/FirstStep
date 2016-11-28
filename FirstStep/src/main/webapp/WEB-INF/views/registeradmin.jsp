<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
         <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
      <script src="resources/js/angular.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      
</head>
<body>

<form:form method="POST" action="addregisteradmin" modelAttribute="admin">
<form:input path="userId" hidden="true"/>
<div class="container">
<label>UserName</label>
<form:input path="username" class="form-control"/>
<label>Password</label>
<form:input path="password" class="form-control"/>
<label>UserFirstname</label>
<form:input path="userfirstname" class="form-control"/>
<label>UserLastname</label>
<form:input path="userlastname" class="form-control"/>
<label>Email</label>
<form:input path="email" class="form-control"/>
<label>ContactNumber</label>
<form:input path="contactnumber" class="form-control"/>
<div class="checkbox">
<input type="submit" value="Submit"/></div>
</div>
</form:form>



</body>
</html>