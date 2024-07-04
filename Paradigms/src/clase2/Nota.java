package clase2;

public class Nota {
	
	//Atributes
	private int nota = 0;
	
	public void recuperar(int nuevoValor) 
	{
		this.nota = (nuevoValor <= 10 && nuevoValor >= 0 && nuevoValor>this.nota)? nuevoValor : this.nota; 
	}
	
	public int getNota() { return this.nota; }
}
