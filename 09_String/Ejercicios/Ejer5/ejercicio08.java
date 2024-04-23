package Ejer5;

import java.util.*;

public class ejercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int primer = 0, segundo = 0, tercer = 0;

		System.out.println("Dame una frase");
		String frase1 = sc.nextLine();
		System.out.println("Otra");
		String frase2 = sc.nextLine();
		String[] palabras1 = frase1.split(" ");
		String[] palabras2 = frase2.split(" ");
		String[] frase3 = new String[palabras1.length + palabras2.length];
		while (primer < palabras1.length || segundo < palabras2.length) {
			if (primer < palabras1.length) {
				frase3[tercer] = palabras1[primer];
				primer++;
				tercer++;
			}
			if (segundo < palabras2.length) {
				frase3[tercer] = palabras2[segundo];
				segundo++;
				tercer++;
			}
		}
		for (int i = 0; i < frase3.length; i++) {
			System.out.print(frase3[i]);
		}
	}
}