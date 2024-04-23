package Ejer1;

public class ejercicio02 {

	public static void main(String[] args) {
		int[][] numeros = new int[8][8];
		int num = 99;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = num;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
