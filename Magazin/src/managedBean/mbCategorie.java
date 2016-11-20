package managedBean;




import java.util.ArrayList;

import javax.faces.application.FacesMessage;

import org.primefaces.context.RequestContext;

import dao.CategorieDAO;
//import dao.CategorieImp;
import entities.Categorie;




public class mbCategorie {

	public mbCategorie(){}
	
	
	private Categorie  c =new Categorie();
	private CategorieDAO categ=new CategorieDAO();
//private CategorieImp cat = new CategorieImp();
	
	private ArrayList<Categorie> listeCateg = new ArrayList<Categorie>();

	
	public Categorie getC() {
		return c;
	}

	public void setC(Categorie c) {
		this.c = c;
	}

	public CategorieDAO getCateg() {
		return categ;
	}

	public void setCateg(CategorieDAO categ) {
		this.categ = categ;
	}

	public String insert()
	{
		if(categ.insert(c)==0)
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion non effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		else
		{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Ajouter","Insertion effetctu�e");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "mmm";
		
		
	}
	
	public String modifier_Categorie()
	{
		if(categ.update(c)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			}
		
		return "ok";
		
		
	}
	public String  supprimer_categorie()
	{
		if(categ.delete(c)==0)
			{FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modification effetctuée");
			 RequestContext.getCurrentInstance().showMessageInDialog(msg);
		}
		else
			{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_WARN,"Modifier","Modificatio non effetctuée");
			RequestContext.getCurrentInstance().showMessageInDialog(msg);
			
			}
		
		return "ok";
		
		
	}

	public ArrayList<Categorie> getListeCateg() {
		listeCateg= categ.afficherCateg();
		return listeCateg;
	}

	public void setListeCateg(ArrayList<Categorie> listeCateg) {
		this.listeCateg = listeCateg;
	}
	
	
	
	
	
}