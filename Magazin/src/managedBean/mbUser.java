package managedBean;

import java.util.ArrayList;

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
	
	
}
