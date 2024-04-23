package Ejemplos;

public class EjemplosBidimensionales {

	public static void main(String[] args) {
		int[][] numeros = new int[5][5];
		int numero=1;
		int mult=2;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j]=numero*mult;
				numero++;
			}
			mult++;
			numero=1;
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j]+" - ");
			}
			System.out.println();
		}
		
	}

}
