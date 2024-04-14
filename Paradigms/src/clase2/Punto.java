package clase2;

import java.util.Objects;

public class Punto {
	//Atributes
	private double x = 0;
	private double y = 0;
	
	//methods
	public boolean estaSobreEjeX() { return this.y == 0; } 
	public boolean estaSobreEjeY() { return this.x == 0; }
	
	public boolean esElOrigen() 
	{
		return this.estaSobreEjeX() && this.estaSobreEjeY();
	}
	
	public double distanciaAlOrigen() 
	{ 
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
	public double distanciaAotroPunto(Punto otro)
	{
		return Math.sqrt(Math.pow(this.x-otro.x, 2)+Math.pow(this.y-otro.y, 2));
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
}
