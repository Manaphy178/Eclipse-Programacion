package Segundo_EntradaSalida;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		String apellido = "";
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce tu apellido:");
		apellido = sc.nextLine();
		System.out.println(nombre + " " +apellido);
	}

}
