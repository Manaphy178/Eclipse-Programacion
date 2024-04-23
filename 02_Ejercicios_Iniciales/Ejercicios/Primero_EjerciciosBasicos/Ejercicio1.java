package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apellidos = "";
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos:");
		apellidos = sc.nextLine();
		System.out.println("Tu nombre es: " + nombre +" "+ apellidos);
	}

}
