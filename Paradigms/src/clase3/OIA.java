package clase3;

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
		sort();
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
	
	private void sort() {
	    Punto aux;

	    for (int i = 0; i < cantidad - 1; i++) {
	        int menor = i;
	        for (int j = i + 1; j < cantidad; j++) {
	            if 
	            (	
	            	 this.lanzamiento[j].distanciaAlOrigen() < this.lanzamiento[menor].distanciaAlOrigen() ||
	            	(this.lanzamiento[j].distanciaAlOrigen() == this.lanzamiento[menor].distanciaAlOrigen() &&
	            	 this.lanzamiento[j].obtenerX() < this.lanzamiento[menor].obtenerX())
	            )   menor = j;
	        }
	        aux = this.lanzamiento[i];
	        this.lanzamiento[i] = this.lanzamiento[menor];
	        this.lanzamiento[menor] = aux;
	    }
	}
}


/*
9-6-12-2-12-10-9-9-13-10
*/