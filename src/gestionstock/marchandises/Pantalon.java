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
	
	public Pantalon(int a, double q, String c, Boolean s) {
		super(a, q, c, s);
		}
		
		public Pantalon(int b, double z, String v, Boolean d, int t) {
			this(b,z,v,d);
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

