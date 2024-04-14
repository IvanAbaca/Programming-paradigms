package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CerraduraTests {

	Cerradura c = new Cerradura(1,3);
	
	@Test
	void testabrirSinFallos(){
		//Arrange
		//Act
		c.abrir(1);
		//Assert
		assertEquals(c.estaAbierta(), true); //Abre la puerta
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
		assertEquals(c.estaAbierta(), true); //Abre la puerta despues de un intento fallido
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
		assertEquals(c.estaAbierta(), true); //Abre la puerta despues de dos intentos fallidos
		assertEquals(c.contarAperturasExitosas(), 1);
		assertEquals(c.contarAperturasFallidas(), 2);
	}
	
	@Test
	void testCerraduraBloqueada()
	{
		//Arrange
		//Act
		c.abrir(2); c.abrir(2);	c.abrir(2); //3 Intentos fallidos
		assertEquals(c.abrir(1), false); //Intento exitoso
		
		//Assert
		assertEquals(c.estaCerrada(), true); //Intenta abrir la puerta despues de tres intentos fallidos pero no puede
		assertEquals(c.fueBloqueada(), true); //Intenta abrir la puerta despues de tres intentos fallidos pero no puede
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
		assertEquals(c.estaAbierta(), true); //La puerta fue abierta porque no se bloqueó
		assertEquals(c.fueBloqueada(), false); //No se bloqueó por el reseteo de intentos
		assertEquals(c.contarAperturasExitosas(), 2);
		assertEquals(c.contarAperturasFallidas(), 3);
	}
}
