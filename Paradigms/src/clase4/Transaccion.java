package clase4;

import java.time.LocalDate;


public class Transaccion {
	
	private double movimiento;
	private String motivo;
	private LocalDate fecha;
	
	Transaccion(double movimiento, String motivo)
	{
		this.movimiento = movimiento;
		this.motivo = motivo;
		fecha = LocalDate.now();
	}

	@Override
	public String toString() {
		return "\nTransaccion \n\t• Movimiento: " + movimiento + "\n\t• Motivo: " + motivo + "\n\t• Fecha: " + fecha;
	}
	
	public double obtenerMonto()
	{
		return this.movimiento;
	}
	
	public LocalDate obtenerFecha()
	{
		return this.fecha;
	}
	
	public void modificarMonto(double monto)
	{
		this.movimiento = monto;
	}
}
