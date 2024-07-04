package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTests {

	Punto p = new Punto();
	@Test
	void testEjes() {
		//Arrange
		Punto xchanged = new Punto(); //Se crea en el (0,0)
		Punto ychanged = new Punto(); //Se crea en el (0,0)
		//Act
		xchanged.cambiarX(1); //Ya deja de estar en el origen y en el eje y
		ychanged.cambiarY(1); //Ya deja de estar en el origen y en el eje x
		//Assert
		assertEquals(xchanged.estaSobreEjeX(), true);
		assertEquals(ychanged.estaSobreEjeY(), true);
		assertEquals(xchanged.esElOrigen(), false);
		assertEquals(ychanged.esElOrigen(), false);
		assertEquals(p.esElOrigen(), true);
	}
	
	@Test
	void testDistanciaOrigen() {
		//Arrange
		//Act
		p.cambiarX(3);
		p.cambiarY(4);
		//Assert
		assertEquals(p.distanciaAlOrigen(), 5);
	}
	
	@Test
	void testDistanciaOtroPunto() {
		//Arrange
		Punto otroPunto = new Punto();
		//Act
		p.cambiarX(3);
		p.cambiarY(4);
		otroPunto.cambiarX(6);
		otroPunto.cambiarY(8);
		//Assert
		assertEquals(p.distanciaAotroPunto(otroPunto), 5);
	}
}
