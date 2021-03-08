package gestionstock.marchandises;

import java.util.LinkedList;

public final class Stock {
	
	private static Stock instance;
	
	

	public static Stock getInstance() {
		if (instance == null) {
			instance = new Stock();
		}
		return instance;
	}
	
	public Stock() {
			
	}
	 public Object clone() throws CloneNotSupportedException {
		    throw new CloneNotSupportedException();
	 }
	
	private LinkedList<Produit> produits = new LinkedList<Produit>();
	
	
	public LinkedList<Produit> getProduits() {
		return produits;
	}

	public void setProduits(LinkedList<Produit> produits) {
		this.produits = produits;
	}
	
	public void ajouter(Produit p) {
		this.getProduits().add(p);
	}
	
	public void supprimer(Produit a) {
	
			this.getProduits().remove(a);
			}
			
	public void reapproV( int u, int a, double p, String c, String t) {
		
		for (int i = 0; i<u;i++) {
			Veste n= new Veste(a,p,c,t);
			this.getProduits().add(n);
			a++;
		}
	}
	public void reapproP( int u, int a, double p, String c, int t) {
		
		for (int i = 0; i<u;i++) {
			Pantalon n= new Pantalon(a,p,c,t);
			this.getProduits().add(n);
			a++;
		}
	}
	public void reapproS( int u, int a, double p, double c, double t, String m) {
		
		for (int i = 0; i<u;i++) {
			Ski n= new Ski(a,p,c,t,m);
			this.getProduits().add(n);
			a++;
		}
	}
	
	public void listingStock() {
		System.out.print("-----------------------------------------"+"\n");
		System.out.print("Listing des produits du stock"+"\n");
		System.out.print("-----------------------------------------"+"\n");
		for (Produit p : this.getProduits()) {
			p.afficherInfos();
		}
	}
	
}
