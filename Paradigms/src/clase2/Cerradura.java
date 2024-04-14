package clase2;

import java.util.Objects;

public class Cerradura {
	
	private boolean isOpen;
	private int cda;
	private int cdfcqlb;
	private int intentos = 0;
	private int aperturaExitosa = 0;
	private int aperturaFallida = 0;
	
    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean)
    {
    	this.isOpen = false;
    	this.cda = claveDeApertura;
    	this.cdfcqlb = cantidadDeFallosConsecutivosQueLaBloquean;
    }
    
	public boolean abrir(int clave)
	{
		if(this.fueBloqueada())
			return false;
		
		if (this.estaAbierta())
			return isOpen;
		
		if(clave == this.cda)
		{
			this.intentos = 0;
			this.aperturaExitosa++;
			return isOpen = true;
		}
		
		this.intentos++;
		this.aperturaFallida++;
		return isOpen;
	}

	public void cerrar() { this.isOpen = false; }
	
	public boolean estaAbierta() 	{ return isOpen; }
	public boolean estaCerrada() 	{ return !isOpen; }
	public boolean fueBloqueada() 	{ return this.intentos == this.cdfcqlb; }
	
	public int contarAperturasExitosas() { return this.aperturaExitosa; }
	public int contarAperturasFallidas() { return this.aperturaFallida; }
	
	@Override
	public int hashCode() {
		return Objects.hash(aperturaExitosa, aperturaFallida, cda, cdfcqlb, intentos, isOpen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cerradura other = (Cerradura) obj;
		return aperturaExitosa == other.aperturaExitosa && aperturaFallida == other.aperturaFallida && cda == other.cda
				&& cdfcqlb == other.cdfcqlb && intentos == other.intentos && isOpen == other.isOpen;
	}
}