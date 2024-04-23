package Primero_EjerciciosBasicos;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String nombre = "";
		String apellidos = "";
		int edad = 0;
		String telefono = "";
		System.out.println("Introduce tu edad:");
		edad = sn.nextInt();
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce tus apellidos:");
		apellidos = sc.nextLine();
		System.out.println("Introduce tu numero de telefono:");
		telefono = sc.nextLine();
		System.out.println(nombre +" "+ apellidos +", tienes "+ edad + " años y tu numero de telefono es " + telefono);
	}

}
