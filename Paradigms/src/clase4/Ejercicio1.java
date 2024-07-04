package clase4;

public class Ejercicio1 {

	public static void main(String[] args) {

		Cuenta c = new Cuenta();
		CuentaDeAhorros cda = new CuentaDeAhorros();
		CuentaCorriente cc = new CuentaCorriente(100);
		
		c.depositar(3);
		c.transferir(1, cc);
		c.transferir(1, cda);
		c.retirar(1);
		
		
		System.out.println("Saldo actual: " + c.consultarSaldo());
		c.logTransacciones();
	}

}
