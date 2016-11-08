package entities;

public class Produit {

	private int NumProd;
	private String Libelle;
	private int Stock;
	private float PrixTTC;
	private int PointProd;
	private String CodeCat;
	private int qte=1;
	
	public Produit() {
		
	}
	
	public Produit(int numProd, String libelle, int stock, float prixTTC, int pointProd, String codeCat) {
		super();
		NumProd = numProd;
		Libelle = libelle;
		Stock = stock;
		PrixTTC = prixTTC;
		PointProd = pointProd;
		CodeCat = codeCat;
	}
	
	
	
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public int getNumProd() {
		return NumProd;
	}
	public void setNumProd(int numProd) {
		NumProd = numProd;
	}
	public String getLibelle() {
		return Libelle;
	}
	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public float getPrixTTC() {
		return PrixTTC;
	}
	public void setPrixTTC(float prixTTC) {
		PrixTTC = prixTTC;
	}
	public int getPointProd() {
		return PointProd;
	}
	public void setPointProd(int pointProd) {
		PointProd = pointProd;
	}
	public String getCodeCat() {
		return CodeCat;
	}
	public void setCodeCat(String codeCat) {
		CodeCat = codeCat;
	}
	
	
}
