package clase3;

public class Luchador {
	//Atributes
	private double peso;
	private double altura;
	
	//Constructor
	public Luchador(double peso, double altura)
	{
		this.peso = peso;
		this.altura = altura;
	}
	
	//Methods
	public boolean domina(Luchador l)
	{
		return ((this.peso > l.peso  && this.altura > l.altura) || 
				(this.peso == l.peso && this.altura > l.altura) || 
				(this.peso > l.peso && this.altura == l.altura));
	}
}
