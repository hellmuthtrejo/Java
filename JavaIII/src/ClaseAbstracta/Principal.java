package ClaseAbstracta;

import javax.swing.JOptionPane;

import ClaseAbstractaDos.Profesor;

import java.awt.JobAttributes;
import java.text.Format;
import java.util.Scanner;

/**
 * 
 * @author PRINCIPAL
 * 
 *Captura de datos• showInputDialog– Ejemplo String x= JOptionPane.showInputDialog 
 *(null,"Ingresa el valor","Soy eltitulo",JOptionPane.QUESTION_MESSAGE);-p1: indica 
 *el frame al cual esta asociado, por defecto null.-p2:Es la etiqueta de la caja de 
 *texto.-p3:El titulo de la ventana.-p4:La imagen que acompaña la ventana de dialogo. 
 *Puedetomar los siguientes valores. ERROR_MESSAGE INFORMATION_MESSAGE PLAIN_MESSAGE QUESTION_MESSAGE WARNING_MESSAGE
 */


public class Principal {

	public static void main(String[] args) {
		
		String edadcap,nombre=null,apellido=null,carrera=null,facultad=null,universidad=null,dia=null;
		String escalafon=null,areadeinvestigacion=null;
		int edad=0,respuesta;
		
		
		do {
			respuesta=JOptionPane.showConfirmDialog(null,"Desea Insertar los Datos de una Persona?","Pregunta",JOptionPane.YES_NO_OPTION);
			if(respuesta==JOptionPane.YES_OPTION) {
				
				String [] EleccionPersona= {"Profesor","Estudiante"};
				String CapturaPersona;
				CapturaPersona=(String)JOptionPane.showInputDialog(null,"Que día seleccionara","Día a procesar",JOptionPane.PLAIN_MESSAGE,null,EleccionPersona,EleccionPersona[0]);
				
				switch(CapturaPersona) {
				case "Profesor":
					nombre=JOptionPane.showInputDialog(null,"ingrese el Nombre del Profesor","Información de Profesor",JOptionPane.PLAIN_MESSAGE);
					apellido=JOptionPane.showInputDialog(null,"Ingrese el Apellido del Profesor","Información de Profesor",JOptionPane.PLAIN_MESSAGE);
					edad=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la Edad del Profesor","Información de Profesor",JOptionPane.PLAIN_MESSAGE));
					escalafon=JOptionPane.showInputDialog(null,"ingrese el Escalafon del Profesor","Información de Profesor",JOptionPane.PLAIN_MESSAGE);
					areadeinvestigacion=JOptionPane.showInputDialog(null,"ingrese el Area de Investigación del Profesor","Información de Profesor",JOptionPane.PLAIN_MESSAGE);
					String [] contrato= {"Indefinido","Trimestral","Semestral","Anual"};
					String tipodecontrato=null;
					tipodecontrato=(String)JOptionPane.showInputDialog(null,"Que Tipo de Contrato Tiene El profesor","Día a procesar",JOptionPane.PLAIN_MESSAGE,null,contrato,contrato[0]);
					Profesor profeuno = new Profesor(escalafon, areadeinvestigacion, tipodecontrato, nombre, apellido, edad);
					profeuno.informacion();
					break;
				case "Estudiante":
					String [] dias = {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};		
					String Captura;
					Captura=(String)JOptionPane.showInputDialog(null,"Que día seleccionara","Día a procesar",JOptionPane.PLAIN_MESSAGE,null,dias,dias[0]);

					nombre=JOptionPane.showInputDialog(null,"ingrese el Nombre del estudiante","Información de Estudiante",JOptionPane.PLAIN_MESSAGE);
					apellido=JOptionPane.showInputDialog(null,"Ingrese el Apellido del estudiante","Información de Estudiante",JOptionPane.PLAIN_MESSAGE);
					edad=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la Edad del estudiante","Información de Estudiante",JOptionPane.PLAIN_MESSAGE));
					carrera=JOptionPane.showInputDialog(null,"ingrese la Carrera del estudiante","Información de Estudiante",JOptionPane.PLAIN_MESSAGE);
					facultad=JOptionPane.showInputDialog(null,"ingrese la Facultad del estudiante","Información de Estudiante",JOptionPane.PLAIN_MESSAGE);
					universidad=JOptionPane.showInputDialog(null,"ingrese la Universidad del estudiante","Información de Estudiante",JOptionPane.PLAIN_MESSAGE);
					Estudiante estuno = new Estudiante(nombre, apellido, edad, carrera, facultad, universidad,Captura);
					estuno.informacion();
					break;
				}				
				
			}else {
				if(respuesta==JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null,"Gracias vuelve pronto negro MAMAGUEVO","Fin de la Aplicación",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}while(respuesta==JOptionPane.YES_OPTION);
		
		
		
	}

}
