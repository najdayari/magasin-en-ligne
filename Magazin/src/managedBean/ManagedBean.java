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
	private int qte=1;;
	
public ManagedBean() {
		
	}

	
	public int getQte() {
	return qte;
}


public void setQte(int qte) {
	this.qte = qte;
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
	
	
}
