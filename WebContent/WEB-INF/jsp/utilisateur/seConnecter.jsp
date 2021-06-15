<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="UTF-8">
<title>Se connecter</title>
</head>
<body>
	<jsp:include page="../menuNavbar.jsp">
	<jsp:param name="monCul" value=" "/>
    </jsp:include>
    
<div class="d-flex justify-content-center align-items-center pt-5"> 
	<form>
	  <div class="form-group row">
	    <label for="inputEmail3" class="col-sm-4 col-form-label">Identifiant :</label>
	    <div class="col-sm-8">
	      <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
	    </div>
	  </div>
	  <div class="form-group row">
	    <label for="inputPassword3" class="col-sm-4 col-form-label">Mot de passe :</label>
	    <div class="col-sm-8">
	      <input type="password" class="form-control" id="inputPassword3" placeholder="Password">
	    </div>
	  </div>
	 <div class="d-flex justify-content-center align-items-center">
		  <div class="form-group row ">
		    <div class="col-sm-12"> 
		    <button type="submit" class="btn btn-primary">Sign in</button>
		    </div>
		    <div class="col-sm-12 ">
		      <div class="form-check">
		        <input class="form-check-input" type="checkbox" id="gridCheck1">
		        
		        <label class="form-check-label" for="gridCheck1">
		          se souvenir de moi
		        </label>
		      </div>
		    </div>
		  </div>
	  </div>
	</form>
</div>
<!-- 
<form method="POST" action="ConnexionServlet">
	<input type="text" name="pseudo">
	<input type="text" name="password">
	<input type="submit">
</form> -->

</body>
</html>