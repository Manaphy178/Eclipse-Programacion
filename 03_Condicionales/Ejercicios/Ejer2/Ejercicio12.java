package Ejer2;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.print("Dime un número: ");
		num = sn.nextInt();
		System.out.print("Dime segundo número: ");
		num2 = sn.nextInt();
		System.out.print("Dime tercer número: ");
		num3 = sn.nextInt();
		if (num > num2) {
			if (num2 > num3) {
				// System.out.println("Primera consulta");
				System.out.println(num + "," + num2 + "," + num3);
			} else if (num2 < num3) {
				// System.out.println("Segunda consulta");
				System.out.println(num + "," + num3 + "," + num2);
			}
		}
		if ((num2 > num) && (num2 > num3)) {
			if (num > num3) {
				// System.out.println("Tercera consulta");
				System.out.println(num2 + "," + num + "," + num3);
			} else if (num < num3) {
				// System.out.println("Cuarta consulta");
				System.out.println(num2 + "," + num3 + "," + num);
			}
		}
		if ((num3 > num) && (num3 > num2)) {
			if (num > num2) {
				// System.out.println("Quinta consulta");
				System.out.println(num3 + "," + num + "," + num2);
			} else if (num < num2) {
				// System.out.println("Sexta consulta");
				System.out.println(num3 + "," + num2 + "," + num);
			}
		}
	}
}
