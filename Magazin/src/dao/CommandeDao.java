package dao;

import java.sql.SQLException;
import java.sql.Statement;

import entities.Commande;

public class CommandeDao {
	private static Connexion c =new Connexion(); 
	private static Statement s =c.getConnexion();
	
	
	public CommandeDao()
	{
		
	}
	//methode valider_commande pour l'utilisateur 
	public static int valider_commande_user(Commande Commande)
	{
		int res=0;
		try {
			res=s.executeUpdate("update commande set (etat="+1+")");
			}
		catch (SQLException e){
			e.printStackTrace();
			
			
		}
		
		return res;
	}
	
	//methode valider commande pour l'admin
	public static int valider_commande_admin(Commande Commande){
		int res=0;
		int pt=Commande.getPointstotal();
		try{
			
			res=s.executeUpdate("update commande set pointstotal=pointstotal + "+Commande.getPointstotal()+"where numcmd =" +Commande.getNumcmd());
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
		
	
	}
	
	 
	public void modifier_commande (Commande c){}
	
	
	public void supprimer_commande(){}
	
	
	//methode supprimer commande admin
	
	public static int supprimer_commande_admin(Commande Commande){
		int res=0;
		try {
			res=s.executeUpdate ("delete from commande where (numcmd="+Commande.getNumcmd()  );
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return res;
		
	}
	
	
	

}