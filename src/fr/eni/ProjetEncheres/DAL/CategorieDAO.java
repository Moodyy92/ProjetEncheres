package fr.eni.ProjetEncheres.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ProjetEncheres.Connect;
import fr.eni.ProjetEncheres.BO.Categorie;

public class CategorieDAO {

	/**
	 * Insert la categorie en bdd, et renvoie l'id genere
	 * @param categorie Categorie 
	 * @return Int key
	 * @throws Exception
	 */
	public static int insert(Categorie categorie) throws Exception {
		Connection cnx = Connect.getConnection();
		String sql = "INSERT INTO categories(libelle) "
				+ "VALUES(?)";
		PreparedStatement stmt = cnx.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, categorie.getLibelle());
		stmt.executeUpdate();
		ResultSet res =stmt.getGeneratedKeys();
		return res.getInt(1);
	}
	
	
	public static List<Categorie> findAll() throws Exception{
		List<Categorie> liste = new ArrayList<Categorie>();
		Connection cnx = Connect.getConnection();	
		Statement stmt = cnx.createStatement();
		String sql ="SELECT * FROM categories";
		ResultSet res = stmt.executeQuery(sql);
		boolean encore= res.next();
		while(encore) {
			int noCategorie =res.getInt("no_categorie");
			String libelle =res.getString("libelle");
			Categorie categorie = new Categorie(noCategorie, libelle);
			liste.add(categorie);
			encore=res.next();
		}
		
		return liste;
		
	}
}
