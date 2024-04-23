package Ejer1;

public class ejercicio01 {

	public static void main(String[] args) {
		int[][] numeros = new int[5][4];
		int num = 1;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = num;
				num++;
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
