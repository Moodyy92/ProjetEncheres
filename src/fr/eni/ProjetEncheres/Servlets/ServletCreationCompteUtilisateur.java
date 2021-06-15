package fr.eni.ProjetEncheres.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ProjetEncheres.BO.Utilisateur;

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
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/creationDeCompteUtilisateur.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*Utilisateur user = new Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
				String rue, String codePostal, String ville, String motDePasse, int credit );*/
		
		
		String pseudo;
		pseudo = request.getParameter("pseudo");
		System.out.println(pseudo);
		
	}

}
