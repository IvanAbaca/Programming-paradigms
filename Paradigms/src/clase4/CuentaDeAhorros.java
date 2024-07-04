package clase4;

public class CuentaDeAhorros extends Cuenta {
	private double saldoSecundario = 0;
	
	public boolean reservar(double reserva)
	{
		if(reserva > this.saldo)
			return false;
		this.saldoSecundario += this.saldo;
		this.saldo -= reserva;
		this.agregarTransaccion(reserva, "Reserva de saldo");
		return true;
	}
	
	public boolean liberar(double reserva)
	{
		if(reserva > this.saldoSecundario)
			return false;
		this.saldoSecundario -= reserva;
		this.saldo -= reserva;
		this.agregarTransaccion(reserva, "Liberacion de saldo");
		return true;
	}
}

/*
que permite reservar parte del saldo para que no esté disponible, 
en una especie de saldo secundario. Se puede disponer de ese saldo
normalmente una vez que se reintegre (a pedido del cliente) al saldo
total de la cuenta
*/