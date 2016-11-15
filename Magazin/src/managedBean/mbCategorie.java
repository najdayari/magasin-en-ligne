package managedBean;


import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import dao.CategorieImp;
import entities.Categorie;
import entities.Produit;


public class mbCategorie {

	public mbCategorie(){}
	
	
	private Categorie  c =new Categorie();
private CategorieImp cat = new CategorieImp();

	public Categorie getCategorie() {
		return c;
	}


	public void setCategorie(Categorie categorie) {
		c = categorie;
	}
	
	public String modifier_Categorie()
	{
		if(cat.update(c)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			}
		
		return "ok";
		
		
	}
	public String  supprimer_categorie()
	{
		if(cat.Supprimercata(c)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "ok";
		
		
	}
	
	
	
	
	
}