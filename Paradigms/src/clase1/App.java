package clase1;

class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0;
		int[][] mat = 	{{1,2,3},{4,5,6},{7,8,9}};
		int[][] matE1 = {{1,2,3},{4,1,6},{7,8,2}};		
		int[][] matE2 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matE4 = {{1,2,3,4},{5,-6,-6,20},{1,1,10,10}};
		int[] vec = new int[matE4.length];

		String ej1 = ejercicioUno(matE1)?"Verdadero":"Falso";
		String ej2 = ejercicioDoss(mat)?"Igual a 0":"Distinto a 0";
		ejercicioTres(matE2, mat);
		ejercicioCuatro(matE4, vec);

		System.out.println("Ejercicio 1: " + ej1);
		System.out.println("Ejercicio 2: " + ej2);
		System.out.println("Ejercicio 3:");
		//Mostrar matriz transformada del ejercicio 3
		for(i=0; i<3; i++)
		{
			for(j=0; j<3; j++)
				System.out.print(matE2[i][j] + " ");				
			System.out.println();
		}
		
		System.out.println("Ejercicio 4:");
		for(i=0; i<vec.length; i++)
			System.out.print(vec[i] + " ");
		System.out.println();
		
		System.out.println("Ejercicio 5:");
		ejercicioCinco(mat);
	}

	/**
	 * <p>Método en Java que permite comprobar si la diagonal principal de una 
	 * matriz cuadrada de enteros tiene en cada posición un valor igual a la suma de todos 
	 * los valores de las posiciones anteriores de dicha diagonal.<p>
	 * @param mat Matriz
	 * @param filas Cantidad de filas
	 * @param colum Cantidad de columnas
	 * @return true si verifica, false si no verifica
	 */
	
	static boolean ejercicioUno(int[][] mat)
	{
	    int acum = 0;
	    int filas = mat.length;
	    
	    boolean condition = true;
	    
	    for(int i=1; i<filas && condition; i++)
        {
            acum += mat[i-1][i-1];
            if(acum != mat[i][i])
                condition = false;
        }
	    
	    return condition;
	}
	/**
	 * <p>Método en Java que permite comprobar si la multiplicación de todos los 
	 * valores de una matriz numérica, dará 0 o no.<p>
	 * @param mat Matriz
	 * @param filas Cantidad de filas
	 * @param colum Cantidad de columnas
	 * @return false si da distinto a 0, true si da igual a 0
	 */
	static boolean ejercicioDoss(int[][] mat)
	{
	    int filas = mat.length;
	    int colum = mat[0].length;

	    for(int i=1; i<filas; i++)
	        for(int j=1; j<colum; j++)
	            if(mat[i][j] == 0)
	                return true;
	    return false;
	}

	/**
	 * <p>Método en Java que de una matriz numérica dada, devuelve una matriz con la misma cantidad 
	 * de elementos, pero donde cada valor es la suma de sus adyacentes originales 
	 * (arriba, abajo, izquierda, y derecha; si existen)</p>
	 * 
	 * @param mat Matriz que va a ser cargada con los nuevos valores
	 * @param filas Cantidad de filas
	 * @param colum Cantidad de columnas
	 * @param matOrig Matriz que tiene los valores originales
	 */
	static void ejercicioTres(int[][] mat, int[][] matOrig)
	{
	    int filas = mat.length;
	    int colum = mat[0].length;

	    for(int i=0; i<filas; i++)
	        for(int j=0; j<colum; j++)
	        {
	            mat[i][j] += i-1>=0?    matOrig     [i-1][j]    :0; //Suma a la izquierda
	            mat[i][j] += i+1<colum? matOrig     [i+1][j]    :0; //Suma a la derecha
	            mat[i][j] += j-1>=0?    matOrig     [i]  [j-1]  :0; //Suma arriba
	            mat[i][j] += j+1<filas? matOrig     [i]  [j+1]  :0; //Suma abajo
	        }
	}
	
/**
 * <p>Método en Java que de una matriz numérica dada, devuelve un vector con n elementos,donde 
 * cada elemento es la moda de una fila. Si hubiese más de una moda, se deberá utilizar la 
 * de mayor valor<p>
 * @param matriz Matriz
 * @param vec Vector de modas
 */
    static void ejercicioCuatro(int [][] matriz, int [] vec) // Si no hay moda, siempre el mayor valor, y si hay la misma cantidad de modas, la de mayor valor tambien.
    {
        t_moda [] vec_moda = new t_moda[matriz[0].length];
        t_moda max_moda = new t_moda();
        
        int filas = matriz.length;
        int columnas = matriz[0].length;

    
        for(int i = 0; i < filas; i++)
        {
            for(int l = 0; l < columnas; l++)
                vec_moda[l] = new t_moda();
            
            for(int j = 0; j < columnas; j++)
            {
                for(int k = 0; k <= j; k++)
                {
                    if(vec_moda[k].apariciones != 0)
                    {
                        if(vec_moda[k].numero == matriz[i][j])
                            vec_moda[k].apariciones += 1;
                    }        
                    else
                    {
                        vec_moda[k].numero = matriz[i][j];
                        vec_moda[k].apariciones += 1;
                    }
                }
            }
            
            for(int cont = 0; cont < columnas; cont++)
            {
                if(vec_moda[cont].apariciones > max_moda.apariciones)
                {
                    max_moda.numero = vec_moda[cont].numero;
                    max_moda.apariciones = vec_moda[cont].apariciones;
                }
                
                if(vec_moda[cont].apariciones == max_moda.apariciones && vec_moda[cont].numero > max_moda.numero)
                {
                    max_moda.numero = vec_moda[cont].numero;
                    max_moda.apariciones = vec_moda[cont].apariciones;
                }
            }
            
            vec[i] = max_moda.numero;
        }
    }
	
	/**
	 * <p>Método de Java que de una matriz cuadrada dada de dimensión nxn, devuelve una matriz con 
	 * 2n-1 filas, donde cada una tendrá los datos de una de las diagonales 
	 * (de abajo a la izquierda hacia arriba a la derecha)<p>
	 * @param mat Matriz
	 * @param filas Cantidad de filas
	 */
	static void ejercicioCinco(int[][] mat)
	{
	    int filas = mat.length;
	    
	    for(int i=filas-1; i>0; i--)
	    {
	    	for(int j=0; j<filas-i; j++)
	    		System.out.print(mat[i+j][j] + " ");
	    	System.out.println();
	    }
	    
	    for(int i=0; i<filas; i++)
	    {	    	
		    for(int j=0; j<filas-i; j++)
	    		System.out.print(mat[j][j+i] + " ");
		    System.out.println();
	    }
	}
}
