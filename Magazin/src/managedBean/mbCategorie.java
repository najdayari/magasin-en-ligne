package managedBean;


import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import entities.Categorie;
import entities.Produit;
import dao.CategorieDao;

public class mbCategorie {

	public mbCategorie(){}
	
	
	private Categorie Categorie =new Categorie();


	public Categorie getCategorie() {
		return Categorie;
	}


	public void setCategorie(Categorie categorie) {
		Categorie = categorie;
	}
	
	public String modifier_Categorie()
	{
		if(dao.CategorieDao.modifier_categorie(Categorie)==0)
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
		if(dao.CategorieDao.supprimer_categorie(Categorie)==0)
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