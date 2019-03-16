/***********************************************************
* SecuenciasDeEscape.java
* Javier Santa Cruz
* Programa para utilizar diferentes secuencias de escape
***********************************************************/

public class SecuenciasDeEscape{
	public static void main(String args[]){

		/*
			\t mover el cursor al siguiente tabulador
			\n salto de línea: avanza a la primera columna en el siguiente renglón \r avanza a la primera columna en el renglón actual
			\" imprime una literal que utiliza comilla doble
			\' imprime una literal con comilla sencilla
			\\ imprime una diagonal invertida
		*/

		System.out.println("Hola" + '\r' + "Mundo" + '\n');
		System.out.println("-------");

		

	}
}