package clase6;

import clase6.MyRunTimeException;

public class Excepciones {
	
	//Ejercicio 01: Escribir una función que calcule la división de dos números enteros, 
	//pero que lance una excepción del tipo ArithmeticException si el segundo número es cero.
	public static double division(int[] lista, int posNumerador, int posDenominador) {
		try
		{
			double result = lista[posNumerador] / lista[posDenominador];
			return result;
		}
		catch (ArithmeticException e){
			System.out.println("No se puede dividir un numero por 0.");
			return 0;
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("No existe esa posicion en el array");
			return 0;
		}
	}
	
	//Ejercicio 02: Definir su propia excepción y utilizarla en un programa que posea una función 
	//que lance dicha excepción si se intenta calcular la raiz cuadrada de un número negativo. 
	//Esta excepción deberá extender de Exception en forma directa.
	public static double raiz(int num) throws Exception{
		if(num<0)
			throw new MyException("No se puede sacar la raiz de un numero negativo.");
		double result = Math.sqrt(num);
		return result;
	}
	
	//Ejercicio 03: Escribir un programa que calcule el cociente de dos números enteros, pero que 
	//lance una excepción propia de tiempo de ejecución si el segundo número es cero. 
	//¿Necesita ser anunciada? (throws) - Tip: Deberá extender de RuntimeException.
	public static double divisionExcProp(int numerador, int denominador) {
		if(denominador<0)
			throw new MyRunTimeException("");
		return numerador/denominador; //No requiere declararse el throws porque es propiedad de los RuntimeExceptions
	}
	
	
	
	//Main
	public static void main(String[] args) {
		//Ejercicio1
		int[] lista = new int[2];
		lista[0] = 0;
		lista[1] = 10;
		System.out.println(Excepciones.division(lista, 1, 0));
		//Ejercicio2
		try { System.out.println(Excepciones.raiz(-10)); } //Te obliga a controlarlo porque es Exception
		catch(Exception e) { System.out.println(e.getMessage()); }
		//Ejercicio3
		Excepciones.divisionExcProp(10, 0); //No te obliga controlarlo para compilar porque es RuntimeException
		
	}
}
