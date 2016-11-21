package managedBean;
import java.util.ArrayList;
import java.util.List;

import dao.UtilisateurDao;
import entities.Utilisateur;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

public class mbUtilisateur 
{
public mbUtilisateur (){}


Utilisateur Utilisateur = new Utilisateur ();

private List<Utilisateur> liste_user=new ArrayList<Utilisateur>();




	public List<Utilisateur> getListe_user() {
	return liste_user;
}



public void setListe_user(List<Utilisateur> liste_user) {
	this.liste_user = liste_user;
}



	public Utilisateur getUtilisateur() {
	return Utilisateur;
}



public void setUtilisateur(Utilisateur utilisateur) {
	Utilisateur = utilisateur;
}



	public String  supprimer_utilisateur()
	{
		if(dao.UtilisateurDao.supprimer_utilisateur(Utilisateur)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"supprimer","suppression effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"supprimer","suppression non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "ok";
	}
	
	
	
	
	

}
