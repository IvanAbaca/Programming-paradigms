package clase5;

import java.util.Comparator;

public class CompareComplejoReal implements Comparator<Complejo>{

	@Override
	public int compare(Complejo esto, Complejo aquello) {
		return Double.compare(esto.getReal(), aquello.getReal());
	}
	
}

//Tarea Guia de ejercicios cuestiones basicas 