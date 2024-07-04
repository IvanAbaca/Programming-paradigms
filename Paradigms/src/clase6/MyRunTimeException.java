package clase6;

public class MyRunTimeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyRunTimeException() {
		super();
	}
	
	public MyRunTimeException(String msj) {
		super("MyRuntimeException: " + msj);
	}
	
	
	
}
