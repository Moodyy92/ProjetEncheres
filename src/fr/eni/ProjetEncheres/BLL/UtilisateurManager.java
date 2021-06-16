package fr.eni.ProjetEncheres.BLL;

import fr.eni.ProjetEncheres.BO.*;
import fr.eni.ProjetEncheres.DAL.*;
import fr.eni.ProjetEncheres.DAL.DAOFactory;
public class UtilisateurManager {
		private ArticleVenduDAO ArticleVenduDAO;
		private UtilisateurDAO UtilisateurDAO;
		
	public UtilisateurManager() {
		//ArticleVenduDAO = DAOFactory.getArticleVendu();
		UtilisateurDAO = DAOFactory.getUtilisateur();
	}
	
	
	public void creerCompte(Utilisateur user) throws BusinessException
	{
		
		this.UtilisateurDAO.creerCompteUtilisateur(user);
	}
	
	public void connection(String pseudo, String password) {
		//cr�ation session si les params correspondent dans la table Utilisateurs
	}
	
	public void deconnection() {
		//destruction session
	}
	
	public Utilisateur profilView(String pseudo) {
		//Select l'Utilisateur dans la table Utilisateurs via son pseudo unique
		return null;
	}
	
	public void profilModify(String pseudo, String firstname, String lastname, String email, 
			String telephone, String street, String postalCode, String city) {
		//Comparer les entr�es du formulaire aux infos dans la table Utilisateurs et UPDATE si elles sont diff�rentes
	}
	
	
}
