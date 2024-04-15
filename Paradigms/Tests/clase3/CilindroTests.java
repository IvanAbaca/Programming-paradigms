package clase3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CilindroTests {

	Cilindro c;
	
	@BeforeEach
	void setup ()
	{
		this.c = new Cilindro(4, 10);
	}
	
	@Test
	void testArea() {
		double resMental = 351.858;
		assertEquals(this.c.area(), resMental, 0.001);
	}
	
	@Test
	void testVolumen() {
		double resMental = 502.654;
		assertEquals(this.c.volumen(), resMental, 0.001);
	}
}
