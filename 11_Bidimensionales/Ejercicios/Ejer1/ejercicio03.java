package Ejer1;

public class ejercicio03 {

	public static void main(String[] args) {
		String[][] nombre = new String[4][4];

		for (int i = 0; i < nombre.length; i++) {
			for (int j = 0; j < nombre[i].length; j++) {
				nombre[i][j] = "Javier";
			}
		}
		for (int i = 0; i < nombre.length; i++) {
			for (int j = 0; j < nombre[i].length; j++) {
				System.out.print(nombre[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
