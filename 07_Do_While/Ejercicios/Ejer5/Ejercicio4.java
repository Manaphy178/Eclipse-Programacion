package Ejer5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num = 0;
		double med_pos = 0;
		double med_neg = 0;
		int suma_pos = 0;
		int suma_neg = 0;
		int cont_cero = 0;
		int cont_pos = 0;
		int cont_neg = 0;
		for (int i = 1; i <= 20; i++) {
			System.out.println("Dime un numero");
			num = sn.nextInt();
			if (num >= 0) {
				suma_pos = suma_pos + num;
				cont_pos++;
				if (num == 0) {
					cont_cero++;

				}
			}
			if (num < 0) {
				suma_neg = suma_neg + num;
				cont_neg++;
			}
		}
		med_pos = suma_pos / cont_pos;
		med_neg = suma_neg / cont_neg;
		System.out.println("La media de los numeros positivos es: " + med_pos);
		System.out.println("La media de los numeros negativos es: " + med_neg);
		System.out.println("El numero de veces que un numero ha sido cero es: " + cont_cero);
	}
}
