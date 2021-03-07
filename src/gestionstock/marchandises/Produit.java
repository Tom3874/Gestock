package gestionstock.marchandises;

public class Produit {
	protected int num;
	protected double prix;

	
	public Produit(int m) {
		this.setNum(m);
		//stock.getProduits().add(this);
	
	}
	
	public Produit(int n, double p) {
		this.setNum(n);
		this.setPrix(p);
		//stock.getProduits().add(this);
		
	
	}
	public int getNum() {
		return num;
	}

	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setNum(int num) {
		this.num = num;
	}


	public String toString() {
		String str = "Produit n°" + this.getNum();
		str = str + " à " + this.getPrix() + " € : ";
		return str;
	}
	
	public void afficherInfos() {
		System.out.print(this.toString() + "\n");
	}
	
}
	
	

