<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">ENI-Enchere</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
    <div class="collapse navbar-collapse d-flex justify-content-between" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0 d-flex">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">ACCUEIL</a>
        </li>
        
       </ul>
        
       <ul class="navbar-nav me-auto mb-2 mb-lg-0 d-flex">
      
      
      	<!-- Si la variable pseudo session est vide, affichage en mode déconnecté -->
      	<c:if test="${empty sessionScope.pseudo}">
	        <li class="nav-item">
	        	<a class="nav-link" href="<%=request.getContextPath()%>/register">S'inscrire</a>
	        </li>
	        <li class="nav-item">
	        	<a class="nav-link" href="<%=request.getContextPath()%>/Connexion">Se connecter</a>
	    	</li>
	    </c:if>
	    
	    <!-- Sinon, affichage du lien vers le profil avec le pseudo en param, et vers la deconnexion -->
	    <c:if test="${not empty sessionScope.pseudo}">
	    	<li class="nav-item">
	        	<a class="nav-link" href="<%=request.getContextPath()%>/Profil?pseudo=${sessionScope.pseudo}">${sessionScope.pseudo}</a>
	    	</li>
	    	<li class="nav-item">
	        	<a class="nav-link" href="<%=request.getContextPath()%>/Deconnexion">Se déconnecter</a>
	    	</li>
	    </c:if>

      </ul>
    </div>
  </div>
</nav>


