package Ejer1;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double men = 0;
		double anu = 0;
		System.out.print("Cuanto es tu sueldo mensual: ");
		men = sn.nextDouble();
		anu = men * 12;
		anu = anu + 300;
		if (men >= 1000) {
			anu = anu + 500;
		}
		System.out.print("Tu sueldo anual es: " + anu);
	}
}
