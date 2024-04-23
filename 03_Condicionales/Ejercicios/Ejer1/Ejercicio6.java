package Ejer1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		int num = nombre.length();
		if (num > 10) {
			System.out.println("Que nombre más aburrido de escribir");
		} else {
			System.out.println("Bonito nombre");
		}
	}
}
