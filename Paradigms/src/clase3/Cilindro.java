package clase3;

import clase2.Circulo;

public class Cilindro {
	private Circulo tapa;
	private double altura;
	
	public Cilindro(double rad, double alt)
	{
		this.tapa = new Circulo(rad);
		this.altura = alt;
	}
	
	public double area()
	{
		return tapa.obtenerPerimetro()*this.altura + tapa.obtenerArea()*2;
	}
	
	public double volumen()
	{
		return tapa.obtenerArea()*this.altura;
	}
}
