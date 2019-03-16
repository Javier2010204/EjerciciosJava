/***********************************************************
* PruebaDeOperadores.java
* Javier Santa Cruz
* Programa para probar operadores compuestos con java
***********************************************************/

public class PruebaDeOperadores{
	public static void main(String args[]){

		int x;
		int y = 2;
		double z = 3.0;

		x = 5;

		System.out.println("x + y + z = " + (x + y + z));
		// Uso de operadores compuestos
		x += y;
		y++; // y = 3
		z--; // z = 2.0

		z *= x;

		System.out.println("x + y + z = " + (x + y + z));
	}// fin del main
}// fin de la clase PruebaDeOperadores