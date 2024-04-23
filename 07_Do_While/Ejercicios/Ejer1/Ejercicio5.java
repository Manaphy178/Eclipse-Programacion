package Ejer1;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int n = 1;
		boolean primo = false;
		int num = 0;

		System.out.println("Dime un número y te digo cuales son primos");
		num = sn.nextInt();
		do {
			primo = true;

			if (n % 2 == 0) {
				primo = false;
			}

			for (int i = 3; i * i <= n; i += 2) {

				if (n % i == 0) {
					primo = false;
				}

			}
			if (primo == true) {

				System.out.println(n + " es primo");
			}

			n++;
		} while (n <= num);
	}

}
