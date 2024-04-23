package Ejer5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int mayor, menor;
		int cont = 0;
		boolean primo = true;
		System.out.println("Dime un numero:");
		int num = sn.nextInt();
		System.out.println("Dime un numero");
		int num2 = sn.nextInt();
		if (num > num2) {
			mayor = num;
			menor = num2;
		} else {
			mayor = num2;
			menor = num;
		}
		for (int i = menor; i <= mayor; i++) {
			for (int x = 2; x <= mayor; x++) {
				primo = true;
				if (i % 2 == 0) {
					primo = false;
					break;
				}
			}
			if (primo == true) {
				cont++;
			}
		}
		System.out.println(cont + " primos");
	}
}
