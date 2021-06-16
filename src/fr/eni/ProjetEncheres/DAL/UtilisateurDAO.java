package fr.eni.ProjetEncheres.DAL;


import fr.eni.ProjetEncheres.BLL.BusinessException;
import fr.eni.ProjetEncheres.BO.Utilisateur;

public interface UtilisateurDAO {

	void creerCompteUtilisateur(Utilisateur user) throws BusinessException;
	public boolean isConnected(String pseudo, String password);
}


