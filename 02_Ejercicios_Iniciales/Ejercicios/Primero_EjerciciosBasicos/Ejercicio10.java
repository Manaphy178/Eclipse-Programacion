package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		int precio = 0;
		String nombre = "";
		double resultado = 0;
		System.out.println("Digame el nombre del producto: ");
		nombre = sc.nextLine();
		System.out.println("Digame el precio: ");
		precio = sn.nextInt();
		resultado = precio * 1.21;
		System.out.println("El precio final con IVA es: " + resultado);
	}

}