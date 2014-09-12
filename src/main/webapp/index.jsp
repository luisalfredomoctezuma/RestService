<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TestNasoft</title>
                <script src="jquery-1.7.2.js"></script>
    <script src="underscore.js"></script>
    <script src="backbone.js"></script>
        <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <script type="text/javascript">
              var Person = Backbone.Model.extend({}),
  People = Backbone.Collection.extend({
  	model: Person,
  url: 'http://localhost:8080/test-nasoft/webresources/persistence.usertbl'
  		});
                 var people = new People();
    function putn() { 
 var em = document.getElementById("email").value;
 var nm = document.getElementById("name").value;
 var ps = document.getElementById("pass").value;
  people.create({mail:em,name:nm,password:ps});
 }
        </script>
      <div class="container">
            
             <div class="row">
                 <div class="col-md-4">   
                     <h1>Test Nasoft</h1>   
                     <h2><a href="">Code at github</a></h2>
                      <h2><a href="">by @luisalfredomoc</a></h2>
                 </div>
        <div class="col-md-4">
            <h3 class="text-success">Register</h3>
<form action="user.html" onsubmit="return putn()">
    <h3>email</h3> <input type="email" id="email" name="email"required><br> 
    <h3>name</h3> <input type="text" id="name" name="name" required ><br> 
    <h3>password</h3> <input type="password" id="pass" name="pass" required ><br><br> 
    <input type="submit"  class="btn btn-lg btn-success" value="Register">   
</form>
          </div>
          </div>
          <div class="col-md-4"></div>
          </div>
        </div> 
    </body>
</html>
