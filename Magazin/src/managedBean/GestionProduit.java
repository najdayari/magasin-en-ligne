package managedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import dao.ProduitDao;
import entities.Produit;

public class GestionProduit {


	private Produit prod=new Produit();
	private List<Produit> prods=new ArrayList<Produit>();
	private ProduitDao dao=new ProduitDao();
	
	GestionProduit()
	{
		
	}
	public Produit getProd() {
		return prod;
	}

	public void setProd(Produit prod) {
		this.prod = prod;
	}

	public List<Produit> getProds() {
		prods=dao.afficherProduits();
		return prods;
	}

	public void setProds(List<Produit> prods) {
		this.prods = prods;
	}

	public ProduitDao getDao() {
		return dao;
	}

	public void setDao(ProduitDao dao) {
		this.dao = dao;
	}
	public String insert()
	{
		if(dao.insert(prod)==0)
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "mmm";
		
		
	}
	
	public String update()
	{
		if(dao.update(prod)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification non effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			}
		
		return "mmm";
		
		
	}
	
	public String delete()
	{
		if(dao.delete(prod)==0)
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Supp","Suppression non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
			
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_INFO,"Supp","Suppression  effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
		}
		return "mmm";
		
		
	}
}
