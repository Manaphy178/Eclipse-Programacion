package Ejer1;

import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int num = 0;
		int nueve = 0;
		int distinto = 0;

		for (int i = 0; i < 20; i++) {
			System.out.print("Dime un numero entero: ");
			num = sn.nextInt();
			if (num == 9) {
				nueve++;
			}else {
				distinto++;
			}
		}
		System.out.println("Has dicho el numero 9: " + nueve + " veces");
		System.out.println("Y has dicho un numero distinto a 9: "+distinto+" veces" );
	}

}
