package Ejer2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces = 5;
		for (int i = 0; veces > i; i++) {
			System.out.print("*");
			for (int x = 0; x < i; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}