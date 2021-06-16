package fr.eni.ProjetEncheres.IHM.Encheres;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ProjetEncheres.BO.Categorie;
import fr.eni.ProjetEncheres.DAL.CategorieDAO;

/**
 * Servlet implementation class AjoutEnchere
 */
@WebServlet("/enchere/ajout")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Create() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/jsp/Enchere/create.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String libelle = request.getParameter("libelle");
		Categorie categorie = new Categorie(libelle);
		try {
			CategorieDAO.insert(categorie);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath() + "/enchere/list");
	}

}
