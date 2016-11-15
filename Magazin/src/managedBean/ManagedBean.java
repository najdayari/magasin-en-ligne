package managedBean;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

/*import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;
*/
import dao.ProduitDao;

import entities.Produit;


public class ManagedBean {

	private Produit pr = new Produit();
	private ProduitDao p = new ProduitDao();
	
	private ArrayList<Produit> l = new ArrayList<Produit>();
	private int qte=1;
	
	
	public int getQte() {
		return qte;
	}




	public void setQte(int qte) {
		this.qte = qte;
	}




	





	public ManagedBean() {
			
		}
	
		
	


	public Produit getPr() {
		return pr;
	}
	
	
	public void setPr(Produit pr) {
		this.pr = pr;
	}
	
	
		public ProduitDao getP() {
		return p;
	}
	
	
	public void setP(ProduitDao p) {
		this.p = p;
	}

	public void setL(ArrayList<Produit> l) {
		this.l = l;
	}


	public ArrayList<Produit> getL() {
		l= p.afficherProduits();
		return l;
	}
	
	
	
	public String commander(){
		if (p.commander(pr,qte)!=0){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"commande","succeeded");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else{FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN,"commande","failed");
		RequestContext.getCurrentInstance().showMessageInDialog(msg);}
		return "";
	}
	
	public String insert()
	{
		if(p.insert(pr)==0)
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "mmm";
		
		
	}
	
	public String update()
	{
		if(p.update(pr)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification non effetctu�e");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			}
		
		return "mmm";
		
		
	}
	
	public String delete()
	{
		if(p.delete(pr)==0)
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Supp","Suppression non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
			
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_INFO,"Supp","Suppression  effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
		}
		return "mmm";
		
		
	}



	
}
