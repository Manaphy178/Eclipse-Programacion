package Ejer3;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu ciudad natal");
		String ciudad = sc.nextLine();
		ciudad = ciudad.toUpperCase().trim();
		System.out.println(ciudad.charAt(ciudad.length() - 1));
	}
}