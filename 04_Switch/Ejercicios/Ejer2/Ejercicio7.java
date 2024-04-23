package Ejer2;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		System.out.println("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num2 = sn.nextInt();
		System.out.println("Dime un numero: ");
		num3 = sn.nextInt();

		int max = Math.max(num1, Math.max(num2, num3));
		int min = Math.min(num1, Math.min(num2, num3));
		int mid = 0;
		int mas = 0;
		int menos = 0;
		if ((num1 == max) && (num3 == min)) {
			mid = num2;
			mas = max - mid;
			menos = mid - min;
			System.out.println("Para llegar al numero mayor necesita: " + mas);
			System.out.println("Para llegar al numero menor necesita: " + menos);
		}
		if ((num1 == max) && (num2 == min)) {
			mid = num3;
			mas = max - mid;
			menos = mid - min;
			System.out.println("Para llegar al numero mayor necesita: " + mas);
			System.out.println("Para llegar al numero menor necesita: " + menos);
		}
		if ((num3 == max) && (num1 == min)) {
			mid = num2;
			mas = max - mid;
			menos = mid - min;
			System.out.println("Para llegar al numero mayor necesita: " + mas);
			System.out.println("Para llegar al numero menor necesita: " + menos);
		}
		if ((num2 == max) && (num1 == min)) {
			mid = num3;
			mas = max - mid;
			menos = mid - min;
			System.out.println("Para llegar al numero mayor necesita: " + mas);
			System.out.println("Para llegar al numero menor necesita: " + menos);
		}
		if ((num2 == max) && (num3 == min)) {
			mid = num1;
			mas = max - mid;
			menos = mid - min;
			System.out.println("Para llegar al numero mayor necesita: " + mas);
			System.out.println("Para llegar al numero menor necesita: " + menos);
		}
		if ((num3 == max) && (num2 == min)) {
			mid = num1;
			mas = max - mid;
			menos = mid - min;
			System.out.println("Para llegar al numero mayor necesita: " + mas);
			System.out.println("Para llegar al numero menor necesita: " + menos);
		}
	}
}
