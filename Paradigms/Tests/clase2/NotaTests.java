package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTests {
	Nota nota = new Nota();
	Nota notaError = new Nota();
	@Test
	void testInsertNotaMayor() {
		//Arrange
		//Act
		nota.recuperar(10); //Carga 10 de nota
		notaError.recuperar(11); //Carga una nota fuera de rango
		//Assert
		assertEquals(nota.getNota(), 10); //Deberia tener 10
		assertEquals(notaError.getNota(), 0); //Deberia nunca haber modificado la nota
	}
	
	@Test
	void testInsertNotaMenor() {
		//Arrange
		Nota notaError = new Nota();
		//Act
		nota.recuperar(8); //Carga 8 de nota
		nota.recuperar(7); //Carga 7 de nota
		notaError.recuperar(-1); //Carga una nota fuera de rango
		//Assert
		assertEquals(nota.getNota(), 8); //Deberia tener 8 de nota porque la recuperacion no debe ser menor
		assertEquals(notaError.getNota(), 0); //Deberia nunca haber modificado la nota
	}

}
