package clase6;

import java.util.List;
import java.util.ArrayList;

public class Mensajeria {
	private List<Paquete> registro = new ArrayList<Paquete>();
	
	//1 - Agregar un nuevo paquete al registro
	public boolean agregar(int seg, String orig, String dest, double peso) {
		return (buscar(seg) == null)? registro.add(new Paquete(seg, orig, dest, peso)) : false;
	}
	
	//2 - Buscar un paquete por número de seguimiento.
	public Paquete buscar(int seg) {
		for(Paquete elem : registro)
			if(elem.getSeguimiento() == seg)
				return elem;
		return null;
	}
	
	//3 - Mostrar la lista de paquetes que superan un peso determinado.
	public void pesoMayor(double peso) {
		for(Paquete elem : registro)
			if(elem.getPeso() > peso)
				System.out.println(elem.toString());
	}
}