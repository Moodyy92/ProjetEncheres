package fr.eni.ProjetEncheres.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import fr.eni.ProjetEncheres.Connect;

public class UtilisateurJdbcImpl implements UtilisateurDAO {
	private final String IS_CONNECTED = "SELECT * FROM utilisateurs WHERE pseudo = ? AND mot_de_passe = ?";

	@Override
	public boolean isConnected(String pseudo, String password) {
		boolean isConnected = false;
		try(Connection cnx = Connect.getConnection();)
		{
			PreparedStatement stmt = cnx.prepareStatement(IS_CONNECTED);
			stmt.setString(1, pseudo);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("pseudo"));
				isConnected = true;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isConnected;
	}
	
	
}