package fr.eni.ProjetEncheres.Servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
       
	public static final String VUE          = "/WEB-INF/inscription.jsp";
    public static final String CHAMP_EMAIL  = "email";
    public static final String CHAMP_PASS   = "motdepasse";
    public static final String CHAMP_CONF   = "confirmation";
    public static final String CHAMP_NOM    = "nom";
    public static final String ATT_ERREURS  = "erreurs";
    public static final String ATT_RESULTAT = "resultat";
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
		
		
		
				String resultat;
		        Map<String, String> erreurs = new HashMap<String, String>();
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
		            validationMotsDePasse( mdp, confirmation );
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

	private void validationNom(String nom) throws Exception 
	{
		if ( nom != null && nom.trim().length() < 3 ) {
	        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
			}
	}
	private void validationMotsDePasse(String mdp, String confirmation) throws Exception 
	{
		if ( mdp != confirmation ) {
	        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
			}
		if ( mdp != null && mdp.trim().length() < 8 ) {
	        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
			}
	} 

	private void validationEmail(String email) {
		// TODO Auto-generated method stub
		
	}
}


