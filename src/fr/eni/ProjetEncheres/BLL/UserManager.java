package fr.eni.ProjetEncheres.BLL;

import fr.eni.ProjetEncheres.DAL.DAOFactory;
import fr.eni.ProjetEncheres.DAL.UtilisateurDAO;

public class UserManager {
	UtilisateurDAO userDAO;
	
	public UserManager() {
		userDAO = DAOFactory.getUtilisateur();
	}
	
	public boolean isConnected(String pseudo, String password) {
		boolean isConnected = userDAO.isConnected(pseudo,password);
		return isConnected;
	}
}
