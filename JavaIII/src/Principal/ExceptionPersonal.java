package Principal;

public class ExceptionPersonal extends Exception {

	public ExceptionPersonal (String msj) {
		super(msj);
	}
	
	public void MensajeError() {
		System.out.println("Hay un error con la edad");
	}
}
