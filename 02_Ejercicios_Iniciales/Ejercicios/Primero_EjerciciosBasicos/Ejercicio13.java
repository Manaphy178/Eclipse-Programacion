package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double radio = 0;
		double result = 0;
		System.out.println("Vamos a calcular el área del circulo.");
		System.out.println("Dime el radio del circulo: ");
		radio = sn.nextDouble();
		result = Math.PI * (Math.pow(radio, 2)) ;
		System.out.println("El área del circulo es: " + result);
	}

}
