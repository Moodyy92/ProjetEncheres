package fr.eni.ProjetEncheres.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ProjetEncheres.BLL.BusinessException;
import fr.eni.ProjetEncheres.BLL.UtilisateurManager;
import fr.eni.ProjetEncheres.BO.Utilisateur;
import fr.eni.ProjetEncheres.DAL.UtilisateurDAO;

/**
 * Servlet implementation class ServletCreationCompteUtilisateur
 */
@WebServlet("/ServletCreationCompteUtilisateur")
public class ServletCreationCompteUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCreationCompteUtilisateur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*************************Redirection vers la JSP********************************/
		RequestDispatcher rd = request.getRequestDispatcher("/creationDeCompteUtilisateur.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/****************************Recuperation des Parametres des champs************************************/
				String pseudo = request.getParameter("pseudo");
				String nom = request.getParameter("nom");
				String prenom = request.getParameter("prenom");
				String email = request.getParameter("email");
				String telephone = request.getParameter("telephone");
				String rue = request.getParameter("rue");
				String cp = request.getParameter("cp");
				String ville = request.getParameter("ville");
				String mdp = request.getParameter("mdp");
				String confirmation = request.getParameter("confirmation");
				System.out.println(confirmation);
				int credit = 0;
				
		/****************************Creation de l'utilisateur************************************/

				Utilisateur user = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,cp,ville,mdp,credit);
				

		        /* Validation du champ email. */
		        try {
		            validationEmail( email );
		        } catch ( Exception e ) {
		            erreurs.put( CHAMP_EMAIL, e.getMessage() );
		        }

		        /* Validation des champs mot de passe et confirmation. */
		        try {
		            validationMotsDePasse( motDePasse, confirmation );
		        } catch ( Exception e ) {
		            erreurs.put( CHAMP_PASS, e.getMessage() );
		        }

		        /* Validation du champ nom. */
		        try {
		            validationNom( nom );
		        } catch ( Exception e ) {
		            erreurs.put( CHAMP_NOM, e.getMessage() );
		        }

		        /* Initialisation du résultat global de la validation. */
		        if ( erreurs.isEmpty() ) {
		            resultat = "Succès de l'inscription.";
		        } else {
		            resultat = "Échec de l'inscription.";
		        }
				
			try 
			{
				UtilisateurManager userDAO = new UtilisateurManager(); 
				userDAO.creerCompte(user);
				
		/*********************Redirection vers l'accueille si userDAO.creerCompte(user) n'est pas catch***************/
				
				//RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Acceuille.jsp");
				//rd.forward(request, response);
				
			} catch (BusinessException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(user.toString());
		
		
		
		
	}

	private void validationEmail(String email) {
		// TODO Auto-generated method stub
		
	}
}


