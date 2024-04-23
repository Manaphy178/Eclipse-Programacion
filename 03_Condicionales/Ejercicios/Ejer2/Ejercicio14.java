package Ejer2;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int año = 0;
		System.out.print("Dime un dia: ");
		dia = sn.nextInt();
		System.out.print("Dime un mes: ");
		mes = sn.nextInt();
		System.out.print("Dime un año: ");
		año = sn.nextInt();
		if (año >= 2000 && año <= 2100) {
			if (mes <= 12 && mes >= 1) {
				if (mes == 2) {
					if (dia >= 1 && dia <= 28) {
						System.out.print("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
					} else {
						System.out.print("La fecha que se ha proporcionado no es correcta");
					}
				}
				if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
					if (dia >= 1 && dia <= 30) {
						System.out.print("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
					} else {
						System.out.print("La fecha que se ha proporcionado no es correcta");
					}
				}
				if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
					if (dia >= 1 && dia <= 31) {
						System.out.print("La fecha " + dia + "/" + mes + "/" + año + " es correcta");
					} else {
						System.out.print("La fecha que se ha proporcionado no es correcta");
					}
				}
			} else {
				System.out.print("La fecha que se ha proporcionado no es correcta");
			}
		} else {
			System.out.print("La fecha que se ha proporcionado no es correcta");
		}
	}
}

