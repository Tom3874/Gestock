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
	public void listingStock() {
		System.out.print("-----------------------------------------"+"\n");
		System.out.print("Listing des produits du stock"+"\n");
		System.out.print("-----------------------------------------"+"\n");
		for (Produit p : this.getProduits()) {
			p.afficherInfos();
		}
	}
	
}
