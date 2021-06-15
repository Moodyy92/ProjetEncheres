package fr.eni.ProjetEncheres.BLL;

public class UserManager {
	DAO<ItemSold> itemSoldDAO;
	DAO<User> userDAO;
	
	public UserManager() {
		itemSoldDAO = DAOFactory.getItemSold();
		userDAO = DAOFactory.getUser();
	}
	
	
	public void createNewAccount(String pseudo, String firstname, String lastname, String password, String email, 
			String telephone, String street, String postalCode, String city){
		//insert user dans la table users
	}
	
	public void connection(String pseudo, String password) {
		//création session si les params correspondent dans la table users
	}
	
	public void deconnection() {
		//destruction session
	}
	
	public User profilView(String pseudo) {
		//Select l'user dans la table users via son pseudo unique
		return userObject;
	}
	
	public void profilModify(String pseudo, String firstname, String lastname, String email, 
			String telephone, String street, String postalCode, String city) {
		//Comparer les entrées du formulaire aux infos dans la table users et UPDATE si elles sont différentes
	}
	
	public List<ItemSold>(){
		
	}
}
