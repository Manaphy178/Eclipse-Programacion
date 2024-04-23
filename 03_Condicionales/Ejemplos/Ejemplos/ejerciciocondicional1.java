package Ejemplos;
import java.util.Scanner;

public class ejerciciocondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.print("Cual es tu nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Cual es tu edad: ");
		double edad = sn.nextDouble();
		System.out.print("Cual es tu sueldo: ");
		double sueldo = sn.nextDouble();
		System.out.print("Cual es tu altura: ");
		double alt = sn.nextDouble();
		if (!nombre.equalsIgnoreCase("Jose") && (edad >= 20 && edad <= 40) && sueldo > 3000
				&& (alt >= 190 && alt <= 195) || (nombre.equalsIgnoreCase("antonio") && edad >= 70)) {
			System.out.println("Tienes premio, enhorabuena");
		} else {
			System.out.println("No has ganao nah");
		}
	}

}
