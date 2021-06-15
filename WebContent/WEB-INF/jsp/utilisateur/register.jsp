<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body >
	<jsp:include page="../menuNavbar.jsp">
	<jsp:param name="monCul" value=" "/>
    </jsp:include>
    <div class="d-flex justify-content-center align-items-center h-100 pt-5">
	  	<form class="w-50 h-">
	  	
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Pseudo</label>
		      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Nom</label>
		      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Prénom</label>
		      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Email</label>
		      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Téléphone</label>
		      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Rue</label>
		      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Code postal</label>
		      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Ville</label>
		      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
		    </div>
		  </div>
		  
		    <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Mot de passe</label>
		      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Confirmation</label>
		      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
		    </div>
		  </div>
		<div class="form-row justify-content-around">
		  <button type="submit" class="btn btn-primary ">Crée</button>
		  <button type="submit" class="btn btn-primary">Annuler</button>
		</div>
		</form>
    </div>

    
</body>
</html>