package fr.eni.ProjetEncheres.IHM.Encheres;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ProjetEncheres.BO.Categorie;
import fr.eni.ProjetEncheres.DAL.CategorieDAO;


/**
 * Servlet implementation class SuppEnchere
 */
@WebServlet("/enchere/list")
public class Liste extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Categorie> categories = CategorieDAO.findAll();
			request.setAttribute("categories", categories);
		} catch (Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/jsp/Enchere/liste.jsp");
		
		rd.forward(request, response);
	}


}
