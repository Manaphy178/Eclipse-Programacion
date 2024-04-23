package Segundo_EntradaSalida;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double mensual = 0 ;
		double anual = 0;
		System.out.print("Dime cuanto cobras mensualmente: ");
		mensual = sn.nextDouble();
		anual = mensual * 12;
		System.out.println("El usuario cobra mensualmente " + mensual + "€, anualmente cobras un total de " + anual + "€");
	}

}
