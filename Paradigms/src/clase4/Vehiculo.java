package clase4;

public class Vehiculo {
	protected int max_pasajeros = 0;
	protected int max_distancia;
	protected int cant_pasajeros = 0;

	public Vehiculo(){ }
	public Vehiculo(char t){ }
	
	public boolean subir_pasajero()
	{
		cant_pasajeros++;
		System.out.println("Subió un pasajero.");
		return true;
	}
	
	public void bajar_pasajero()
	{
		if(cant_pasajeros>0)
		{
			cant_pasajeros--;
			System.out.println("Bajó un pasajero.");
		}
	}
}
