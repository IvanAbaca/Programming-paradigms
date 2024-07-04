package clase5;

import java.util.Arrays;

public class Complejo implements Comparable<Complejo>{
	
	public static void main(String[] args) {
		Complejo c1 = new Complejo(1,1);
		Complejo c2 = new Complejo(2,2);
		Complejo c3 = new Complejo(-5,-5);

		Complejo [] cs = {c1, c2, c3, new Complejo(3,0), Complejo.ZERO};

		Arrays.sort(cs);
		System.out.println(Arrays.toString(cs));
	}	
	
	private double real;
	private double imaginario;
	public static final Complejo ZERO = new Complejo(0,0);
	
	public Complejo(double real, double imaginario)
	{
		this.real = real;
		this.imaginario = imaginario;
	}
	
	@Override
	public int compareTo(Complejo o) {
		return this.modulo().compareTo(o.modulo());
	}
	
	//getters & setters
	public double getReal() {
		return real;
	}

	public double getImaginario() {
		return imaginario;
	}
	
	public void sumar(Complejo otro)
	{
		this.real = otro.real;
		this.imaginario = otro.imaginario;
	}
	
	public static Complejo parse(double real)
	{
		return new Complejo(real, 0);
	}
	
	public static Complejo sumar(Complejo c1, Complejo c2)
	{
		return new Complejo(c1.real + c2.real, c1.imaginario + c2.imaginario);
	}
	
	public Double modulo()
	{
		return Math.hypot(real, imaginario);
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Real= " + real + " Imaginario= " + imaginario+"i";
	}
	
	@Override
	protected Object clone() {
		// TODO Auto-generated method stub
		return new Complejo(this.real, this.imaginario);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(imaginario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(real);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imaginario))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}	
}
