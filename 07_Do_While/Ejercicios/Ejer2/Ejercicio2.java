package Ejer2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces = 0;
		for (int i = 5; veces < i; i--) {
			System.out.print("*");
			for (int x = 5; x > i; x--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
