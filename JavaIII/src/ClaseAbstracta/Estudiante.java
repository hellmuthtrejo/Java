package ClaseAbstracta;

import javax.swing.JOptionPane;

public  class Estudiante extends Persona {
	private String carrera;
	private String facultad;
	private String universidad;
	private String dia;
	
	/**.
	 * 
	 * @param nombre <- heredado de la clase persona
	 * @param apellido <- heredado de la clase persona
	 * @param edad <- heredado de la clase persona
	 * @param carrera  <- Propio de la clase estudiante
	 * @param facultad <- Propio de la clase estudiante
	 * @param universidad <- Propio de la clase estudiante
	 */
	
	public Estudiante(String nombre, String apellido, int edad, String carrera, String facultad, String universidad,String dia) {
		super(nombre, apellido, edad);
		this.carrera = carrera;
		this.facultad = facultad;
		this.universidad = universidad;
		this.dia = dia;
	}
		
	/**
	 * 
	 * @return 
	 * 
	 * metodos get y set de los atributos de la clase estudiante.
	 */
	
	public String getCarrera() {
		return carrera;
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	public String getDia () {
		return dia;
	}
	
	public void setDia(String dia){
		this.dia = dia;
	}

	/**
	 * 
	 * implementacion del metodo abstracto de la clase persona.
	 * 
	 */
	
	
	public void informacion() {
		
		JOptionPane.showMessageDialog(null,"Informacion:"
		   +"\n Nombre: "+super.getNombre()
		   +"\n Apellido: "+super.getApellido()
		   +"\n Edad: "+super.getEdad()
		   +"\n Carrera: "+this.carrera
		   +"\n Facultad: "+this.facultad
		   +"\n Universidad: "+this.universidad
		   +"\n Día: "+this.dia,"Datos del Estudiante",JOptionPane.PLAIN_MESSAGE);
		
	}
	
	
}
