package clase6;

public class Paquete {
	private int seguimiento;
	private String origen;
	private String destino;
	private double peso;

	public Paquete(int seg, String orig, String dest, double peso) {
		seguimiento = seg;
		origen = orig;
		destino = dest;
		this.peso = peso;
	}
	
	//getters
	public double getPeso() { return peso; }
	public int getSeguimiento() { return seguimiento; }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nPaquete: " + 
				"\n\tSeguimiento= " + this.seguimiento + 
				"\n\tOrigen= " + this.origen +
				"\n\tDestino= " + this.destino+
				"\n\tPeso= " + this.peso + "kg";
	}
}