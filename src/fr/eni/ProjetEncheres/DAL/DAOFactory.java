package fr.eni.ProjetEncheres.DAL;

public class DAOFactory {

	public static UtilisateurDAO getUtilisateur() {
		return new UtilisateurJdbcImpl();
	}

	

}