package managedBean;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import dao.UserClientDAO;
import entities.UserClient;

public class mbUser {
	private UserClient uc = new UserClient();
	private UserClientDAO usd = new UserClientDAO();
	
	private ArrayList<UserClient> l = new ArrayList<UserClient>();

	public UserClient getUc() {
		return uc;
	}

	public void setUc(UserClient uc) {
		this.uc = uc;
	}

	public UserClientDAO getUsd() {
		return usd;
	}

	public void setUsd(UserClientDAO usd) {
		this.usd = usd;
	}

	public ArrayList<UserClient> getL() {
		l=usd.afficherUser();
		return l;
	}

	public void setL(ArrayList<UserClient> l) {
		this.l = l;
	}
	
	public String update()
	{
		if(usd.update(uc)==0)
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
}
