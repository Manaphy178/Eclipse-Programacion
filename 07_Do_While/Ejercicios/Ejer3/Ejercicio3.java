package Ejer3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		boolean primo = true;
		int num = 0;

		for (int i = 2; i <= 3500; i++) {
			primo = true;
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					primo = false;
					break;
				}
			}
			if (primo == true) {
				System.out.println(i);
				System.out.println("Introduce un numero");
				num = sn.nextInt();
				for (int y = 1; y <= num; y++) {
					System.out.print(y + " ");
				}
				System.out.println();
			}
		}
	}
}
