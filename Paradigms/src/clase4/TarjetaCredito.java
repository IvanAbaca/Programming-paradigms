package clase4;

import java.util.ArrayList;

public class TarjetaCredito {

	protected Cuenta cuenta = new Cuenta();
	protected ArrayList<Transaccion> compras = new ArrayList<Transaccion>();
	protected double total = 0;
	
	public void acumular(double compra)
	{
		this.compras.add(new Transaccion(compra*1.03, "Compra"));
		this.total+=compra*1.03;
	}
	
	public boolean debitar()
	{	
		if(this.total > this.cuenta.consultarSaldo())
			return false;
		for(Transaccion elem : compras)
			this.cuenta.agregarTransaccion(elem);
		return true;
	}
}
