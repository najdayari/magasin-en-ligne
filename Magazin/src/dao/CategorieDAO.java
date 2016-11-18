package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import entities.Categorie;

public class CategorieDAO {

		
		private Connexion c =new Connexion(); 
		private Statement s =c.getConnexion();
		
		public CategorieDAO()
		{
			
		}
		
		public ArrayList<Categorie> afficherCateg() {
				
				ResultSet rs= null; 
				ArrayList<Categorie> L= new ArrayList<Categorie>(); 
				
		
				try {
					s=c.getConnexion();
					rs=s.executeQuery("Select * from categorie");
					 
					while(rs.next()){
						
			                Categorie a = new Categorie();
			                
			                
			                a.setCodeCat(rs.getString(1));
			                a.setNomCat(rs.getString(2));
			               
			                L.add(a);

					}
				} catch (SQLException e) {
		
					e.printStackTrace();
				}
			
			
				return L;
				
		}
		

		public int insert(Categorie p)
		{
			int res=0;
			try{
				
				res=s.executeUpdate("INSERT INTO categorie Values("+p.getCodeCat()+",'"+p.getNomCat()+"')");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return res;
		}
		
		public int update(Categorie p)
		{
			int res=0;
			
			try{
				res=s.executeUpdate("update categorie set CodeCat='"+p.getCodeCat()+"', NomCat='"+p.getNomCat()+"' where CodeCat="+p.getCodeCat());}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return res;
		}
		
		public int delete(Categorie p){
			int res=0;
			
			try{
			res=s.executeUpdate("delete from categorie where codeCat="+p.getCodeCat());
			
		}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return res;
		}
				

	

}
