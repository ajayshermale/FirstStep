 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
   <script type="text/javascript" src="resources/js/jquery-3.1.1.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<body>
<%@ include file="./header.jsp" %>
<h1></h1>

<div class="container">
      <div class="row">
      <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
<!--            <A href="editUserDetail-{{username}}" >Edit Profile</A> -->
<A></A>
        <A href="perform_logout" >Logout</A>
       <br>
    
      </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
   
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">${userDetail.username} </h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-1 " align="center"> 
<!--                 <img alt="User Pic" src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png" class="img-circle img-responsive">  -->
                </div>

                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                    <tbody>
                      <tr>
                        <td>FirstName</td>
                        <td>:${userDetail.userfirstname}</td>
                      </tr>
                      <tr>
                        <td>LastName</td>
                        <td>:${userDetail.userlastname}</td>
                      </tr>
                      <tr>
                        <td>Password</td>
                        <td>:${userDetail.password}</td>
                      </tr>
                   
                         <tr>
<!--                              <tr> -->
<!--                         <td>Gender</td> -->
<%--                         <td>${userDetail.userfirstname}</td> --%>
<!--                       </tr> -->
<!--                         <tr> -->
<!--                         <td>Home Address</td> -->
<!--                         <td>Kathmandu,Nepal</td> -->
<!--                       </tr> -->
                      <tr>
                        <td>Email</td>
                        <td><a href="mailto:info@support.com">:${userDetail.email}</a></td>
                      </tr>
                      <tr>
                        <td>Phone Number</td>
                        <td>:${userDetail.contactnumber}</td>  
                      </tr>
                       <tr><td>Registration Date:</td>
                       <td>:${userDetail.orderDate}</td>
                         </tr>
                    </tbody>
                  </table>
                  
                  <a href="shippingaddress-{{userId}}" class="btn btn-primary">My Orders</a> 
                  <a href="wishlist" class="btn btn-primary">My Wishlist</a> 
                </div>
              </div>
            </div>
                 <div class="panel-footer">
<!--                         <a data-original-title="Broadcast Message" data-toggle="tooltip" type="button" class="btn btn-sm btn-primary"><i class="glyphicon glyphicon-envelope"></i></a> -->
<!--                         <span class="pull-right"> -->
<!--                             <a href="edit.html" data-original-title="Edit this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-warning"><i class="glyphicon glyphicon-edit"></i></a> -->
<!--                             <a data-original-title="Remove this user" data-toggle="tooltip" type="button" class="btn btn-sm btn-danger"><i class="glyphicon glyphicon-remove"></i></a> -->
<!--                         </span> -->
                     
                    </div>
            
          </div>
        </div>
      </div>
    </div>

<%@ include file="./footer.jsp" %>
</body>
</html>

