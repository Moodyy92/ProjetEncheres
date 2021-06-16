package fr.eni.ProjetEncheres.BLL;

import fr.eni.ProjetEncheres.DAL.DAOFactory;

public class AdminManager {
	DAO<Category> categoryDAO;
	DAO<User> userDAO;
	
	public AdminManager() {
		categoryDAO = DAOFactory.getCategory();
		userDAO = DAOFactory.getUser();
	}
	
	
	public void disableAccount(int noAccount){
		//
	}
	
	public void deleteAccount(int noAccount) {
		//
	}
	
	public gestionCategory(List<Category> category) {
		
	}
}
