package gestionstock.marchandises;


public class Magasin {

	private Stock stocke;


	private Veste[]vestes = new Veste[5];
	private Pantalon[]pantalons = new Pantalon[5];
	private Ski[]skis = new Ski[2];

	public void setStocke(Stock stocke) {
		this.stocke = stocke;
	}

	public Stock getStocke() {
		return stocke;
	}
	
	public Veste[] getVestes() {
		return vestes;
	}

	public void setVestes(Veste[] vestes) {
		this.vestes = vestes;
	}

	public Pantalon[] getPantalons() {
		return pantalons;
	}

	public void setPantalons(Pantalon[] pantalons) {
		this.pantalons = pantalons;
	}

	public Ski[] getSkis() {
		return skis;
	}

	public void setSkis(Ski[] skis) {

		this.skis = skis;
	}
	
	public Magasin(Stock stocke) {
		this.setStocke(stocke);
	}
	
	public void refillV(){
		
		for (int i=0; i < this.getVestes().length; i++) {
			if (this.getVestes()[i] == null) {
				for (int j=0; j < stocke.getProduits().size(); j++) {
					if(stocke.getProduits().get(j).getClass().getSimpleName().equals("Veste")) {
						this.getVestes()[i] = (Veste) stocke.getProduits().get(j);
						stocke.supprimer(stocke.getProduits().get(j));		
						break;
					}
					
					//else return;
				}
				}
			
			//else return;		
			
			}
	}
	
	public void refillP(){	
		for (int i=0; i < this.getPantalons().length; i++) {
			if (this.getPantalons()[i] == null) {
				for (int j=0; j < stocke.getProduits().size(); j++) {
					if(stocke.getProduits().get(j).getClass().getSimpleName().equals("Pantalon")) {
						this.getPantalons()[i] = (Pantalon) stocke.getProduits().get(j);
						stocke.supprimer(stocke.getProduits().get(j));	
						break;
					}
					//else return;
				}
				}
			
			//else return;		
			
			}}
	public void refillS(){
		for (int i=0; i < this.getSkis().length; i++) {
			if (this.getSkis()[i] == null) {
				for (int m=0; m < stocke.getProduits().size(); m++) {
					if(stocke.getProduits().get(m).getClass().getSimpleName().equals("Ski")) {
						this.getSkis()[i] = (Ski) stocke.getProduits().get(m);
						stocke.supprimer(stocke.getProduits().get(m));	
						break;
					}
					//else return;
				}
				}
			
			//else return;		
			
			}
		}
	
	public void refill() {
		refillP();
		refillV();
		refillS();
	}
	public void listingMagasin() {
		String str;
		Veste veste;
		Pantalon pantalon;
		Ski ski;
		System.out.print("-----------------------------------------"+"\n");
		System.out.print("Listing des produits du magasin"+"\n");
		System.out.print("-----------------------------------------"+"\n");
		System.out.print("Reserve de vestes :"+"\n");
		for (int i=0; i < this.getVestes().length; i++) {
			veste = this.getVestes()[i];
			if(veste == null) {
				
				str = "Place "+ i +" libre." + "\n";
				System.out.print(str);
			}
				else {
					 veste.afficherInfos();
				} }
			
		System.out.print("Reserve de pantalons :"+"\n");	
		for (int j=0; j < this.getPantalons().length; j++) {
				pantalon = this.getPantalons()[j];
				if(pantalon == null) {
					
					str = "Place "+ j +" libre." + "\n";
					System.out.print(str);
				}
					else {
					 pantalon.afficherInfos();
					} }
	
		System.out.print("Reserve de skis :"+"\n");	
		for (int k=0; k < this.getSkis().length; k++) {
				ski = this.getSkis()[k];
				if(ski == null) {
					
					str = "Place "+ k +" libre." + "\n";
					System.out.print(str);
				}
					else {
						ski.afficherInfos();	
					}
					
		
	}
}}