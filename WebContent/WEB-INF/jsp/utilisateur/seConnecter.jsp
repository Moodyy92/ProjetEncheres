<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../parts/header.jsp">
		<jsp:param name="title" value="Login"/>
	</jsp:include>
</head>

<body>
	<jsp:include page="../parts/menuNavbar.jsp">
		<jsp:param name="monCul" value=" "/>
	</jsp:include>
    
<div class="d-flex justify-content-center align-items-center pt-5"> 
  
	<form method="POST">
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

<form method="POST" action="">

	<!-- INPUT PSEUDO -->
	<div class="form-group row">
	<label for="inputEmail3" class="col-sm-4 col-form-label">Identifiant :</label>
	<div class="col-sm-8">
		<!-- Si le cookie pseudo n'est pas vide, on set le pseudo value, sinon input vide -->
		<c:if test="${not empty cookie.pseudo}">
		<input type="text" class="form-control" id="inputEmail3" value="${cookie.pseudo.getValue()}" name="pseudo">
		</c:if>
		<c:if test="${empty cookie.pseudo}">
		<input type="text" class="form-control" id="inputEmail3" placeholder="Pseudo" name="pseudo">
		</c:if>
	</div>
	</div>

	<!-- INPUT PASSWORD -->  
	<div class="form-group row">
		<label for="inputPassword3" class="col-sm-4 col-form-label">Mot de passe :</label>
		<div class="col-sm-8">
			<!-- Si le cookie password n'est pas vide, on set le password value, sinon input vide -->
			<c:if test="${not empty cookie.password}">
			<input type="password" class="form-control" id="inputPassword3" value="${cookie.password.getValue()}" name="password">
			</c:if>
			<c:if test="${empty cookie.password}">
			<input type="password" class="form-control" id="inputPassword3" placeholder="Password" name="password">
			</c:if>
		</div>
	</div>
	  
	 <!-- Si la variable failedConnection n'est pas vide, on affiche le message de connection échouée -->
     <c:if test="${not empty requestScope.failedConnection}">
	 	<p>${requestScope.failedConnection}</p>
	 </c:if>

	<!-- INPUT SIGN IN + REMEMBER ME -->
	<div class="d-flex justify-content-center align-items-center">
		<div class="form-group row ">
			<div class="col-sm-12"> 
				<button type="submit" class="btn btn-primary">Sign in</button>
			</div>
			<div class="col-sm-12 ">
				<div class="form-check">
				    <input class="form-check-input" type="checkbox" id="gridCheck1" name="remember_me">
				    <label class="form-check-label" for="gridCheck1"> Se souvenir de moi </label>
				</div>
			</div>
		</div>
	</div>
	
</form>

</div>

</body>
</html>