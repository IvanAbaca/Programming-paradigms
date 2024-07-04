package clase6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NotaClase6 {
	
	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();  //<Obj> => Generics
		//List<String> lista = new ArrayList<String>(); //No importa que use, heredan del padre
		
		System.out.println(lista);
		System.out.println(lista.size());
		
		lista.add("Hola");
		lista.add("Chau");
		lista.add("E");
		lista.add("B");
		lista.add("A");
		lista.add("D");
		lista.add("C");
		
		System.out.println(lista);
		System.out.println(lista.size());
		
		lista.remove(0); //Saca hola

		System.out.println(lista);
		System.out.println(lista.size());
		
		lista.remove("Chau"); //Saca Chau
		
		System.out.println(lista);
		System.out.println(lista.size());
		
		Collections.sort(lista);
		System.out.println(lista);
		
		Collections.shuffle(lista);
		System.out.println(lista);
		
		for(String elem : lista)
			System.out.println(elem);
		
		//iterator
		
		for(int i=0; i<lista.size(); i++)
		{
			String elem = lista.get(i);
			System.out.println("- " + elem);
		}
	}
	
	
}
