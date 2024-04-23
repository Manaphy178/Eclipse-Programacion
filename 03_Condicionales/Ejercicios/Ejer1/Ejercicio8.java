package Ejer1;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean carnet = false;
		String res = "";
		System.out.println("Tienes el carnet de conducir de tipo 'A'? ");
		res = sc.nextLine();
		if (res.equalsIgnoreCase("Si")) {
			carnet = true;
		}
		if (carnet == true) {
			System.out.println("Usted tiene el carnet de tipo A");
		} else {
			System.out.println("Usted tiene otro tipo de permiso para conducir o no tiene un permiso de conducir");
		}
	}
}
