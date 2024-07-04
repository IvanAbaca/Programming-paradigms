package clase2;

public class Cerradura {
	
	private boolean estado;
	private int claveApertura;
	private int cantIntentosConsec;
	private int intentos = 0;
	private int aperturaExitosa = 0;
	private int aperturaFallida = 0;
	
    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean)
    {
    	this.estado = false;
    	this.claveApertura = claveDeApertura;
    	this.cantIntentosConsec = cantidadDeFallosConsecutivosQueLaBloquean;
    }
    
	public boolean abrir(int clave)
	{
		if(this.fueBloqueada() || this.estaAbierta())
			return estado;

		if(clave == this.claveApertura)
		{
			this.intentos = 0;
			this.aperturaExitosa++;
			return estado = true;
		}
		
		this.intentos++;
		this.aperturaFallida++;
		return estado;
	}

	public void cerrar() { this.estado = false; }
	
	public boolean estaAbierta() 	{ return estado; }
	public boolean estaCerrada() 	{ return !estado; }
	public boolean fueBloqueada() 	{ return this.intentos == this.cantIntentosConsec; }
	
	public int contarAperturasExitosas() { return this.aperturaExitosa; }
	public int contarAperturasFallidas() { return this.aperturaFallida; }
}