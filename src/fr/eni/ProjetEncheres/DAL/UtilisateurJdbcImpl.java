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
	
	private static final String FIND_EMAIL= "SELECT email " + "FROM UTILISATEURS ";
	private static final String FIND_PSEUDO= "SELECT pseudo " + "FROM UTILISATEURS ";
	
	
	
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
				
				isConnected = true;
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isConnected;
	}
	

		@Override
		public void creerCompteUtilisateur(Utilisateur user)throws BusinessException {
		
		
		try(Connection cnx = Connect.getConnection())
		{
			try {	
							cnx.setAutoCommit(false);
							PreparedStatement pstmt;
							ResultSet rs;
		
		
		
					pstmt = cnx.prepareStatement(INSERT_COMPTE_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
				
						//	Recuperation des variables...
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


		@Override
		public boolean verification(String string, int pseudoOuEmail) {
			
			boolean existant=true;
			try(Connection cnx = Connect.getConnection())
			{
				Utilisateur user= new Utilisateur(string,pseudoOuEmail);
				Utilisateur test = new Utilisateur();
				PreparedStatement pstmt;
				ResultSet rs;

			
			// Si pseudoOuEmail = 0 le String est un pseudo 
			if (pseudoOuEmail==0)
			{   pstmt = cnx.prepareStatement(FIND_PSEUDO);
				rs = pstmt.executeQuery();
				while(rs.next()) 
				{
					if (existant) 
					{
						
						
						test.setPseudo(rs.getString("pseudo"));
						String testPseudo= test.getPseudo();
						if (testPseudo.equals(string)) 
						{
							existant=false;
						}
					}
					
				}
				rs.close();
				pstmt.close();
			}
			// Si pseudoOuEmail = 1 le String est un email 

			else if (pseudoOuEmail==1) 
			{   pstmt = cnx.prepareStatement(FIND_EMAIL);
			rs = pstmt.executeQuery();
			while(rs.next()) 
			{
				if (existant) 
				{
					
					
					test.setEmail(rs.getString("email"));
					String testEmail= test.getEmail();
					if (testEmail.equals(string)) 
					{
						existant=false;
					}
				}
				
			}
			rs.close();
			pstmt.close();
		}
			
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return existant;
			
		}


	
			
	
	}