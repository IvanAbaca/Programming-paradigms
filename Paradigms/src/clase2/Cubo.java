package clase2;

public class Cubo {
	//Atributes
	private double lado;
	
	//Constructor
	public Cubo (double longitudLado) { this.lado = longitudLado; }
	
	//Getters
    public double obtenerLado() { return this.lado; }
    public double obtenerAreaCara() { return Math.pow(lado, 2); }
    public double obtenerVolumen() { return Math.pow(lado, 3); }
    
    //Setters
    public void cambiarLado(double longitudLado) { this.lado = longitudLado; }
    public void cambiarAreaCara(double areaCara) { this.lado = Math.sqrt(areaCara); }
    public void cambiarVolumen(double volumen) { this.lado = Math.cbrt(volumen); }
}