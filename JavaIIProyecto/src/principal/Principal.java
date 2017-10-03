package principal;

/**
 * Libreria de Scanner
 */
import java.util.Scanner;

public class Principal {
	/**
	 * @autor Hellmuth Trejo
	 * 
	 * Declaracion del Scanner (privado) para capturar los datos ingresados por el usuario.
	 */
	private static Scanner scn;

	public static void main(String[] args) {
		/**
		 * @autor 
		 * 
		 * Declaracion e instanciacion de variables y objetos
		 * 
		 */
		scn = new Scanner(System.in);	
		String nombre=null;
		String apellido=null;
		int edad=0;
		float notas[] = new float[3];	   							
		Estudiante Est1 = new Estudiante(nombre, apellido, edad, notas); 
		Estudiante Est2 = new Estudiante(nombre, apellido, edad, notas); 
		Estudiante Est3 = new Estudiante(nombre, apellido, edad, notas); 
		
		/**
		 * @author Hellmuth Trejo
		 * 
		 * Ciclo for que permite la asignacion de datos a cada uno de los objetos.
		 *
		 */
		for (int i = 0; i < 3 ; i++) {
			System.out.println("Ingrese nombre del estudiante #"+(i+1)+" :");
			nombre = scn.next();
				if(i==0){
					Est1.setNombre(nombre);				
				}
				if(i==2){
					Est2.setNombre(nombre);				
				}
				if(i==1){
					Est3.setNombre(nombre);
				}
				
			
				System.out.println("Ingrese apellido del estudiante #"+(i+1)+" :");
				apellido = scn.next();
				if(i==0){
					Est1.setApellido(apellido);				
				}
				if(i==1){
					Est2.setApellido(apellido);					
				}
				if(i==2){
					Est3.setApellido(apellido);
				}
				
				System.out.println("Ingrese edad del estudiante #"+(i+1)+" :");
				edad = scn.nextInt();
				if(i==0){
					Est1.setEdad(edad);					
				}
				if(i==1){
					Est2.setEdad(edad);				
				}
				if(i==2){
					Est3.setEdad(edad);
				}
					/**
					 * @author Hellmuth Trejo 
					 * 
					 * Ciclo for anidado llena el array con las notas del estudiante.
					 * 			
					 */
				for (int j = 0; j < notas.length; j++) {
					System.out.println("Ingrese nota del lapso #"+(j+1)+" :");
					notas[j] = scn.nextInt();
					if(i==0){
						Est1.setNotas(notas);					
					}
					if(i==1){
						Est2.setNotas(notas);					
					}
					if(i==2){
						Est3.setNotas(notas);
					}
				}
		}
		
		/**
		 * @author Hellmuth Trejo
		 * 
		 * Invocacion de la accion NotaDefinitiva, que determina el promedio de las notas del estudiante.
		 */
		System.out.println("Estudiante #1:");
		System.out.println(" "+Est1.getNombre()+" "+Est1.getApellido()+" "+Est1.getEdad());
		Est1.NotaDefinitiva(notas);
		
		System.out.println("Estudiante #2:");
		System.out.println(" "+Est2.getNombre()+" "+Est2.getApellido()+" "+Est2.getEdad());
		Est2.NotaDefinitiva(notas);
		
		System.out.println("Estudiante #3:");
		System.out.println(" "+Est3.getNombre()+" "+Est3.getApellido()+" "+Est3.getEdad());
		Est3.NotaDefinitiva(notas);
		

	}

}
