package gestionstock.marchandises;

public class Veste extends Vetement {

	private Magasin stocke;
	private String taille;
	

	public Magasin getStocke() {
		return stocke;
	}

	public void setStocke(Magasin appartient) {
		this.stocke = appartient;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}
	

	public Veste(int a, double q, String c, Boolean s) {
	super(a, q, c, s);
	//stock.getProduits().add(this);
	
	}
	
	public String toString() {
		String chaine = super.toString();
		chaine = chaine + "Veste de taille " + this.getTaille() + " et de couleur " + this.getCouleur() ;
		return chaine;
	} 
	
	public Veste(int b, double z, String v, Boolean d, String t) {
		this(b,z,v,d);
		this.setTaille(t);
		//stock.getProduits().add(this);
		
}
	//public void ajouterstock() {
		//super.ajouterstock(this); ;
	//}
}