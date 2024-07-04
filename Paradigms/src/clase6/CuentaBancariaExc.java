package clase6;

//Ejercicio 04 - Escribir una clase que simule una cuenta bancaria. 
//El programa debe lanzar una excepción si se intenta retirar más dinero 
//del que hay disponible en la cuenta.

//Ejercicio 5 - Agregar excepciones al ejercicio anterior (realizar una copia). El programa debe usar try-catch para manejar cualquier excepción que pueda ocurrir. Para ello, agregaremos al menos dos excepciones nuevas:
//	Crear una cuenta con saldo negativo
//	Retirar/Depositar montos negativos

public class CuentaBancariaExc {
	private double saldo = 0;
	
	public CuentaBancariaExc(double saldo) throws Exception
	{
		if(saldo<0)
			throw new Exception("No puede crear una cuenta con saldo negativo.");
		this.saldo = saldo;
	}
	
	public double retirar(double monto) throws Exception {
			if(monto<0)
				throw new Exception("El monto ingresado es invalido.");
			if(saldo-monto<0)
				throw new Exception("No puede retirar dicho monto.");
			
			saldo -= monto;
			return monto;
	}
	
	public void depositar(double saldo) throws Exception{
			if(saldo<0)
				throw new Exception("El saldo no puede ser negativo.");
			this.saldo += saldo;
	}
}
