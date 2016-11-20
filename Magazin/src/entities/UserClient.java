package entities;

import java.sql.Date;

public class UserClient {
	
	private int id;
	private String nom;
	private String prenom;
	private Date datenais;
	private String login;
	private String pwd;
	private String questSec;
	private int ptUser;
	
	public UserClient()
	{
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatenais() {
		return datenais;
	}
	public void setDatenais(Date datenais) {
		this.datenais = datenais;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getQuestSec() {
		return questSec;
	}
	public void setQuestSec(String questSec) {
		this.questSec = questSec;
	}
	public int getPtUser() {
		return ptUser;
	}
	public void setPtUser(int i) {
		this.ptUser = i;
	}
	

}
