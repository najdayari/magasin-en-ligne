package dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import entities.Produit;




public class ProduitDao {
	
	private Connexion c =new Connexion(); 
	private Statement s =c.getConnexion();
	
	public ProduitDao()
	{
		
	}
	
	public ArrayList<Produit> afficherProduits() {
			
			ResultSet rs= null; 
			ArrayList<Produit> L= new ArrayList<Produit>(); 
			
			
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
		                a.setCodeCat(rs.getString(6));
		                
		               
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

		i=	s.executeUpdate("INSERT INTO lignecommande (`numcmd`, `numprod`, `qte`,`prixtotal`,`pointstotal`) VALUES ('1', "+ar.getNumProd()+", "+qte+","+ar.getPrixTTC()*qte+","+ar.getPointProd()*qte+");");
			s.close();
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return i;
	}
	
	public int insert(Produit p)
	{
		int res=0;
		try{
			
			res=s.executeUpdate("INSERT INTO produit Values("+p.getNumProd()+",'"+p.getLibelle()+"','"+p.getStock()+"','"+p.getPrixTTC()+"','"+p.getPointProd()+"')");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
	
	public int update(Produit p)
	{
		int res=0;
		
		try{
			res=s.executeUpdate("update produit set NumProd='"+p.getNumProd()+"', Libelle='"+p.getLibelle()+"', Stock='"+p.getStock()+"', PrixTTC='"+p.getPrixTTC()+"',PointProd='"+p.getPointProd()+"' where NumProd="+p.getNumProd());}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
	
	public int delete(Produit p){
		int res=0;
		
		try{
		res=s.executeUpdate("delete from produit where NumProd="+p.getNumProd());
		
	}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
			

}
