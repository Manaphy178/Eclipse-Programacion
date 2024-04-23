package Ejer2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces = 5;
		int vuelta = 5;
		int num = 0;
		for (int i = 0; veces > i; i++) {

			for (int x = vuelta; x > i; x--) {
				System.out.print(" ");

			}
			System.out.print("*");
			for (int y = 0; num > y; y++) {
				System.out.print("*");
			}
			System.out.println("");
			num += 2;

		}
	}

}
