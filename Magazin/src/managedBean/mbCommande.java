package managedBean;
import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import entities.Commande;

public class mbCommande {
	
	
	public mbCommande(){}
	Commande Commande = new Commande();
	
	
	public Commande getCommande() {
		return Commande;
	}
	public void setCommande(Commande commande) {
		Commande = commande;
	}
	
	public String  valider_commande()
	{
		if(dao.CommandeDao.valider_commande_user(Commande)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Valider","validation effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Valider","validation non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "ok";
		
		
	}
	
	public String  valider_commande_admin()
	{
		if(dao.CommandeDao.valider_commande_admin(Commande)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Valider","validation effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Valider","validation non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "ok";
		
		
	}
	
	
	public String  supprimer_commande_admin()
	{
		if(dao.CommandeDao.supprimer_commande_admin(Commande)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Supprimer","suppression effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Supprimer","suppression non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "ok";
		
		
	}
	

}
