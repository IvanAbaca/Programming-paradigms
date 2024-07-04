package clase3;

import java.util.Arrays;

import clase2.Punto;

public class OIA {
	private Punto[] lanzamiento;
	private int cantidad;	
	
	public OIA(Punto[] lanzamiento, int cantidad)
	{
		this.lanzamiento = lanzamiento;
		this.cantidad = cantidad;
	}
	
	public double radio()
	{
		Arrays.sort(lanzamiento);
		int betterResult = -1, maxPts = 0, puntos = 0;
		
		for(int i=0; i<this.cantidad; i++)
		{
			puntos += this.lanzamiento[i].obtenerX()>0?1:-1;
			if(maxPts < puntos)
			{
				maxPts = puntos;
				betterResult = i;
			}
		}
		return (betterResult>0)?Math.pow(this.lanzamiento[betterResult].distanciaAlOrigen(), 2):0;
	}
}


/*
9-6-12-2-12-10-9-9-13-10
*/