package Principal;

import java.util.Scanner;

/**
 * 
 * @author JavaIII
 *
 */

public class Principal {
	
	public static void EvaluarEdad(int edad) throws ExceptionPersonal {
		if (edad<0) {
			throw new ExceptionPersonal("Error la edad no puede ser negativa");
		}
	}
	
	public static void main(String[] args) {
		/**
		 * try = intentar
		 * cath = controlar
		 * finally = se ejecuta igual, se coloca despues de controlar la excepcion para continuar con el programa
		 * 
		 * excepciones personalizadas: excepciones que java no contempla.
		 * 
		 * throws= arrojar. mandar el error al catch
		 * throw = para instanciar el objeto
		 */
		String edad;
		int edadnumerica, array[] = new  int[5];
		Scanner scn = new Scanner(System.in);		
		
		
		
		try {
			array[4]=10;
			System.out.println("Por favor ingrese el numero que desea convertir a entero: ");
			edad = scn.next();
			
			edadnumerica = Integer.parseInt(edad);
			System.out.println("conversion hecha! : "+edadnumerica);
			EvaluarEdad(edadnumerica);
		}catch(ExceptionPersonal aa){
			System.out.println(aa.getMessage());
			aa.MensajeError();
		}catch (NumberFormatException a) {
			System.out.println("Disculpe debe ingresar solo numeros");	
		}catch(ArrayIndexOutOfBoundsException b){
			System.out.println("Disculpe el index no es el adecuado");
		}catch(Exception c){
			System.out.println("Error General");
		}finally {
			System.out.println("Esto se hace igual");
		}
		
				
		
		
	}

}
