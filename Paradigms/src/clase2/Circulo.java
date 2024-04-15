package clase2;

public class Circulo {
	//atributes
	private double radio = 0;
	
	//constructor
	public Circulo(double r)
	{
		this.radio = r;
	}
	
	//getters
	public double obtenerRadio() { return this.radio; }
	public double obtenerDiametro(){ return this.radio*2; }
	public double obtenerPerimetro() { return 2*Math.PI*this.radio;}
	public double obtenerArea() { return Math.PI*Math.pow(this.radio, 2);}
	
	//setters
	public void cambiarRadio(double radio) { this.radio = radio; }
	public void cambiarDiametro(double diametro) { this.radio = diametro/2; }
	public void cambiarPerimetro(double perimetro) { this.radio = perimetro/(2*Math.PI); }
	public void cambiarArea(double area) { this.radio = Math.sqrt(area/Math.PI); }
}
