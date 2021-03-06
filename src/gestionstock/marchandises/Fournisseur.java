package gestionstock.marchandises;

public class Fournisseur {
	private String name, nationalite;
	private int id;
		
	public Fournisseur (int id, String n ) {
		this.setId(id);
		this.setNationalite(n);
	}
	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//public void fabrique(int nb,) {//le but final de cette méthode est de fabriquer certain type de produits en fonction du num ID du fourni
//		id = getId();
//		if (id == 001) {
//		for (int i = 0; i < nb; i++) {
//			new Veste(b, z, s, true, t);
//			System.out.print("Le fournisseur " + getId() + " a " + nb + " vestes prêts à être livrés\n");
//			}
//		}
//		else {
//			if (id == 002) {
//			for (int o = 0; o < nb; o++) {
//				new Produit(o);
//				System.out.print("Le fournisseur " + getId() + " a " + nb + " pantalons prêts à être livrés\n");
//				} 
//			}
//		}
//	}
}

	