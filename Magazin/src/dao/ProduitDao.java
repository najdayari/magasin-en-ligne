package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import entities.Produit;




public class ProduitDao {
	
	private Connexion c =new Connexion(); 
	Statement s =c.getConnexion();
	
	public ProduitDao() {
		
	}
	
public ArrayList<Produit> afficherProduits() {
		
		ResultSet rs= null; 
		ArrayList<Produit> L= new ArrayList<Produit>(); ;
		
		
		try {
			s=c.getConnexion();
			rs=s.executeQuery("Select * from produit");
			 
			while(rs.next()){
				
	                Produit a = new Produit();
	                
	                a.setNumProd(rs.getInt(1));
	                a.setLibelle(rs.getString(2));
	                a.setStock(rs.getInt(3));
	                a.setPrixTTC(rs.getFloat(4));
	                a.setPointProd(rs.getInt(5));
	                a.setCodeCat(rs.getInt(6));
	                
	               
	                L.add(a);
	                
	                
	    		
	            
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
	
		return L;
		
	}

public int commander(Produit ar,int qte){
	
	
	
	int i = 0;

		 try {
			
	i=	s.executeUpdate("INSERT INTO lignecommande (`numcmd`, `numprod`, `qte`) VALUES ('1', "+ar.getNumProd()+", "+qte+");");
		s.close();
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return i;
}
	
/*	
	
	
	public int ajouterProduit(Produit p){
		
	
		
		int i = 0;
	
			 try {
				
		i=	s.executeUpdate("insert into produit values ("+ar.getCode()+",'"+ar.getDes()+"','"+ar.getFournisseur()+"',"+ar.getPrixa()+","+ar.getMarge()+","+ar.getTva()+","+ar.getPrixv()+","+ar.getPrixttc()+")");
			s.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return i;
	}
	
	
	
	
public int modifier(Article ar){
		


		int i = 0;
	
			 try {
				
		i=	s.executeUpdate("update article set des='"+ar.getDes()+"' , fournisseur='"+ar.getFournisseur()+"',prixa="+ar.getPrixa()+",marge="+
		ar.getMarge()+",tva="+ar.getTva()+",prixv="+ar.getPrixv()+",prixttc="+ar.getPrixttc()+" where code="+ar.getCode());
			s.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return i;
	}

public int supprimer(Article ar){
	


	int i = 0;

		 try {
			
	i=	s.executeUpdate("delete from article where code="+ar.getCode());
		s.close();
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return i;
}*/
}
