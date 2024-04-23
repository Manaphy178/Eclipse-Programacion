package Ejer1;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double numero = 0;
		System.out.print("Dime un número: ");
		numero = sn.nextDouble();
		if (numero > 10) {
			System.out.println("Tu número es mayor que 10");
		} else if (numero < 10) {
			System.out.println("Tu número es menor a 10");
		} else {
			System.out.println("Tu número es un 10");
		}
	}

}
