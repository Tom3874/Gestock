package gestionstock.marchandises;

public abstract class Vetement extends Produit {
	
	protected String couleur;
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	
	public Vetement(int n, double p) {
		super(n, p);
		
	}
		
	public Vetement(int a,double q, String c) {
		this(a, q);
		this.setCouleur(c);
		
	
	}

}
