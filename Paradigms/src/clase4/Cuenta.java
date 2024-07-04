package clase4;

import java.util.ArrayList;

public class Cuenta {
	protected double saldo = 0;
	protected ArrayList<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	public void depositar(double deposito) 
	{ 
		if(!this.montoValido(deposito))
			return;
		saldo += deposito;
		agregarTransaccion(deposito, "Deposito");
	}

	public boolean retirar(double retiro) 
	{
		if(!this.saldoSuficiente(retiro) || !this.montoValido(retiro))
			return false;
		this.saldo -= retiro;
		return this.agregarTransaccion(retiro, "Retiro");
	}
	
	public synchronized boolean transferir(int transferencia, Cuenta destino) 
	{ 
		if(!this.saldoSuficiente(transferencia) || !this.montoValido(transferencia))
			return false;
		
		this.saldo-=transferencia;
		destino.saldo+=transferencia;
		
		return this.agregarTransaccion(transferencia, "Transferencia");
	}
	
	protected double consultarSaldo() { return this.saldo; }
	protected boolean saldoSuficiente(double monto) { return this.saldo >= monto; }
	protected boolean montoValido(double monto) { return monto > 0; }
	protected boolean agregarTransaccion(Transaccion t) { return this.transacciones.add(t); }
	protected boolean agregarTransaccion(double monto, String Motivo) { return this.transacciones.add(new Transaccion(monto, Motivo));	}
	
	public void logTransacciones() {
		for(Transaccion elem : transacciones)
		{
			if(elem != null)
				System.out.println(elem.toString());
			else return;
		}
	}
}	
