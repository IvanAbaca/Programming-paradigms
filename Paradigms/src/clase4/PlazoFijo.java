package clase4;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class PlazoFijo {
	
	private CuentaDeAhorros cuenta = new CuentaDeAhorros();
	protected ArrayList<Transaccion> ingresos = new ArrayList<Transaccion>();

	public boolean privarMonto(double monto)
	{
		if(!this.cuenta.montoValido(monto) && !this.cuenta.saldoSuficiente(monto))
			return false;
		
		return this.cuenta.reservar(monto) && this.ingresos.add(new Transaccion(monto, "Plazo fijo")); 
	}
	
	public boolean retirarMonto(double monto)
	{
		double total = 0;

		for(Transaccion elem : ingresos)
		{
			Period periodo = Period.between(elem.obtenerFecha(), LocalDate.now());
	        int meses = periodo.getMonths();
			double mt = elem.obtenerMonto();
			double beneficio = mt*0.3*meses;
			
			total += monto+beneficio;
		}
		
		if(monto>total)
			return false;
		
		total = 0;
		
		for(Transaccion elem : ingresos)
		{
			Period periodo = Period.between(elem.obtenerFecha(), LocalDate.now());
	        int meses = periodo.getMonths();
			double mt = elem.obtenerMonto();
			double beneficio = mt*0.3*meses;
			
			if(total+mt+beneficio >= monto)
			{
				elem.modificarMonto(mt-(monto-total));
				return this.cuenta.liberar(monto);
			}
			ingresos.remove(elem);
		}
		return false;
	}
}
