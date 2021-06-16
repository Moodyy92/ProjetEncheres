package fr.eni.ProjetEncheres.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ProjetEncheres.Connect;
import fr.eni.ProjetEncheres.BLL.BusinessException;
import fr.eni.ProjetEncheres.BO.Utilisateur;

public class UtilisateurJdbcImpl implements UtilisateurDAO {
	private static final String IS_CONNECTED = "SELECT * FROM utilisateurs WHERE pseudo = ? AND mot_de_passe = ?";

	private static final String INSERT_COMPTE_UTILISATEUR = "INSERT INTO utilisateurs " + "( pseudo," + 
			"nom," + "prenom," + "email," + "telephone," + "rue," + "code_postal," + "ville," + "mot_de_passe," + "credit," + "administrateur)" + 
			"VALUES" + "(?,?,?,?,?,?,?,?,?,?,?);";
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
	

		@Override
		public void creerCompteUtilisateur(Utilisateur user)throws BusinessException {
		
		/*******Pas encore d'exception!!!*********/
		try(Connection cnx = Connect.getConnection())
		{
			try {	
					cnx.setAutoCommit(false);
					PreparedStatement pstmt;
					ResultSet rs;
		
		
		
				pstmt = cnx.prepareStatement(INSERT_COMPTE_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
					pstmt.setString(1, user.getPseudo());
					pstmt.setString(2, user.getNom());
					pstmt.setString(3, user.getPrenom());
					pstmt.setString(4, user.getEmail());
					pstmt.setString(5, user.getTelephone());
					pstmt.setString(6, user.getRue());
					pstmt.setString(7, user.getCodePostal());
					pstmt.setString(8, user.getVille());
					pstmt.setString(9, user.getMotDePasse());
					pstmt.setInt(10, user.getCredit());
					pstmt.setBoolean(11, false);
		
					pstmt.executeUpdate();
					rs = pstmt.getGeneratedKeys();
				
				if(rs.next())
					{
						user.setNoUtilisateur(rs.getInt(1));
					}
					
				
			   cnx.commit();
			   rs.close();
			   pstmt.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
				cnx.rollback();
				throw e;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			throw businessException;
		}
	}
			
	
	}