<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creation du compte utilisateur</title>
</head>
<body>
		<h1>ENI-Encheres</h1>
		
		<p>Mon Profil</p>
		
		<form method="post" action="${pageContext.request.contextPath}/ServletCreationCompteUtilisateur">
		
		<label for="pseudo">Pseudo : </label>
		<input type="text" id="pseudo" name="pseudo" value="${param.pseudo}"><br><br>
		
		<label for="nom">Nom : </label>
		<input type="text" id="nom" name="nom" value="${param.nom}"><br><br>
		
		<label for="prenom">Prenom : </label>
		<input type="text" id="prenom" name="prenom" value="${param.prenom}"><br><br>
		
		<label for="email">Email : </label>
		<input type="text" id="email" name="email" value="${param.email}"><br><br>
		
		<label for="telephone">Telephone : </label>
		<input type="text" id="telephone" name="telephone" value="${param.telephone}"><br><br>
		
		<label for="rue">Rue : </label>
		<input type="text" id="rue" name="rue" value="${param.rue}"><br><br>
		
		<label for="cp">Code postal : </label>
		<input type="text" id="cp" name="cp" value="${param.codePostal}"><br><br>
		
		<label for="ville">Ville : </label>
		<input type="text" id="ville" name="ville" value="${param.ville}"><br><br>
		
		<label for="mdp">Mot de passe : </label>
		<input type="password" id="mdp" name="mdp" value="${param.motDePasse}"><br><br>
		
		<label for="confirmation">Confirmation : </label>
		<input type="password" id="confirmation" name="confirmation" value="${param.confirmation}"><br><br>
		
		<input type="submit" value="Creer">		
		<button type="reset" value="Anuler">Anuler</button>
		
		
		
		
		</form>
</body>
</html>