package Ejer01;

import java.util.*;
import java.io.*;

public class Ejercicio04 {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime el nuevo nombre del directorio");
		File dir = new File(sc.nextLine());
		if (dir.isDirectory()) {
			System.out.println("El directorio ya existe");
		} else {
			dir.mkdir();
			System.out.println("Se ha creado el directorio");
		}
	}

}
