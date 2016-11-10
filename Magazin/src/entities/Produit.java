package entities;

public class Produit {

	private int numprod;
	private String libelle;
	private int stock;
	private float prixTTC;
	private int pointProd;
	private String codeCat;
	private int qte=1;
	
	public Produit() {
		
	}
	
	public Produit(int numProd, String libelle, int stock, float prixTTC, int pointProd, String codeCat) {
		super();
		this.numprod = numProd;
		this.libelle = libelle;
		this.stock = stock;
		this.prixTTC = prixTTC;
		this.pointProd = pointProd;
		this.codeCat = codeCat;
	}
	
	
	
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}

	public int getNumProd() {
		return numprod;
	}

	public void setNumProd(int numProd) {
		this.numprod = numProd;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public float getPrixTTC() {
		return prixTTC;
	}

	public void setPrixTTC(float prixTTC) {
		this.prixTTC = prixTTC;
	}

	public int getPointProd() {
		return pointProd;
	}

	public void setPointProd(int pointProd) {
		this.pointProd = pointProd;
	}

	public String getCodeCat() {
		return codeCat;
	}

	public void setCodeCat(String codeCat) {
		this.codeCat = codeCat;
	}
	
	
	
}
