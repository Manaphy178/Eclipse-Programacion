package Ejer1;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] ciudades = new String[7];
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println("Dime una ciudad");
			ciudades[i] = sc.nextLine();
			char pri= ciudades[i].charAt(0);
			String may= "";
			may = String.valueOf(pri);
			ciudades[i] = ciudades[i].replaceFirst(may, may.toUpperCase()  );
		}
		for (int i = 0; i < ciudades.length; i++) {
			System.out.println(ciudades[i]);
		}
	}
}