package gestionstock.marchandises;

public class Gestion {

	public static void main(String[] args) {
		Stock s = new Stock();
		Magasin m = new Magasin(s);
		Fournisseur f = new Fournisseur(001, "FR");
		Fournisseur f2 = new Fournisseur(002, "IT");
		Fournisseur f3 = new Fournisseur(003, "ES");
		Fournisseur f4 = new Fournisseur(004, "GB");
//		f.fabrique(10);
//		f2.fabrique(5);
//		f3.fabrique(15);
//		f4.fabrique(5);
		Veste v = new Veste(1, 99.99, "ROUGE", true, "M");
		Veste v1 = new Veste(2, 80, "NOIRE", true, "L");
		Veste v2 = new Veste(3, 80, "NOIRE", true, "M");
		Veste v3 = new Veste(4, 99.99, "ROUGE", true, "L");
		Veste v4 = new Veste(5, 99.99, "ROUGE", true, "M");
		Ski sk1 = new Ski(6, 500, 1.90, 2.0, "Salomon");
		Ski sk2 = new Ski(7, 500, 1.80, 2.0, "Salomon");
		Ski sk3 = new Ski(8, 500, 2.10, 2.0, "Salomon");
		Pantalon p1 = new Pantalon(9, 75.00, "BLANC", true, 38);
		Pantalon p2 = new Pantalon(10, 75.00, "NOIR", true, 38);
		Pantalon p3 = new Pantalon(11, 75.00, "BLANC", true, 40);
		Pantalon p4 = new Pantalon(12, 75.00, "NOIR", true, 38);
		Pantalon p5 = new Pantalon(13, 75.00, "NOIR", true, 40);
		s.ajouter(v);
		s.ajouter(v1);
		s.ajouter(v2);
		s.ajouter(v3);
		s.ajouter(v4);
		s.ajouter(sk1);
		s.ajouter(sk2);
		s.ajouter(sk3);
		s.ajouter(p1);
		s.ajouter(p2);
		s.ajouter(p3);
		s.ajouter(p4);
		s.ajouter(p5);
		
		
		
		
		m.refill();
		m.listingMagasin();
		s.listingStock();
	}

}
