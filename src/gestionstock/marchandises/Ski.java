package gestionstock.marchandises;

public class Ski extends Produit {
	
	private Double taille,poids;
	private String modele ;
		
	public Double getTaille() {
		return taille;
	}
	public void setTaille(Double taille) {
		this.taille = taille;
	}
	public Double getPoids() {
		return poids;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
	public Ski(int n, double p) {
		super(n, p);
	}
	public Ski(int a, double z, double t, double p, String c) {
		this(a,z);
		this.setTaille(t);
		this.setPoids(p);
		this.setModele(c);
	}
	
	public String toString() {
		String chaine = super.toString();
		chaine = chaine + "Ski " + this.getModele() + " de taille " + this.getTaille() + " mètre pesant " + this.getPoids() +"KG" ;
		return chaine;
	}
}
