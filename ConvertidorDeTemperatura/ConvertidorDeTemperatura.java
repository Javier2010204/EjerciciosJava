/********************************************
	* ConvertidorDeTemperatura.java
	* Javier Santa Cruz
	* Este programa convierte temperaturas
	  de grados Fahrenheit a Celsius
*********************************************/

public class ConvertidorDeTemperatura{
	public static void main(String args[]){

		final double PUNTO_CONGELACION = 32.0;
		final double FACTOR_DE_CONVERCION = 5.0/9.0;
		double fahrenheit = 50; //temperatura en Farenheit
		double celsius; //temperatura en Celsius

		celsius = FACTOR_DE_CONVERCION * (fahrenheit - PUNTO_CONGELACION);

		System.out.println(fahrenheit + " grados Farenheit = " + celsius + " grados Celsius");
	} //fin del main
} // fin clase ConvertidorDeTemperatura