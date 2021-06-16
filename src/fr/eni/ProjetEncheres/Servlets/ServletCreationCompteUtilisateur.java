package fr.eni.ProjetEncheres.Servlets;

import java.io.IOException;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.util.StringUtils;

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
	
	private final static String ERREUR_MDP = "Mot de passe different de la confirmation";
	private final static String ERREUR_PSEUDO = "Le pseudo ne doit contenir que des alphanumeriques";
	private final static String ERREUR_PSEUDO_EXISTANT = "Le pseudo existe deja";
	private final static String ERREUR_EMAIL_EXISTANT = "L'email existe deja";


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
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/utilisateur/register.jsp");
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
				int credit = 0;
				
		/****************************Creation de l'utilisateur************************************/

				// Verification motdepasse = confirmation du motdepasse
				if (mdp.equals(confirmation) && confirmation!=null) 
				{
					
					//Verification si pseudo est alphanumerique
					if (isAlphanumeric(pseudo)&& pseudo!=null) {
									int pseudoOuEmail =0;
									
								if (verifier(pseudo,pseudoOuEmail) ) 
								{	
											pseudoOuEmail =1;
											if (verifier(email,pseudoOuEmail)&&email!=null) {
												
											
									        	Utilisateur user = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,cp,ville,mdp,credit);
									        /* Initialisation du résultat global de la validation. */
									      
										try 
										{
											UtilisateurManager userDAO = new UtilisateurManager(); 
											userDAO.creerCompte(user);
											
											RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
											rd.forward(request, response);
											
										} catch (BusinessException e)
										{
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
				
										}else 
										{
											request.setAttribute("erreur", ERREUR_EMAIL_EXISTANT);
											RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/utilisateur/register.jsp");
											rd.forward(request, response); 
											
										}
							
						}else 
						{
							request.setAttribute("erreur", ERREUR_PSEUDO_EXISTANT);
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/utilisateur/register.jsp");
							rd.forward(request, response); 
						}
						
						
						
					}else {
						request.setAttribute("erreur", ERREUR_PSEUDO);
						RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/utilisateur/register.jsp");
						rd.forward(request, response); 
							}
					
			}else 
			
			{
				request.setAttribute("erreur", ERREUR_MDP);
							RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/utilisateur/register.jsp");
							rd.forward(request, response); 
				
			}
				
			
			
		
		
		
		
	}
		

	

		

			public boolean isAlphanumeric(String str)
			{
			    char[] charArray = str.toCharArray();
			    for(char c:charArray)
				    {
				        if (!Character.isLetterOrDigit(c))
				            return false;
				    }
			    return true;
			}
	
		private boolean verifier(String string, int pseudoOuEmail) {
			
			boolean Existant=false;
			UtilisateurManager user = new UtilisateurManager();
			Existant = user.verification(string,pseudoOuEmail);
			
			return Existant;
	}
			
}


