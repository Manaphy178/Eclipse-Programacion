package Segundo_EntradaSalida;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		int edad = 0;
		String profe = "";
		System.out.println("Cual es tu nombre: ");
		nombre = sc.nextLine();
		System.out.println("Cual es tu apellido: ");
		apellido = sc.nextLine();
		System.out.println("Cuantos años tienes: ");
		edad = sn.nextInt();
		System.out.println("De que trabajas: ");
		profe = sc.nextLine();
		System.out.println("Usted se llama " + nombre + " " + apellido + ", tiene una edad de " + edad + " y trabaja de " + profe);
	}

}
