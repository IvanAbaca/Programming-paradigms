package clase2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VectorTests {

	Vector v1 = new Vector(1,1,2);
	Vector v2 = new Vector(3,2,6);

	@Test
	void testSuma() {
		//Arrange
		Vector v3Mental = new Vector(4,3,8);
		//Act
		Vector v3 = v1.suma(v2);
		//Assert
		assertEquals(v3, v3Mental);
	}
	@Test
	void testResta() {
		//Arrange
		Vector v3Mental = new Vector(-2,-1,-4);
		//Act
		Vector v3 = v1.resta(v2);
		//Assert
		assertEquals(v3, v3Mental);
	}
	@Test
	void testProducto() {
		//Arrange
		Vector v3Mental = new Vector(2,2,4);
		//Act
		Vector v3 = v1.producto(2);
		//Assert
		assertEquals(v3, v3Mental);
	}
	@Test
	void testOpuesto() {
		//Arrange
		Vector v3Mental = new Vector(-1,-1,-2);
		//Act
		Vector v3 = v1.opuesto();
		//Assert
		assertEquals(v3, v3Mental);
	}

}
