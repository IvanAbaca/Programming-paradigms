package clase4;

public class Colectivo extends Vehiculo {
	private final static double valor_boleto = 270;
	private double recaudacion = 0;
	
	public Colectivo(char t) {
		this.max_pasajeros = (t=='c')?1500:4;
		this.max_distancia = 50;
	}

	@Override
	public boolean subir_pasajero() {
		if(super.subir_pasajero())
		{
			this.recaudacion =+ valor_boleto;
			System.out.println("Pagó " + valor_boleto + "$.");
			return true;
		}
		return false;
	}
	
	public double obtener_recaudacion() { return recaudacion; }
}
