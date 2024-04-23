package Ejer1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double nota = 0;
		System.out.print("Cuanto has sacado de nota en el examen: ");
		nota = sn.nextDouble();
		if (nota >= 5) {
			System.out.println("Has aprovado");
		} else if (nota < 5) {
			System.out.println("Has suspendido");
		}
	}

}
