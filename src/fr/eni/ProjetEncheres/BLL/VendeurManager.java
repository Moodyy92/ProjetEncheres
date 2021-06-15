package fr.eni.ProjetEncheres.BLL;

public class AdminManager {
	DAO<ItemSold> itemSoldDAO;
	DAO<User> userDAO;
	
	public AdminManager() {
		itemSoldDAO = DAOFactory.getItemSold();
		userDAO = DAOFactory.getUser();
	}
	
	
	public void listVentes(User user){
		//
	}
	
	public void sellItem(ItemSold item, User user) {
		//
	}
	
	public buyItem(ItemSold item, User user) {
		
	}
}
