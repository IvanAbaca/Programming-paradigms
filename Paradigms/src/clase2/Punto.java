package clase2;

import java.util.Objects;

public class Punto implements Comparable<Punto>{
	//Atributes
	private double x = 0;
	private double y = 0;
	
	//constructor
	public Punto()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	//methods
	public boolean estaSobreEjeX() { return this.y == 0; } 
	public boolean estaSobreEjeY() { return this.x == 0; }
	
	public boolean esElOrigen() 
	{
		return this.estaSobreEjeX() && this.estaSobreEjeY();
	}
	
	public Double distanciaAlOrigen() 
	{ 
		return Math.hypot(x, y);
	}
	
	public double distanciaAotroPunto(Punto otro)
	{
		return Math.hypot(x-otro.x, y-otro.y);
	}
	
	//Getters and setters
	public double obtenerX() { return this.x; }
	public double obtenerY() { return this.y; }
	public void cambiarX(double nuevoX) { this.x = nuevoX; }
	public void cambiarY(double nuevoY) { this.y = nuevoY; }
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	@Override
	public int compareTo(Punto o) {
		int cmp = this.distanciaAlOrigen().compareTo(o.distanciaAlOrigen());
		return cmp!=0?cmp:this.x>=o.x?1:-1;
	}
	
	
}
