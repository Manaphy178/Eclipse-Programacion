package Ejer4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		double nota = 0;
		System.out.println("Dime tu nota:");
		nota = sn.nextDouble();
		if (nota >=0 && nota <=10) {
			if (nota >=0 && nota < 5) {
				System.out.println("Insuficiente");
			}else if (nota >=5 && nota <6) {
				System.out.println("Suficiente");
			}else if (nota >= 6 && nota <7) {
				System.out.println("Bien");
			}else if (nota >= 7 && nota < 9) {
				System.out.println("Notable");
			}else if (nota >= 9 && nota <=10) {
				System.out.println("Sobresaliente");
			}
		}else {
			System.out.println("La nota que has introducido no es valida");
		}
	}

}
