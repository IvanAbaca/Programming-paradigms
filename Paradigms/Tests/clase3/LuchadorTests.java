package clase3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LuchadorTests {

	Luchador vec[] = new Luchador[10];
	@BeforeEach
	void setup ()
	{
		vec[0] = new Luchador(300, 1500);
		vec[1] = new Luchador(320, 1500);
		vec[2] = new Luchador(299, 1580);
		vec[3] = new Luchador(330, 1690);
		vec[4] = new Luchador(330, 1540);
		vec[5] = new Luchador(339, 1500);
		vec[6] = new Luchador(298, 1700);
		vec[7] = new Luchador(344, 1570);
		vec[8] = new Luchador(276, 1678);
		vec[9] = new Luchador(289, 1499);
	}
	
	@Test
	void testMayorAlturaMayorPeso() {
		assertTrue(vec[0].domina(vec[9]));
	}
	
	@Test
	void testMismaAlturaMayorPeso() {
		assertTrue(vec[3].domina(vec[4]));
	}
	
	@Test
	void testMenorAlturaMayorPeso() {
		assertFalse(vec[2].domina(vec[0]));
	}
	
	@Test
	void testMayorAlturaMismoPeso() {
		assertTrue(vec[1].domina(vec[0]));
	}

	@Test
	void testMayorAlturaMenorPeso() {
		assertFalse(vec[9].domina(vec[8]));
	}
	
	@Test
	void testMismaAlturaMismoPeso() {
		assertFalse(vec[0].domina(vec[0]));
	}
	
	@Test
	void testMenorAlturaMenorPeso() {
		assertFalse(vec[1].domina(vec[3]));
	}
	
	@Test
	void testMenorAlturaMismoPeso() {
		assertFalse(vec[0].domina(vec[1]));
	}
	
	@Test
	void testMismaAlturaMenorPeso() {
		assertFalse(vec[4].domina(vec[3]));
	}
}
