package fr.eni.ProjetEncheres.DAL;

public class DAOFactory {
	
	/*public static ArticleVenduDAO getArticleVendu() {
		// TODO Auto-generated method stub
		return new UtilisateurJdbcImpl();
	}*/

	public static UtilisateurDAO getUtilisateur() {
		return new UtilisateurJdbcImpl();


}
	}
