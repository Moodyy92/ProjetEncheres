package fr.eni.ProjetEncheres.IHM;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.BLL.UserManager;

/**
 * Servlet implementation class ConnexionServlet
 */
@WebServlet("/Connexion")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/utilisateur/seConnecter.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = request.getParameter("pseudo");
		String password = request.getParameter("password");
		String isChecked = request.getParameter("remember_me");
		
		UserManager userManager = new UserManager();
		boolean isConnected = userManager.isConnected(pseudo, password);
		if(isConnected == true) {
			if(isChecked != null) {
				/* Si remember_me n'est pas nul, on set les cookies */
				Cookie cookie = new Cookie("pseudo",pseudo);
				Cookie cookie2 = new Cookie("password",password);
				cookie.setMaxAge(60);
				cookie2.setMaxAge(60);
				response.addCookie(cookie);
				response.addCookie(cookie2);
			}
			
			/* Si on trouve l'utilisateur (isConnected true), on lui cr?er une session avec son pseudo */
			HttpSession session = request.getSession();
			session.setAttribute("pseudo",pseudo); 
			response.sendRedirect("index.jsp");
		} else {
			request.setAttribute("failedConnection", "Le mot de passe ou le pseudo est incorrect");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/utilisateur/seConnecter.jsp");
			rd.forward(request, response);
		}
	}

}
