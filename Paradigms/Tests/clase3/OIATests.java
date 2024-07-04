package clase3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import clase2.Punto;

class OIATests {
	OIA partido;
	OIA partidoEmpate;
	Punto[] lanzamiento;
	Punto[] lanzamientoEmpate;
	
	@BeforeEach
	void setup()
	{
		lanzamiento = new Punto[10];
		this.lanzamiento[0] = new Punto( 9,	 3);
		this.lanzamiento[1] = new Punto( 6,	 1);
		this.lanzamiento[2] = new Punto( 9,	 8);
		this.lanzamiento[3] = new Punto(-1,	-2);
		this.lanzamiento[4] = new Punto( 8,	-9);
		this.lanzamiento[5] = new Punto(-2,	 10);
		this.lanzamiento[6] = new Punto( 5,	-8);
		this.lanzamiento[7] = new Punto(-5,	 8);
		this.lanzamiento[8] = new Punto(-10, 9);
		this.lanzamiento[9] = new Punto( -1,-10);
		
		lanzamientoEmpate = new Punto[10];
		this.lanzamientoEmpate[0] = new Punto( -9,-3);
		this.lanzamientoEmpate[1] = new Punto( -6,-1);
		this.lanzamientoEmpate[2] = new Punto( -9,-8);
		this.lanzamientoEmpate[3] = new Punto(-1, -2);
		this.lanzamientoEmpate[4] = new Punto( -8,-9);
		this.lanzamientoEmpate[5] = new Punto(-2, -10);
		this.lanzamientoEmpate[6] = new Punto( 5, -8);
		this.lanzamientoEmpate[7] = new Punto(-5, -8);
		this.lanzamientoEmpate[8] = new Punto(-10,-9);
		this.lanzamientoEmpate[9] = new Punto( -1,-10);
		
		this.partido = new OIA(lanzamiento, 10);
		this.partidoEmpate = new OIA(lanzamientoEmpate, 10);
	}
	
	@Test
	void testDominios() {
		//Arrange
		/*
		partido.radio();
		for(Punto elem: partido.getLista())
			System.out.println(elem.distanciaAlOrigen() + "(" +elem.obtenerX() + "-" + elem.obtenerY()+")");
		*/
		//Act
		
		//Assert
		assertEquals(partido.radio(),90);
		assertEquals(partidoEmpate.radio(),0);
	}
}
