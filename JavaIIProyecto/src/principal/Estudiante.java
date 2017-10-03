package principal;
/**
 * 
 * @author hellmuthtp
 * Proyecto
 * 
 */
public class Estudiante {
	
	/**
	 * @autor Hellmuth Trejo
	 * 
	 * Declaracion de los atributos. de la clase estudiante
	 */
	private String nombre;
	private String apellido;
	private int edad;
	private float sumaNotaDefinitiva,NotaDefinitiva;
	private float notas[]=new float[3];
	
	/**
	 * @autor Hellmuth Trejo
	 * 
	 * @param nombre 
	 * @param apellido
	 * @param edad
	 * @param notas Vector con las notas de tres
	 */
	
	public Estudiante(String nombre, String apellido, int edad, float notas[]){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.notas = notas;
	}
	
	/**
	 * 
	 * Métodos Get y Set de los Atributos de la clase Estudiante
	 * 
	 */
	
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

	public float getNotaDefinitiva() {
		return NotaDefinitiva;
	}

	public void setNotaDefinitiva(int notaDefinitiva) {
		NotaDefinitiva = notaDefinitiva;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	
	/**
	 * 
	 * @param notas se pasa como parametro a la accion para el calculo del promedio. 
	 * 
	 * Accion que calcula el promedio.
	 */
	public void NotaDefinitiva(float notas[]){
		
		for (int i = 0; i < notas.length; i++) {
			sumaNotaDefinitiva = sumaNotaDefinitiva+ notas[i];
			NotaDefinitiva = sumaNotaDefinitiva/3;
			
		}
		System.out.println("El promedio de las notas es: "+NotaDefinitiva);
		
	}
	
	
}
