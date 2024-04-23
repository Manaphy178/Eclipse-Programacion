package Ejer1;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double costo = 0;
		System.out.print("Cuanto te ha costado la camiseta: ");
		costo = sn.nextDouble();
		if (costo < 20) {
			System.out.println("La has robado? Porque menudo choyo");
		} else if (costo >= 20) {
			System.out.println("La camisa bonita y tal, pero el timo que te acaban de hacer es más bonito");
		}
	}
}
