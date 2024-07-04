package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoTests {

	Circulo c;
	
	@BeforeEach
	public void setup()
	{
		c = new Circulo(10);
	}
	
	@Test
	public void testCrearCirculo()
	{
		assertEquals(1,1);
	}
}
