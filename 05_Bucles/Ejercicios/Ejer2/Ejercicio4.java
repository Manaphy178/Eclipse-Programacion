package Ejer2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);

		int num = 0;
		int ran = (int) (Math.random() * 100);
		boolean si = false;
		while (si == false) {
			System.out.println("Intenta adivinar el numero secreto");
			num = sn.nextInt();
			if (num != ran && num != -1) {
				if (num > ran) {
					System.out.println("El numero secreto es menor");
				} else if (num < ran) {
					System.out.println("El numero secreto es mayor");
				}
			} else if (num == -1) {
				System.out.println("Te has rendido, el numero aleatorio era: " + ran);
				si = true;
			} else if (num == ran) {
				System.out.println("HAS ACERTADO EL NUMERO ALEATORIO");
				si = true;
			}

		}

	}

}
