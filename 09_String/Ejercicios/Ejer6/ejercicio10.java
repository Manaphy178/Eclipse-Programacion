package Ejer6;

import java.util.*;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una fecha con el formato numerico. (dd/mm/yy)");
		String[] fecha = sc.nextLine().split("/");
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "juio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		int pos = Integer.valueOf(fecha[1]) - 1;
		System.out.println("Has puesto la fecha: " + fecha[0] + " de " + meses[pos] + " del " + fecha[2]);
	}

}
