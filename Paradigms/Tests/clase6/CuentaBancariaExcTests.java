package clase6;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaBancariaExcTests {

	CuentaBancariaExc cb;
	
	@BeforeEach
	void setup() throws Exception
	{
		cb = new CuentaBancariaExc(1000);
	}
	
	@Test
	void testCrear() {		
		assertThrows(Exception.class, () -> 
		{ cb = new CuentaBancariaExc(-1); });
	}
	
	@Test
	void testRetirar() {
		
		
			
	}
	
	@Test
	void testDepositar() {
		
		
		
	}

}
