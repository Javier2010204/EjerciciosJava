import java.util.Scanner;
import java.io.File;

public class Archivo{


	public void lecturaTxt(){

		Scanner archivo = null;

		try{
			archivo = new Scanner(new File("numeros.txt"));
		}catch(Exception e){
			System.out.println("No pudimos encontrar el archivo");
		}

		int num=0;
		int count=0;

		while(archivo.hasNext()){
			num = archivo.nextInt();
			count = count + num;
			System.out.println(" " + num);
		}

		System.out.println();
		System.out.println("La suma de los numeros es " + count);
	}
}