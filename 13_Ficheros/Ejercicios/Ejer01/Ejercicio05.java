package Ejer01;

import java.io.*;
import java.util.*;

public class Ejercicio05 {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		File archivo = new File("listadoGS.txt");
		try {
			archivo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Dime por cual nombre quieres cambiarle al fichero");
		File nuevo = new File(sc.nextLine());
		archivo.renameTo(nuevo);
	}

}
