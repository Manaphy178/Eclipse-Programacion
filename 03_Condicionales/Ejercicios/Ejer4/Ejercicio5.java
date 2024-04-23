package Ejer4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double sueldoL = 0; // Luca modric
		int golesL = 0;
		double subidaL = 0;
		double sueldoC = 0; // Carbajal
		int golesC = 0;
		double subidaC = 0;
		double sueldoVJ = 0; // Vinicius
		int golesVJ = 0;
		double subidaVJ = 0;
		System.out.print("Luca, cual es tu sueldo anual: ");
		sueldoL = sn.nextDouble();
		System.out.println("Y cuantos goles has marcado la pasada temporada? ");
		golesL = sn.nextInt();
		System.out.print("Carbajal, cual es tu sueldo anual: ");
		sueldoC = sn.nextDouble();
		System.out.println("Y cuantos goles has marcado la pasada temporada? ");
		golesC = sn.nextInt();
		System.out.print("Vinicius, cual es tu sueldo anual: ");
		sueldoVJ = sn.nextDouble();
		System.out.println("Y cuantos goles has marcado la pasada temporada? ");
		golesVJ = sn.nextInt();
		if (golesL > 0) {
			subidaL = (sueldoL * golesL / 100);
			System.out.println("La subida de sueldo anual de Luca Modric es: " + subidaL);
		} else {
			System.out.print("No ha marcado ningun gol asi que el sueldo anual sigue siendo el mismo: " + sueldoL);
		}
		if (golesC > 0) {
			subidaC = (sueldoC * golesC / 100);
			System.out.println("La subida de sueldo anual de Carbajal es: " + subidaC);
		} else {
			System.out.print("No ha marcado ningun gol asi que el sueldo anual sigue siendo el mismo: " + sueldoC);
		}
		if (golesVJ > 0) {
			subidaVJ = (sueldoVJ * golesVJ / 100);
			System.out.println("La subida de sueldo anual de Vinicius es: " + subidaVJ);
		} else {
			System.out.print("No ha marcado ningun gol asi que el sueldo anual sigue siendo el mismo: " + sueldoVJ);
		}
	}

}
