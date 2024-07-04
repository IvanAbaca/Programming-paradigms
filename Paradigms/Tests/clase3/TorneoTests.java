package clase3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TorneoTests {

	Torneo t = new Torneo(10);
	Torneo t_inicialized;
	@BeforeEach
	void setup()
	{
		t.agregarLuchador(new Luchador(300, 1500)); //0 gana a 9
		t.agregarLuchador(new Luchador(320, 1500)); //1 gana a 0-9
		t.agregarLuchador(new Luchador(299, 1580)); //2 gana a 9
		t.agregarLuchador(new Luchador(330, 1690)); //3 gana a 0-1-2-4-8-9
		t.agregarLuchador(new Luchador(330, 1540)); //4 gana a 0-1-9
		t.agregarLuchador(new Luchador(339, 1500)); //5 gana a 0-1-9
		t.agregarLuchador(new Luchador(298, 1700)); //6 gana a 8-9
		t.agregarLuchador(new Luchador(344, 1570)); //7 gana a 0-1-4-5-9
		t.agregarLuchador(new Luchador(276, 1678)); //8 gana a nadie
		t.agregarLuchador(new Luchador(289, 1499)); //9 gana a nadie
		
		t_inicialized = new Torneo(t.getLuchadores()); //Mismo pero inicializado como vector
	}
	
	@Test
	void testDominios() {
		//Arrange
		int [] dominiosEsperados = {1,2,1,6,3,3,2,5,0,0};
		
		//Act
		int [] dominiosObtenidos = t.calcularDominios();
		int [] dominiosObtenidos_ini = t.calcularDominios();
		
		//Assert
		assertArrayEquals(dominiosObtenidos, dominiosEsperados);
		assertArrayEquals(dominiosObtenidos_ini, dominiosEsperados);
	}

}
