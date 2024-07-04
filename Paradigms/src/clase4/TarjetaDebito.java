package clase4;

public class TarjetaDebito {
	
	Cuenta cuenta;
	
	TarjetaDebito()
	{
		cuenta = new Cuenta();
	}
	
	
	public boolean comprar(double compra)
	{
		return this.cuenta.retirar(compra);
	}
	
}
