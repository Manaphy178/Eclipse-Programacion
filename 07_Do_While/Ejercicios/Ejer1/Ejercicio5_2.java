package Ejer1;

import java.util.*;

public class Ejercicio5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int num = 0;
		int cont = 0;
		boolean primo = true;
		System.out.println("Dime un número y te digo cuales son primos");
		num = sn.nextInt();
//		Ambos ejercicios de jorge 

//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				primo = false;
//				break;
//			}
//		}
//		if (primo == false) {
//			System.out.println("No es primo");
//		} else {
//			System.out.println("Es primo");
//		}
//		
		for (int i = 2; i <= num; i++) {
			primo = true;
			for (int x = 2; x < i; x++) {
				if (i % x == 0) {
					primo = false;
					break;
				}
			}
			if (primo == true) {
				cont++;
				;
			}
		}
		System.out.println("Entre 1 y " + num + " hay " + cont + " primos");
	}

}
