package ClaseAbstractaDos;

import javax.swing.JOptionPane;
import ClaseAbstracta.Persona;


public class Profesor extends Persona {
	
	private String escalafon;
	private String areadeinvestigacion;
	private String tipodecontrato;
	
	public Profesor(String escalafon, String areadeinvestigacion, String tipodecontrato,String nombre, String apellido, int edad) {
		super(nombre,apellido,edad);
		this.escalafon = escalafon;
		this.areadeinvestigacion = areadeinvestigacion;
		this.tipodecontrato = tipodecontrato;
	}

	public String getEscalafon() {
		return escalafon;
	}

	public void setEscalafon(String escalafon) {
		this.escalafon = escalafon;
	}

	public String getAreadeinvestigacion() {
		return areadeinvestigacion;
	}

	public void setAreadeinvestigacion(String areadeinvestigacion) {
		this.areadeinvestigacion = areadeinvestigacion;
	}

	public String getTipodecontrato() {
		return tipodecontrato;
	}

	public void setTipodecontrato(String tipodecontrato) {
		this.tipodecontrato = tipodecontrato;
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
		   +"\n Carrera: "+this.escalafon
		   +"\n Facultad: "+this.areadeinvestigacion
		   +"\n Universidad: "+this.tipodecontrato
		   ,"Datos del Profesor",JOptionPane.PLAIN_MESSAGE);
		
	}
	
	
	

}
