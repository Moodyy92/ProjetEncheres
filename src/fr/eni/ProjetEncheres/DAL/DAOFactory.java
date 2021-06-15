package fr.eni.ProjetEncheres.DAL;

import fr.eni.ProjetEncheres.BO.ArticleVendu;

public class DAOFactory {
	
	public static ArticleVenduDAO getArticleVendu() {
		// TODO Auto-generated method stub
		return new ProjetEncheresJdbcImpl();
	}

	public static UtilisateurDAO getUtilisateur() {
		// TODO Auto-generated method stub
		return new ProjetEncheresJdbcImpl();
	}

	

}
