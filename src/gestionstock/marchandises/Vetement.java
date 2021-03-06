package gestionstock.marchandises;

public abstract class Vetement extends Produit {
	
	protected String couleur;
	protected boolean ski;
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public boolean isSki() {
		return ski;
	}
	public void setSki(boolean ski) {
		this.ski = ski;
	}
	
	public Vetement(int n, double p) {
		super(n, p);
		//stock.getProduits().add(this);
		
	}
	
	
	public Vetement(int a,double q, String c, Boolean s) {
		this(a, q);
		this.setCouleur(c);
		this.setSki(s);
		//stock.getProduits().add(this);
	
	}

}
