package fr.eni.ProjetEncheres.BLL;

import fr.eni.ProjetEncheres.BO.*;
import fr.eni.ProjetEncheres.DAL.*;
import fr.eni.ProjetEncheres.DAL.DAOFactory;
public class UtilisateurManager {
		private ArticleVenduDAO ArticleVenduDAO;
		private UtilisateurDAO UtilisateurDAO;
		
	public UtilisateurManager() {
		ArticleVenduDAO = DAOFactory.getArticleVendu();
		UtilisateurDAO = DAOFactory.getUtilisateur();
	}
	
	
	public void creerCompte(int noUtilisateur,String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit)
	{
		Utilisateur user = new Utilisateur( pseudo,  nom,  prenom,  email,  telephone,
				 rue,  codePostal,  ville,  motDePasse,  credit);
		user.setNoUtilisateur(noUtilisateur);
		
		this.UtilisateurDAO.creerCompteUtilisateur(user);
	}
	
	public void connection(String pseudo, String password) {
		//création session si les params correspondent dans la table Utilisateurs
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
		//Comparer les entrées du formulaire aux infos dans la table Utilisateurs et UPDATE si elles sont différentes
	}
	
	
}
