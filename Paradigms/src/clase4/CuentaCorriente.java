package clase4;

public class CuentaCorriente extends Cuenta {
	private double descubierto = 0;
	
	CuentaCorriente(double descubierto)
	{
		this.descubierto = descubierto;
	}
	
	@Override
	protected boolean saldoSuficiente(double monto)
	{
		return this.saldo + descubierto >= monto;
	}
}
