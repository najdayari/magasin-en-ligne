package entities;

public class Commande {
	private int numcmd;
	private String date;
	private int id_user;
	private Float prixtotal;
	private int pointstotal;
	public Commande(int numcmd, String date, int id_user, Float prixtotal,
			int pointstotal) {
		super();
		this.numcmd = numcmd;
		this.date = date;
		this.id_user = id_user;
		this.prixtotal = prixtotal;
		this.pointstotal = pointstotal;
	}
	public Commande() {
		
	}
	public int getNumcmd() {
		return numcmd;
	}
	public void setNumcmd(int numcmd) {
		this.numcmd = numcmd;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public Float getPrixtotal() {
		return prixtotal;
	}
	public void setPrixtotal(Float prixtotal) {
		this.prixtotal = prixtotal;
	}
	public int getPointstotal() {
		return pointstotal;
	}
	public void setPointstotal(int pointstotal) {
		this.pointstotal = pointstotal;
	}
	
	
	

}
