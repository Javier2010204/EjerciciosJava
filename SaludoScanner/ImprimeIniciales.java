/**********************************************************
	* ImprimeIniciales.java
	* Javier Santa Cruz
	* Este programa imprime las iniciales del nombre 
	  ingresado
**********************************************************/

import java.util.Scanner;

public class ImprimeIniciales{
	public static void main(String args[]){

		Scanner scanner = new Scanner(System.in);
		String nombre, apellido;

		System.out.println("Ingresa tu primer nombre");
		nombre = scanner.next();
		System.out.println("Ingresa tu primer apellido");
		apellido = scanner.next();
		System.out.println("Tus iniciales son: " + nombre.charAt(0) + apellido.charAt(0) );

	}
}