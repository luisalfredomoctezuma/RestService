<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
              var Person1 = Backbone.Model.extend({}),
  People1 = Backbone.Collection.extend({
  	model: Person1,
  url: 'http://localhost:8080/test-nasoft/webresources/persistence.usertbl'
  		});
                 var people1 = new People1();
    function putn() { 
var em = document.getElementById("email").value;
var nm = document.getElementById("name").value;
var ps = document.getElementById("pass").value;
people1.create({mail:em,name:nm,password:ps});
 }
        </script>
        
                <script type="text/javascript">
              var Person = Backbone.Model.extend({}),
  People = Backbone.Collection.extend({
  	model: Person,
  url: 'http://localhost:8080/test-nasoft/webresources/persistence.usrmobiletbl'
  		});
                 var people = new People();
    function putd() { 
 var pl = document.getElementById("Platform").value;
 var os = document.getElementById("op").value;
  var edo = document.getElementById("edo").value;
   var idu = document.getElementById("idus").value;
  people.create({platform:pl,operating_system:os,isActive:edo,id_User:idu});
 }
 
        </script>
        <script type="text/javascript">
    function valid(form){
    
    var input=0;
    input=document.myform.data.value;
var Person= Backbone.Model.extend({}),
People = Backbone.Collection.extend({
model:Person,
url: 'http://localhost:8080/test-nasoft/webresources/persistence.usrmobiletbl'
}); 
var people = new People();
var person = new Person ({id: input});
people.add(person);
person.fetch({
success: function (){
console.log(JSON.stringify(person));
}

});
    }
</script>

      <div class="container">
             <div class="row">
                 <div class="col-md-4">  
                      <h1>Test Nasoft</h1>   
                     <h2><a href="">Code at github</a></h2>
                     
                 </div>
        <div class="col-md-4">
        <div class="tabbable"> <!-- Only required for left/right tabs -->
  <ul class="nav nav-tabs">
    <li class="active"><a href="#tab1" data-toggle="tab">Add user</a></li>
    <li><a href="#tab2" data-toggle="tab">Add device</a></li>
    <li><a href="#tab3" data-toggle="tab">Search</a>  </li>
  </ul>
            
  <div class="tab-content">
    <div class="tab-pane active" id="tab1">
   <h3 class="text-success">Register</h3>
<form action="#tab2" onsubmit="return putn()">
    <h3>email</h3> <input type="email" id="email" name="email"required><br> 
    <h3>name</h3> <input type="text" id="name" name="name" required ><br> 
    <h3>password</h3> <input type="password" id="pass" name="pass" required ><br><br> 
    <input type="submit"  class="btn btn-lg btn-success" value="Register">   
</form>
    </div>
      
      <div class="tab-pane" id="tab2">
      <p>Your Device</p>
<form action="" onsubmit="return putd()">
    <h3>Platform</h3> <input type="text" id="platform" name="platform" required><br> 
    <h3>Operating System</h3> <input type="text" id="op" name="op" required ><br> 
    <h3>Estado</h3> <input type="text" id="edo" name="edo" required ><br> 
    <h3>IdUser</h3> <input type="text" id="idus" name="idus" required ><br> 
    <input type="submit"  class="btn btn-lg btn-success" value="Input">   
</form>
      
      
    </div>
      
    <div class="tab-pane" id="tab3">
      <form name="myform">
    <h3>id user</h3> <input type="text" name="data" required ><br> <br> 
    <input type="submit"  class="btn btn-lg btn-success" value="Search">     
</form>
    </div>
  </div>
            
          </div>
          </div>
          <div class="col-md-4"></div>
          </div>
        </div> 
    </body>
</html>
