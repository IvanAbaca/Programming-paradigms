package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuboTests {

	Cubo c = new Cubo(3);
	@Test
	void testCubo() {
		//Arrange
		double ladoObtenido;
		double ladoEsperado;
		//Act
		c.cambiarLado(4);
		ladoObtenido = c.obtenerLado();
		ladoEsperado = 4;
		//Assert
		assertEquals(ladoObtenido, ladoEsperado); //El lado original es 3 pero cambia a 4
	}
	
	@Test
	void testAreaCara() {
		//Arrange
		double AreaObtenida;
		double AreaEsperada;
		//Act
		AreaObtenida = c.obtenerAreaCara();
		AreaEsperada = 9;
		//Assert
		assertEquals(AreaObtenida, AreaEsperada);
	}
	
	@Test
	void testVolumenCubo() {
		//Arrange
		double VolumenObtenido;
		double VolumenEsperado;
		//Act
		VolumenObtenido = c.obtenerVolumen();
		VolumenEsperado = 27;
		//Assert
		assertEquals(VolumenObtenido, VolumenEsperado);
	}

}