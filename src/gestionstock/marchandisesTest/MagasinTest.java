package gestionstock.marchandisesTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import gestionstock.marchandises.Magasin;
import gestionstock.marchandises.Stock;
import gestionstock.marchandises.Veste;

class MagasinTest {

	@Test
	void testRefillV() {
		Stock s = new Stock();
		Magasin m = new Magasin(s);
		Veste[] vestes = new Veste[5];
		assertEquals("Erreur", m.refillV() ,  );
	}

	@Test
	void testRefillP() {
		fail("Not yet implemented");
	}

	@Test
	void testRefillS() {
		fail("Not yet implemented");
	}

	@Test
	void testListingMagasin() {
		fail("Not yet implemented");
	}

}
