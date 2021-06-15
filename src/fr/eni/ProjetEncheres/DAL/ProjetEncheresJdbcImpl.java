package fr.eni.ProjetEncheres.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ProjetEncheres.Connect;
import fr.eni.ProjetEncheres.BO.Utilisateur;

public class ProjetEncheresJdbcImpl implements ArticleVenduDAO,UtilisateurDAO {

	private static final String INSERT_COMPTE_UTILISATEUR = "INSERT INTO utilisateurs " + "( pseudo," + 
															"nom," + "prenom," + "email," + "telephone," + "rue," + "code_postal," + "ville," + "mot_de_passe," + "credit," + "administrateur)" + 
															"VALUES" + "(?,?,?,?,?,?,?,?,?,?,?);";
	
	
	
	
	
	
	@Override
	public void creerCompteUtilisateur(Utilisateur user) {

		/*******Pas encore d'exception!!!*********/
		try(Connection cnx = Connect.getConnection())
		{
			System.out.println("Connection ok");
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
			pstmt.setBoolean(11, user.getAdministrateur());

			pstmt.executeUpdate();
			rs = pstmt.getGeneratedKeys();
			cnx.commit();
			if(rs.next())
			{
				user.setNoUtilisateur(rs.getInt(1));
			}
			rs.close();
			pstmt.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
