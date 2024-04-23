package Ejer3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num1 = 0;
		int num2 =0;
		System.out.println("Dime un numero: ");
		num1 = sn.nextInt();
		System.out.println("Dime otro numero: ");
		num2 = sn.nextInt();
		for (int i=1;i<=num1;i++) {
			for(int x=1;x<=num2;x++) {
				System.out.print(x + " ");
			}
			System.out.println("");
		}
	}

}
