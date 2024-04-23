package Ejer10;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int[] array1 = new int[10];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Dime numeros para el array1:");
			array1[i] = sn.nextInt();
		}
		int nelsoniano = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % array1[i] == 0 && array1[i] % 1 == 0 && array1[i] % 12 == 0 && array1[i] != array1[i] - 5) {
				nelsoniano++;
			}
		}
		int[] nelson = new int[nelsoniano];
		nelsoniano = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % array1[i] == 0 && array1[i] % 1 == 0 && array1[i] % 12 == 0 && array1[i] != array1[i] - 5) {
				nelson[nelsoniano] = array1[i];
				nelsoniano++;
			}
		}
		for (int i = 0; i < nelson.length; i++) {
			System.out.println(nelson[i]);
			System.out.println("jaja, no hay nelsoniano, has perdido tu tiempo");
		}
	}

}
