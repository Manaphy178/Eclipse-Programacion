package Ejer01;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] gifts = new String[8];
		System.out.println("Que regalo le vas a pedir a los reyes magos estas navidades: \r");
		for (int i = 1; i < 9; i++) {
			System.out.print(i + ". ");
			gifts[i - 1] = sc.nextLine();
		}
	}
}