package fr.eni.ProjetEncheres.BLL;

public class AcquereurManager {
	DAO<Enchere> enchereDAO;
	DAO<User> userDAO;
	
	public AcquereurManager() {
		enchereDAO = DAOFactory.getEnchere();
		userDAO = DAOFactory.getUser();
	}
	
	
	public void doEnchere(Enchere enchere, User user, ItemSold item) {
		//Insert de l'enchère liée à un user
	}
	
	public void buyItem(Enchere enchere, User user, ItemSold item) {
		
	}
}
