<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <h2>Student Information</h2>
<form:form method="POST" action="add/suppliers" commandName="suppliers" modelAttribute="suppliers">
   <table>
    <tr>
        <td><label > suppliername</label></td>
        <td><form:input path="supplierName" /></td>
    </tr>
    <tr>
        <td><label > supplierDescription</label></td>
        <td><form:input path="supplierDescription" /></td>
    </tr>
   
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form><br><br>
                 <table>
                <c:forEach var="supplier" items="${listSuppliers}" >
                <tr>
                    
                    <td>${supplier.supplierId}</td>
                    <td>${supplier.supplierName}</td>
                    <td>${supplier.supplierDescription}</td> 
                  
                </tr>
                </c:forEach>             
            </table>
        
    </body>
</html>