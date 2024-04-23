package Ejer1;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		boolean sialpoliamor = false;
		String res = "";
		System.out.println("Sea sincero, usted está a favor del poliamor?");
		res = sc.nextLine();
		if (res.equalsIgnoreCase("si")) {
			sialpoliamor = true;
		}
		if (sialpoliamor == true) {
			System.out.println("Usted es un moderno de esos");
		} else {
			System.out.println("Usted es uno de los clásicos de los buenos");
		}
	}
}
