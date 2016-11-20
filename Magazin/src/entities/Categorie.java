package entities;


public class Categorie {
	
	private  String CodeCat;
	private String NomCat;
	
	public Categorie ()
	{
		
	}
	
	public Categorie(String codeCat, String nomCat) {
		super();
		CodeCat = codeCat;
		NomCat = nomCat;
	}
	public String getCodeCat() {
		return CodeCat;
	}
	public void setCodeCat(String codeCat) {
		CodeCat = codeCat;
	}
	public String getNomCat() {
		return NomCat;
	}
	public void setNomCat(String nomCat) {
		NomCat = nomCat;
		
		
	}
	
	
	
}
