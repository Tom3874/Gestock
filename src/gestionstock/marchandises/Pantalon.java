package gestionstock.marchandises;

public class Pantalon extends Vetement {

	private int taille;
	private Stock stock;

	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public Pantalon(int a, double q, String c) {
		super(a, q, c);
		}
		
		public Pantalon(int b, double z, String v, int t) {
			this(b,z,v);
			this.setTaille(t);
	}
		public Stock getStock() {
			return stock;
		}

		public String toString() {
			String chaine = super.toString();
			chaine = chaine + "Pantalon de taille " + this.getTaille() + " et de couleur " + this.getCouleur() ;
			return chaine;
		}
		
}

