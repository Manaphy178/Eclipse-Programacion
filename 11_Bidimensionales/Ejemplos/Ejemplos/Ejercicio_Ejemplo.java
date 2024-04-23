package Ejemplos;

import java.util.*;

public class Ejercicio_Ejemplo {

	public static void main(String[] args) {
		int[][] numeros = new int[5][4];
		Scanner sc = new Scanner(System.in);
		int num = 1;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = num;
				num++;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " - ");
			}
			System.out.println();
		}
		num = 20;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = num;
				num--;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " - ");
			}
			System.out.println();
		}
		num = 99;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = num;
			}
		}
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " - ");
			}
			System.out.println();
		}
		String datos[][] = new String[4][3];
		datos[0][0] = "Nombre";
		datos[0][1] = "Apellido";
		datos[0][2] = "DNI";
		for (int i = 1; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.println(datos[0][j]);
				datos[i][j] = sc.nextLine();

			}
		}
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos[i][j] + " - ");
			}
			System.out.println();
		}
	}

}
