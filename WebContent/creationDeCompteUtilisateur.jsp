<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<input type="text" id="pseudo" name="pseudo"><br><br>
		
		<label for="nom">Nom : </label>
		<input type="text" id="nom" name="nom"><br><br>
		
		<label for="prenom">Prenom : </label>
		<input type="text" id="prenom" name="prenom"><br><br>
		
		<label for="email">Email : </label>
		<input type="text" id="email" name="email"><br><br>
		
		<label for="telephone">Telephone : </label>
		<input type="text" id="telephone" name="telephone"><br><br>
		
		<label for="rue">Rue : </label>
		<input type="text" id="rue" name="rue"><br><br>
		
		<label for="cp">Code postal : </label>
		<input type="text" id="cp" name="cp"><br><br>
		
		<label for="ville">Ville : </label>
		<input type="text" id="ville" name="ville"><br><br>
		
		<label for="mdp">Mot de passe : </label>
		<input type="password" id="mdp" name="mdp"><br><br>
		
		<label for="confirmation">Confirmation : </label>
		<input type="password" id="confirmation" name="confirmation"><br><br>
		
		<button type="submit" value="Creer">Creer</button>
		<button type="reset" value="Anuler">Anuler</button>
		
		
		
		
		</form>
</body>
</html>