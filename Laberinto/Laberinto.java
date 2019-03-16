public class Laberinto{
	public static void main(String args[]){

		String[][] laberinto = new String[10][10];

		for(int i=0; i < 100; i++){
			laberinto[i][i] = "#";
			System.out.println(laberinto[i][i]);
		}


	}
}