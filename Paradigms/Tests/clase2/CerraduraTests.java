package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CerraduraTests {

	Cerradura c;
	
	@BeforeEach
	public void setup()
	{
		c = new Cerradura(1,3);
	}
	
	@Test
	void testabrirSinFallos(){
		//Arrange
		//Act
		c.abrir(1);
		c.abrir(1); //Re-intento de apertura
		//Assert
		assertTrue(c.estaAbierta()); //Abre la puerta
		assertEquals(c.contarAperturasExitosas(), 1);
		assertEquals(c.contarAperturasFallidas(), 0);
	}
	
	@Test
	void testabrirConUnFallo()
	{
		//Arrange
		//Act
		c.abrir(2); //Intento fallido
		c.abrir(1); //Intento exitoso
		
		//Assert
		assertTrue(c.estaAbierta()); //Abre la puerta despues de un intento fallido
		assertEquals(c.contarAperturasExitosas(), 1);
		assertEquals(c.contarAperturasFallidas(), 1);
	}
	
	@Test
	void testabrirConDossFallos()
	{
		//Arrange
		//Act
		c.abrir(2);	c.abrir(2);	//2 Intentos fallidos
		c.abrir(1); //Intento exitoso
		
		//Assert
		assertTrue(c.estaAbierta()); //Abre la puerta despues de dos intentos fallidos
		assertEquals(c.contarAperturasExitosas(), 1);
		assertEquals(c.contarAperturasFallidas(), 2);
	}
	
	@Test
	void testCerraduraBloqueada()
	{
		//Arrange
		//Act
		c.abrir(2); c.abrir(2);	c.abrir(2); //3 Intentos fallidos
		assertFalse(c.abrir(1)); //Intento exitoso
		
		//Assert
		assertTrue(c.estaCerrada()); //Intenta abrir la puerta despues de tres intentos fallidos pero no puede
		assertTrue(c.fueBloqueada()); //Intenta abrir la puerta despues de tres intentos fallidos pero no puede
		assertEquals(c.contarAperturasExitosas(), 0);
		assertEquals(c.contarAperturasFallidas(), 3);
	}
	
	@Test
	void testReseteoDeIntentos()
	{
		//Arrange
		//Act
		c.abrir(2); //Intento fallido
		c.abrir(2); //Intento fallido
		c.abrir(1); //Intento exitoso
		c.cerrar(); //Cierro la puerta
		c.abrir(2); //Si no me reseteó los intentos, entonces este intento deberia bloquear la apertura
		c.abrir(1); //Intento exitoso
		//Assert
		assertTrue(c.estaAbierta()); //La puerta fue abierta porque no se bloqueó
		assertFalse(c.fueBloqueada()); //No se bloqueó por el reseteo de intentos
		assertEquals(c.contarAperturasExitosas(), 2);
		assertEquals(c.contarAperturasFallidas(), 3);
	}
}
