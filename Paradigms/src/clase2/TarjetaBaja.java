package clase2;

public class TarjetaBaja {

	//Atributes
	private double saldo;
	private int cantViajesEnColect;
	private int cantViajesEnSubte;

	//Constructor
	public TarjetaBaja(double saldoInicial) { this.saldo = saldoInicial; }
	
	//Getters
	public double obtenerSaldo() { return this.saldo; }
	public int contarViajes() { return this.contarViajesEnColectivo()+this.contarViajesEnSubte(); }
	public int contarViajesEnColectivo() { return this.cantViajesEnColect; }
	public int contarViajesEnSubte() { return this.cantViajesEnSubte; }
	
	//Methods
	public void cargar(double monto) { this.saldo += monto; }
	public void pagarViajeEnColectivo() { cantViajesEnColect++; this.saldo -= 39.59; }
	public void pagarViajeEnSubte() { cantViajesEnSubte++; this.saldo -= 34.50; }
}