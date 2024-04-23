package Ejer1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		int cont = 0;
		boolean punto = false;
		System.out.print("Dime un numero: ");
		num = sn.nextInt();
		System.out.print("Dime otro numero: ");
		num2 = sn.nextInt();
		if (num > num2) {
			while (num2 <= num) {
				if (num == num2 && cont != 1) {
					punto = true;
					cont++;
				}
				if (num2 % 2 != 0) {
					System.out.print(num2);
				}
				if (punto == true) {
					System.out.print(".");
				} else if (num2 % 2 == 0) {
					System.out.print(", ");
				}
				num2++;
			}
		} else if (num2 > num) {
			while (num <= num2) {
				if (num == num2 && cont != 1) {
					punto = true;
					cont++;
				}
				if (num % 2 != 0) {
					System.out.print(num);
				}
				if (punto == true) {
					System.out.print(".");
				} else if (num % 2 == 0) {
					System.out.print(", ");
				}
				num++;
			}
		}
	}
}
