<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
.loginmodal-container {
  padding: 30px;
  max-width: 350px;
  width: 100% !important;
  background-color: #F7F7F7;
  margin: 0 auto;
  border-radius: 2px;
  box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  overflow: hidden;
  font-family: roboto;
}

.loginmodal-container a {
  text-decoration: none;
  color: #666;
  font-weight: 400;
  text-align: center;
  display: inline-block;
  opacity: 0.6;
  transition: opacity ease 0.5s;
} 
.loginmodal-container input[type=text], input[type=password] {
  height: 44px;
  font-size: 16px;
  width: 100%;
  margin-bottom: 10px;
  -webkit-appearance: none;
  background: #fff;
  border: 1px solid #d9d9d9;
  border-top: 1px solid #c0c0c0;
  /* border-radius: 2px; */
  padding: 0 8px;
  box-sizing: border-box;
  -moz-box-sizing: border-box;
}

</style>

<head>
<title>Login Page</title>
</head>
<body>
<%@ include file="./header.jsp" %>
<!-- <div class="container side-collapse-container"> -->
<!-- <div class="container"> -->

  <div class="modal-dialog">
				<div class="loginmodal-container">
					<h1>Login to Your Account</h1><br>
				  <form method="post" action="perform_login">
					<input type="text" name="username" placeholder="Username">
					<input type="password" name="password" placeholder="Password">
					<input name="submit" type="submit"  class="btn btn-default"  value="Login" />
				  </form>
					
			
				</div>

<!-- 		<table> -->
<!-- 			<tr> -->
<!-- 				<td>UserName:</td> -->
<!-- 				<td><input type='text' name='username' /></td> -->
<!-- 			</tr> -->
			
<!-- 			<tr> -->
<!-- 				<td>Password:</td> -->
<!-- 				<td><input type='password' name='password' /></td> -->
<!-- 			</tr>	 -->
			
<!-- 			<tr>  -->
<!-- 				<td colspan='2'><input name="submit" type="submit" -->
<!-- 					value="Login" /></td> -->
<!-- 			</tr> -->
<!-- 		</table> -->
		</form>
		</div></div>
		<%@ include file="./footer.jsp" %>
</body>
