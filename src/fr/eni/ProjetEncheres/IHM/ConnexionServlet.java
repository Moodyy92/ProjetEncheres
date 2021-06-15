package fr.eni.ProjetEncheres.IHM;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.BLL.UserManager;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/seConnecter.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = request.getParameter("pseudo");
		String password = request.getParameter("password");
		
		UserManager userManager = new UserManager();
		boolean isConnected = userManager.isConnected(pseudo, password);
		if(isConnected == true) {
			HttpSession session = request.getSession();
			session.setAttribute("pseudo",pseudo); //Si on trouve l'utilisateur (isConnected true), on lui créer une session avec son pseudo
			response.sendRedirect("IndexServlet");
		} else {
			request.setAttribute("failedConnection", "Le mot de passe ou le pseudo est incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/seConnecter.jsp");
			rd.forward(request, response);
		}
		
		//response.sendRedirect("IndexServlet");
	}

}
