package Ejer1;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);

		int indice = 0;
		int nota = 0;
		int aprovado = 0;
		int casi = 0;
		int suspenso = 0;
		do {
			System.out.println("Dime la nota del alumno:");
			nota = sn.nextInt();
			if (nota >= 5) {
				aprovado++;
			} else {
				suspenso++;
			}
			if (nota == 4) {
				casi++;
			}
			indice++;
		} while (indice < 65);
		System.out.println("La cantidad de aprovados son " + aprovado + " alumnos");
		System.out.println("La cantidad de casi aprovados son " + casi + " alumnos");
		System.out.println("La cantidad de suspensos son " + suspenso + " alumnos");

	}

}
