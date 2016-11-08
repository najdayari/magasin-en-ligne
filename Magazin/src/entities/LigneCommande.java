package entities;

public class LigneCommande {
		
	private int codeligne;
	private int numcmd;
	private int numprod;
	private int qte;
	public LigneCommande(int codeligne, int numcmd, int numprod, int qte) {
		super();
		this.codeligne = codeligne;
		this.numcmd = numcmd;
		this.numprod = numprod;
		this.qte = qte;
	}
	public LigneCommande() {
		
	}
	public int getCodeligne() {
		return codeligne;
	}
	public void setCodeligne(int codeligne) {
		this.codeligne = codeligne;
	}
	public int getNumcmd() {
		return numcmd;
	}
	public void setNumcmd(int numcmd) {
		this.numcmd = numcmd;
	}
	public int getNumprod() {
		return numprod;
	}
	public void setNumprod(int numprod) {
		this.numprod = numprod;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}

	
}
