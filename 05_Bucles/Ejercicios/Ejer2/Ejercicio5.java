package Ejer2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int contador = 1;
		System.out.println("Dime hasta que numero quieres que cuente:");
		num = sn.nextInt();
		while (num >= contador) {
			System.out.println(contador + " ");
			contador++;
		}
	}

}
