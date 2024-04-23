package Ejer01;

import java.util.*;
import java.io.*;

public class Ejercicio02 {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] ficheros = new String[5];
		for (int i = 0; i < ficheros.length; i++) {
			System.out.println("Dime el nombre de un fichero");
			ficheros[i] = sc.nextLine();
			File archivo = new File(ficheros[i]);
			if (archivo.exists()) {
				System.out.println("El archivo " + ficheros[i] + " ya existe");
			} else {
				try {
					archivo.createNewFile();
					System.out.println("Se ha creado el archivo");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}
