package clase2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaBajaTests {

	TarjetaBaja t = new TarjetaBaja(0);
	@Test
	void testViajeColectivo() {
		//Arrange
		double saldoEsperado = 46.73;
		double saldoObtenido;
		//Act
		t.cargar(200);
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();
		t.pagarViajeEnColectivo();
		t.pagarViajeEnSubte();
		saldoObtenido = t.obtenerSaldo();
		//Assert
		assertEquals((Math.round(saldoObtenido*1000)), saldoEsperado*1000);
	}
}