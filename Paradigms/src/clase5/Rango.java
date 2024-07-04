package clase5;

public class Rango {
	//10. Un rango es inmutable: no puede modificarse una vez creado.
	private final double inf;
	private final double sup;
	private final TipoRango tipo;
	
	//2. Dado que tener un constructor tan complejo puede ser perjudicial, 
	//implementar cuatro métodos estáticos que permitan la creación de estas combinaciones.
	public static Rango aa(double inf, double sup) {
		return new Rango(inf, sup, TipoRango.AA);
	}

	public static Rango ac(double inf, double sup) {
		return new Rango(inf, sup, TipoRango.AC);
	}

	public static Rango ca(double inf, double sup) {
		return new Rango(inf, sup, TipoRango.CA);
	}

	public static Rango cc(double inf, double sup) {
		return new Rango(inf, sup, TipoRango.CC);
	}
	
	//3. Teniendo los métodos estáticos, será buena idea hacer el constructor privado, 
	//ya que sólamente se accederá a él por los métodos estáticos.
	private Rango(double inf, double sup, TipoRango tipo) {
		super();
		this.inf = inf;
		this.sup = sup;
		this.tipo = tipo;
	}
	
	//4. Se debe poder consultar si hay intersección entre dos rangos.
	public boolean seIntersectan(Rango otro)
	{
		if(this.inf > otro.sup)
			return false;
		if(this.sup < otro.inf)
			return false;
		return true;
	}
	
	
	public static Rango abarcador() {
		return new Rango(Double.MIN_VALUE, Double.MAX_VALUE, TipoRango.CC);
	}
	
	public Rango interseccion(Rango otro) {
		if(!this.seIntersectan(otro))
			return new Rango(0, 0, TipoRango.AA);
		
		double inf = this.inf<otro.inf?otro.inf:this.inf;
		double sup = this.sup>otro.sup?otro.sup:this.sup;
		TipoRango tipo;
		
		if(this.tipo == otro.tipo) {
			tipo = this.tipo;
			return null;
		}
		
		else if(this.tipo == TipoRango.AA) {
			tipo = TipoRango.AA;
		}
		
		else if(this.tipo == TipoRango.CC) {
			tipo = otro.tipo==TipoRango.CC?TipoRango.CC:otro.tipo;
		}
		
		else if(this.tipo == TipoRango.AC) {
			tipo = 	otro.tipo == TipoRango.AC || otro.tipo == TipoRango.CC? TipoRango.AC:
					otro.tipo == TipoRango.CA || otro.tipo == TipoRango.AA? TipoRango.AA:otro.tipo;
		}
		
		else { // this.tipo == CA
			tipo = 	otro.tipo == TipoRango.CA || otro.tipo == TipoRango.CC? TipoRango.CA:
					otro.tipo == TipoRango.AC || otro.tipo == TipoRango.AA? TipoRango.AA:otro.tipo;
		}
		
		return new Rango(inf, sup, tipo);
	}
}
