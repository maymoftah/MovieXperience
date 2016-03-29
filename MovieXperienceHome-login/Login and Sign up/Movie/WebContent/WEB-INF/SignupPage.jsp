<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Movie Xperience</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <link href="static/css/style.css" rel="stylesheet">
    
    <script src="static/js/scripts.js" ></script>

  </head>
  <body >
  <!-- Code added here -->
  
 

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<img alt="Bootstrap Image Preview" src="http://png.clipart.me/graphics/thumbs/102/vector-illustration-of-cinema-clap-and-film-reel_102906023.jpg" class="img-circle">
			<div class="page-header">
				<h1>
					MovieXperience!!
				</h1>
			</div>
			<nav class="navbar navbar-default navbar-inverse navbar-fixed-top" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="#">MovieXperience</a>
				</div>
				<form:errors path="signup1.*"/>
				<!-- 
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="#">Link</a>
						</li>
						
						<!-- <li>
							<a href="#">Link</a>
						</li> -->
					<!--	<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control">
						</div> 
						<button type="submit" class="btn 
						btn-default">
							Submit
						</button>
					</form> -->
					<ul class="nav navbar-nav navbar-right">
						<!-- <li>
							<a href="#">SignIn</a>
						</li>
						<li>
							<a href="#">SignOut</a>
						</li> -->
						
						<!-- <li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									<a href="#">Action</a>
								</li>
								<li>
									<a href="#">Another action</a>
								</li>
								<li>
									<a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									<a href="#">Separated link</a>
								</li>  -->
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-md-6">
			<div class="page-header">
				<h1>
					 <small>Enjoy Unlimited movie watching!</small>
				</h1>
			</div>
			<blockquote>
				<p>
					The best one stop movie watching experience...
				</p> <!-- <small>Fisher Jose <cite>Source Title</cite></small> -->
			</blockquote>


<!-- original code -->
    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3 class="text-muted">
				Sign up for a whole new movie watching experience!
			</h3>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
		</div>
		<div class="col-md-4">
		
			<form class="form-horizontal" role="form" name="myForm" method ="post" onSubmit="return validation(this);" action="/Movie/SignupSuccesshome.html">
				<div class="form-group">
					 
					<label for="inputEmail3" class="col-sm-2 control-label">
						Email
					</label>
					<div class="col-sm-10">
						<input type="email" class="form-control" id="emailid" name="emailid"><p id="InvalidEmail" style="color:red"></p>
					</div>
				</div>
				
				<div class="form-group">
					 
					<label for="firstname" class="col-sm-2 control-label">
						First Name
					</label> 
					<div class="col-sm-10">
						<input type="text" class="form-control" id="firstname" name="firstname"><p id="InvalidFirstName" style="color:red"></p>
					</div>
				</div>
				<div class="form-group">
					 
					<label for="lastname" class="col-sm-2 control-label">
						Last Name 
					</label> 
					<div class="col-sm-10">
						<t><t><input type="text" class="form-control" id="lastname" name="lastname"><p id="InvalidLastName" style="color:red"></p>
					</div>
				</div>
				
				
				<div class="form-group">
					 
					<label for="inputPassword3" class="col-sm-2 control-label">
						Password
					</label>
					
					<div class="col-sm-10">
						<input type="password" class="form-control" name="password" id="password"><p id="InvalidPassword" style="color:red"></p>
					</div>
					<div class="col-sm-10">
					<ul class="helper-text">
        <li>Must be at least 8 characters and max 14 characters long</li>
        <li>First character must be a letter</li>
        <li>Only letters,numbers and underscore may be used</li>
       </ul></div>
				</div>
				<div class="form-group">
					 
					<label for="password" class="col-sm-2 control-label">
						Re-enter Password
					</label> 
					<div class="col-sm-10">
						<input type="password" class="form-control" id="passwordtwo" name="passwordtwo"><p id="InvalidRepeatPassword" style="color:red"></p>
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<!-- <div class="checkbox">
							 
							<label>
								<input type="checkbox"> Remember me
							</label>
						</div> -->
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<button type="submit" class="btn btn-default" value="Submit">
							Create account
						</button>
					</div>
				</div>
			  </form>  <!-- Dont have an account? <a href="" class="btn btn-block" type="button">Sign Up </a> -->  
		</div>
		<div class="col-md-4">
		</div>
	</div>
</div>

    <script src="static/js/jquery.min.js"></script>  
     <script src="static/js/bootstrap.min.js"></script>  
   <!--  <script src="js/scripts.js"></script>  -->
  </body>
</html>