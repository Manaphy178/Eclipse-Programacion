package Ejer6;

import java.util.*;

public class ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] datos = { "Nombre y Apellidos: ", "Ciudad: ", "DNI: ", "Edad: " };
		System.out.println("Dime tus datos personales en este formato (apellido$$nombre$$ciudad$$DNI$$edad)");
		String[] dato = sc.nextLine().split("\\$\\$");
		int index = 0;
		for (int i = 0; i < dato.length; i++) {
			if (i == 0) {
				System.out.println(datos[index] + dato[1] + " " + dato[0]);
				i = 1;
			} else {
				System.out.println(datos[index] + dato[i]);
			}
			index++;
		}
	}
}
