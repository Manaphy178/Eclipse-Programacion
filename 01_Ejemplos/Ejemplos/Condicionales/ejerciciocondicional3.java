package Condicionales;
import java.util.Scanner;

public class ejerciciocondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		// boolean si = false;

		String nombre = "";
		System.out.print("Como te llamas: ");
		nombre = sc.nextLine();
		if (nombre.equalsIgnoreCase("Antonio")) {
			// si = true;
			// if (si == true){
			// }
			System.out.print("Has ganado una sarten");
		} else if (nombre.equalsIgnoreCase("Rodrigo")) {
			System.out.print("has ganado un coche");
		}
	}

}
