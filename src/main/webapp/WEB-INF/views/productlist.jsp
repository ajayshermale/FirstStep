
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

      
<style>
<!--product css -->

body{
    background:#fff;;
}
.title{
    text-shadow: 2px 2px 0px rgba(0, 0, 0, 0.4) !important;    
}

.divider-title{
    border:1px solid #dddddd;
}

.project {
    margin-bottom: 30px;
    vertical-align: top;
    margin-right: 30px;
    float: left;
    cursor: pointer;
    width:100%;
}

.project figure {
    position: relative;
    display: inline-block;
    width: 283px;
    -moz-box-shadow: 0 3px 0 #e2e2e2,transparent 0 0 0;
    -webkit-box-shadow: 0 3px 0 #e2e2e2,transparent 0 0 0;
    box-shadow: 0 3px 0 #e2e2e2,transparent 0 0 0;
    -webkit-box-shadow: 0 3px 0 #e2e2e2;
    -moz-box-shadow: 0 3px 0 #e2e2e2;
    box-shadow: 0 3px 0 #e2e2e2;
}

.project figure figcaption {
    position: relative;
    z-index: 10;
    padding: 8px 18px 11px;
    background: #fff;
    -ms-transition: all .2s ease-out;
    -webkit-transition: all .2s ease-out;
    -moz-transition: all .2s ease-out;
    -o-transition: all .2s ease-out;
    transition: all .2s ease-out;
    text-align: left;
    color: #555;
}

.project figure:hover .actions {
    opacity: 1;
}

.project figure .actions {
    display: block;
    position: absolute;
    top: 0;
    z-index: 1;
    width: 100%;
    height: 100%;
    opacity: 0;
    background-color: rgba(29,29,29,.7);
    -ms-transition: all .2s ease-out;
    -webkit-transition: all .2s ease-out;
    -moz-transition: all .2s ease-out;
    -o-transition: all .2s ease-out;
    transition: all .2s ease-out;
}

.project figure img {
    border: 0;
    width: 100%;
}
.btn-warning bnt-action{
    margin: 0% 0% auto;    
}

figcaption .project-details {
    display: block;
    font-size: 16px;
    line-height: 33px;
    color: #0093d0;
    height: 27px;
    width: 85%;
    margin-bottom: 5px;
    overflow: hidden;
}

figcaption .project-price {
    position: absolute;
    right: 15px;
    top: 12px;
    font-size: 22px;
    text-align: right;
    margin-top: 8px;
    letter-spacing: -1px;
    -webkit-font-smoothing: antialiased;
}

figcaption .project-creator {
    font-size: 13px;
    color: #545454;
    display: block;
}

figcaption .project-creator {
    font-size: 13px;
    color: #545454;
    display: block;
}

.project figure .actions button {
    padding: 13px 20px;
    font-size: 16px;
    top: 32%;
    position: absolute;
    left: 50%;
    width: 90%;
    margin-left: -45%;
    line-height: 18px;
    letter-spacing: 1px;
} 
.col-md-6 {
      
    margin-left: 60%;
}

</style>




</head>
<body>

 <div class="container"> 
<div>



   
    <hr class="divider-title" ng-app="supplierapp" ng-controller="supplierCtrl">
     <div ng-model="searchKeyword" >
     
    <div class="col-ms-10 col-md-4" ng-repeat="x in abc | filter: searchKeyword"  >
        <div class="project">
            <figure class="img-responsive">
              <img class="group list-group-image" src="resources/images/{{ap.productId}}.jpg" width="400px" height="300px" />
            
                <figcaption>
                    <span class="project-details"><strong>{{x.productName}}</strong></span>
                    <span class="project-price"><strong><p1>Rs</p1>{{x.productPrice}}</strong></span>

                </figcaption>
   
                <span class="actions">
                <a href="viewproduct-{{x. productId}}-product">
                        <button  class="btn btn-warning bnt-action" type="submit" >View </button></a>
                 </span>
                   
            </figure>

  </div>
  </div>
   </div>
</div>
</div>


  <script>  
 var app = angular.module('supplierapp', []);
  app.controller('supplierCtrl', function($scope,$http,$location) { 
     $scope.abc = ${productjson};  
   $scope.searchKeyword=location.search.substr(8);
	   $scope.letterlimit=3;   
  });
  </script> 






</body>
</html>