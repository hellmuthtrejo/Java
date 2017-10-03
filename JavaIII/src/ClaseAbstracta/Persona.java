package ClaseAbstracta;
/**
 * 
 * @author Hellmuth
 * 
 * Para hacer una clase abstracta se coloca la palabra abstract ante de class.
 * 
 * y se debe declarar un metodo abstracto.
 */
public abstract class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * se declara un metodo abstracto de la siguiente manera.
	 */
	public abstract void informacion();
	

}
