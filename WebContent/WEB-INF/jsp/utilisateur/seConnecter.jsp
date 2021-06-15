<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="../parts/header.jsp">
		<jsp:param name="title" value="Login"/>
	</jsp:include>
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