package Ejer4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int hor = 0;
		int min = 0;
		int seg = 0;
		System.out.println("Dime la hora:");
		hor = sn.nextInt();
		System.out.println("Dime los minutos:");
		min = sn.nextInt();
		System.out.println("Dime los segundos:");
		seg = sn.nextInt();
		if (hor >= 0 && hor < 24) {
			if (min >= 0 && min <60) {
				if (seg >=0 && seg <60) {
					System.out.println("La hora esta bien; "+ hor + ":" +min+ ":" + seg);
				}else {
					System.out.println("Los segundos no estan en el rango de tiempo");
				}
			}else {
				System.out.println("Los minutos no estan en el rango de tiempo");
			}
		}else {
			System.out.println("Las horas no estan en el rando de tiempo");
		}
	}

}
