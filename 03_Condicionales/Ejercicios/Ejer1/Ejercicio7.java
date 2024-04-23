package Ejer1;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String ciudad = "";
		int edad = 0;
		double sueldo = 0;
		System.out.print("De donde vienes o donde vives: ");
		ciudad = sc.nextLine();
		if (ciudad.equalsIgnoreCase("Madrid")) {
			System.out.print("Cuantos años tienes: ");
			edad = sn.nextInt();
			if (edad >= 18) {
				System.out.print("Eres mayor de edad");
			} else {
				System.out.print("Eres menor de edad");
			}
		} else {
			System.out.print("Cual es tu sueldo: ");
			sueldo = sn.nextDouble();
			if (sueldo < 1000) {
				System.out.print("Eres un superhéroe :)");
			} else {
				System.out.print("Es un buen sueldo");
			}
		}
	}
}
