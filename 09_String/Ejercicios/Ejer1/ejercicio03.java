package Ejer1;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una direccion");
		String direccion = sc.nextLine();
		System.out.print(direccion.toUpperCase()+ " "+ direccion.toLowerCase());
	}
}