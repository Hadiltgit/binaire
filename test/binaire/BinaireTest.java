package binaire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaireTest {
	
	Binaire binaire ;

	@BeforeEach
	void setUp() throws Exception {
		binaire = new Binaire();
	}

	@Test
	void iter1test() {
		assertEquals("1",binaire.toBinaire(1));
	}
	
	@Test
	void iter2test() {
		assertEquals("10",binaire.toBinaire(2));
		assertEquals("11",binaire.toBinaire(3));
	}
	

	@Test
	void iter3test() {
		assertThrows(IllegalArgumentException.class , ()->binaire.toBinaire(-1) );
	}

}
