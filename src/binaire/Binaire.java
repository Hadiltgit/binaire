package binaire;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Binaire {
  
	public String toBinaire(int nombre) {
		
		if(nonValide(nombre) == true) {
			throw new IllegalArgumentException("negatif");
		}
		
		int rest;
		int result = 1;
		while(nombre >= 2) {
			rest = nombre %2;
			nombre = nombre / 2;
			result = result*10 + rest;
		}
		return String.format("%d", result);
	}

	
	public boolean nonValide(int nbr) {
		if(nbr < 0) {
			return true;
		}
		return false;
	}
}
