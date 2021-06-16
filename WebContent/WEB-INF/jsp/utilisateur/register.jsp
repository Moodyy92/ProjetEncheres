<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="../parts/header.jsp">
		<jsp:param name="title" value="S'enregistrer"/>
	</jsp:include>
</head>
<body >
	<jsp:include page="../parts/menuNavbar.jsp">	
		<jsp:param name="monCul" value=" "/>
    </jsp:include>
    
    <div class="d-flex justify-content-center align-items-center h-100 pt-5">
	  	<form  class="w-50 h-" method="POST" action="${pageContext.request.contextPath}/ServletCreationCompteUtilisateur">
	  	
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Pseudo</label>
		      <input type="text" class="form-control" id="inputEmail4" placeholder="Pseudo" name="pseudo" value="${param.pseudo}">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Nom</label>
		      <input type="text" class="form-control" id="inputPassword4" placeholder="Nom" name="nom" value="${param.nom}">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Prénom</label>
		      <input type="text" class="form-control" id="inputEmail4" placeholder="Prenom" name="prenom" value="${param.prenom}">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Email</label>
		      <input type="email" class="form-control" id="inputPassword4" placeholder="Email" name="email" value="${param.email}">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Téléphone</label>
		      <input type="text" class="form-control" id="inputEmail4" placeholder="Téléphone" name="telephone" value="${param.telephone}">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Rue</label>
		      <input type="text" class="form-control" id="inputPassword4" placeholder="Rue" name="rue" value="${param.rue}">
		    </div>
		  </div>
		  
		  <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Code postal</label>
		      <input type="text" class="form-control" id="inputEmail4" placeholder="Code postal" name="cp" value="${param.cp}">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Ville</label>
		      <input type="text" class="form-control" id="inputPassword4" placeholder="Ville" name="ville"  value="${param.ville}">
		    </div>
		  </div>
		  
		    <div class="form-row">
		    <div class="form-group col-md-6">
		      <label for="inputEmail4">Mot de passe</label>
		      <input type="password" class="form-control" id="inputEmail4" placeholder="Mot de passe" name="mdp" value="${param.mdp}">
		    </div>
		    <div class="form-group col-md-6">
		      <label for="inputPassword4">Confirmation</label>
		      <input type="password" class="form-control" id="inputPassword4" placeholder="Confirmation" name="confirmation" value="${param.confirmation}">
		    </div>
		  </div>
		  					<span>${erreur}</span><br><br>
		<div class="form-row justify-content-around">
		  <button type="submit" class="btn btn-primary ">Créer</button>
		  <button type="reset" class="btn btn-primary">Annuler</button>
		</div>
		
		</form>
    </div>

</body>
</html>