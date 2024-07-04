package clase6;

import org.junit.jupiter.api.Test;

class MensajeriaTests {

	@Test
	void test() {
		Mensajeria mensajeria = new Mensajeria();
		
		mensajeria.agregar(0, "Aca", "Alla", 10);
		mensajeria.agregar(1, "Aca", "Alla", 20);
		mensajeria.agregar(2, "Aca", "Alla", 30);
		mensajeria.agregar(2, "NoDeberiaExistir", "NoDeberiaExistir", 40);
		
		mensajeria.pesoMayor(10);
	}

}
