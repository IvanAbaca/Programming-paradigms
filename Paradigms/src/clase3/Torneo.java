package clase3;

public class Torneo {
	//Atributes
	private Luchador[] Luchadores;
	private int actual = 0;
	
	//Constructor
	public Torneo(int cantLuchadores)
	{
		this.Luchadores = new Luchador [cantLuchadores];
	}
	
	public Torneo(Luchador[] Luchadores)
	{
		this.Luchadores = Luchadores;
		this.actual = Luchadores.length;
	}
	
	//Getter
	public Luchador[] getLuchadores() { return this.Luchadores; }
	
	//Method
	public void agregarLuchador(Luchador l)
	{
		this.Luchadores[actual++] = l;
	}
	
	public int[] calcularDominios()
	{
		int[] dominios = new int[this.Luchadores.length];
		
		for(int i=0; i<this.Luchadores.length; i++)
			for(int j=i+1; j<Luchadores.length; j++)
			{
				if(Luchadores[i].domina(Luchadores[j]))
					dominios[i]++;
				if(Luchadores[j].domina(Luchadores[i]))
					dominios[j]++;
			}
		
		return dominios;
	}
	
}

