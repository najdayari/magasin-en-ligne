package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entities.UserClient;

public class UserClientDAO {
	private Connexion c =new Connexion(); 
	private Statement s =c.getConnexion();
	
	public UserClientDAO()
	{
		
	}
	
	public ArrayList<UserClient> afficherUser() {
		
		ResultSet rs= null; 
		ArrayList<UserClient> L= new ArrayList<UserClient>(); 
		

		try {
			s=c.getConnexion();
			rs=s.executeQuery("Select * from client");
			 
			while(rs.next()){
				
					UserClient a = new UserClient();
	                
	                a.setId(rs.getInt(1));
	                a.setNom(rs.getString(2));
	                a.setPrenom(rs.getString(3));
	                a.setDatenais(rs.getDate(4));
	                a.setLogin(rs.getString(5));
	                a.setPwd(rs.getString(6));
	                a.setQuestSec(rs.getString(7));
	                a.setPtUser(rs.getInt(8));
	               
	                L.add(a);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	
		return L;
		
}
// Il faut corriger cette requette avec le id_user= id session	
	public int update(UserClient u)
	{
		int res=0;
		
		try{
			res=s.executeUpdate("update client set id_user='"+u.getId()+"', Nom='"+u.getNom()+"', Prenom='"+u.getPrenom()+"', DateNais='"+u.getDatenais()+"', Login='"+u.getLogin()+"', Pwd='"+u.getPwd()+"', QuestSec='"+u.getQuestSec()+"', PointUser='"+u.getPtUser()+"' where id_user="+u.getId());}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}

}
