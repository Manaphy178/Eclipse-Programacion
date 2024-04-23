package Ejer2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces = 0;
		int vuelta = 5;
		int num = 0;
		for (int i = 5; veces < i; i--) {

			for (int x = vuelta; x < i; x++) {
				System.out.print(" ");

			}
			System.out.print("*");
			for (int y = 8; num < y; y--) {
				System.out.print("*");
			}
			System.out.println("");
			num += 2;
			vuelta -= 2;

		}
	}

}
