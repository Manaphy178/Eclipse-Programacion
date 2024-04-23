package Ejer2;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		System.out.print("Introduce un dia: ");
		dia = sn.nextInt();
		System.out.print("Introduce un mes: ");
		mes = sn.nextInt();
		if ((mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31)) {
			if (mes == 12 || mes <= 3) { // Invierno
				if (mes == 12 && (dia >= 21 && dia <= 31) || mes == 1 && (dia >= 1 && dia <= 31)
						|| mes == 2 && (dia >= 1 && dia <= 29) || mes == 3 && (dia >= 1 && dia <= 20)) {
					System.out.println("Estas en Invierno");
				}
			}
			if (mes >= 3 && mes <= 6) { // Primavera
				if (mes == 3 && (dia >= 21 && dia <= 31) || mes == 4 && (dia >= 1 && dia <= 30)
						|| mes == 5 && (dia >= 1 && dia <= 31) || mes == 6 && (dia >= 1 && dia <= 21)) {
					System.out.println("Estas en Primavera");
				}
			}
			if (mes >= 6 && mes <= 9) { // Verano
				if (mes == 6 && (dia >= 22 && dia <= 30) || (mes == 7 || mes == 8) && (dia >= 1 && dia <= 31)
						|| mes == 9 && (dia >= 1 && dia <= 22)) {
					System.out.println("Estas en Verano");
				}
			}
			if (mes >= 9 && mes <= 12) { // Otoño
				if (mes == 9 && (dia >= 23 && dia <= 30) || mes == 10 && (dia >= 1 && dia <= 31)
						|| mes == 11 && (dia >= 1 && dia <= 30) || mes == 12 && (dia >= 1 && dia <= 20)) {
					System.out.println("Estas en Otoño");
				}
			}
		} else {
			System.out.println("Has introducido mal la fecha");
		}
	}

}
// Enero 31
// Febrero 28-29
// Marzo 31
// Abril 30
// Mayo 31
// Junio 30
// Julio 31
// Agosto 31
// Septiembre 30
// Octubre 31
// Noviembre 30
// Diciembre 31