package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



import entities.Commande;
import entities.Utilisateur;

public class UtilisateurDao {
	

	private static Connexion c =new Connexion(); 
	private static Statement s =c.getConnexion();
	
	
	//methode afficher les utilisateurs
	public static ArrayList<Utilisateur> afficher_Utilisateurs() {
		
		ResultSet rs= null; 
		ArrayList<Utilisateur> list= new ArrayList<Utilisateur>(); ;
		
		
		try {
			s=c.getConnexion();
			rs=s.executeQuery("Select * from utilisateur");
			 
			while(rs.next()){
				
	                Utilisateur user = new Utilisateur();
	                
	                user.setId_user(rs.getInt(1));
	                user.setNom(rs.getString(2));
	                user.setPrenom(rs.getString(3));
	                user.setDate_Nais(rs.getString(4));
	                user.setLogin(rs.getString(5));
	                user.setPwd(rs.getString(6));
	                user.setQuestsec(rs.getString(7));
	                user.setPointUser(rs.getInt(8));
	                user.setReponse(rs.getString(9));
	                
	                
	               
	                list.add(user);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	
		return list;
		
}



//methode supprimer un utilisateur
	
	public static int supprimer_utilisateur(Utilisateur u){
		int res=0;
		try {
			res=s.executeUpdate ("delete from utlisateur where (id_user="+u.getId_user()  );
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
		
	}

}