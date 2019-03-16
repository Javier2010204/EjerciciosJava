/**********************************************************
	* SaludoScanner.java
	* Javier Santa Cruz
	* Este programa utiliza Scanner para recibir datos
	  del usuario
**********************************************************/

import java.util.Scanner; // importacion de libreria para utilizar Scanner


public class SaludoScanner{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in); //intancia de objeto tipo Scanner
		String nombre;
		int edad;

		System.out.println("Introduce tu nombre");
		nombre = scanner.nextLine(); // recibe datos del usuario
		System.out.println("Hola " + nombre + " !!!");

		System.out.println("Introduce tu edad");
		edad = scanner.nextInt();
		if(edad >= 18){
			System.out.println(nombre + " eres mayor de edad");
		}else{
			System.out.println(nombre + " eres menor de edad");
		}

	} // fin del metodo main
} // fin de la clase SaludoScanner