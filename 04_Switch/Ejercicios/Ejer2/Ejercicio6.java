package Ejer2;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;


		System.out.println("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num2 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num3 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num4 = sn.nextInt();

		int max = Math.max(num1, Math.max(num2, Math.max(num3, num4)));
		int min = Math.min(num1, Math.min(num2, Math.min(num3, num4)));
		if ((num1 == max || num1 == min) && (num2 == max || num2 == min)) {
			System.out.println(num3 + ", " + num4);
		} else if ((num1 == max || num1 == min) && (num3 == max || num3 == min)) {
			System.out.println(num2 + ", " + num4);
		} else if ((num1 == max || num1 == min) && (num4 == max || num4 == min)) {
			System.out.println(num2 + ", " + num3);
		} else if ((num1 == max || num1 == min) && (num2 == max || num2 == min)) {
			System.out.println(num1 + ", " + num3);
		} else if ((num2 == max || num2 == min) && (num3 == max || num3 == min)) {
			System.out.println(num1 + ", " + num4);
		} else if ((num2 == max || num2 == min) && (num4 == max || num4 == min)) {
			System.out.println(num1 + ", " + num3);
		}
	}
}
