package Ejemplos;

import java.util.*;
import java.io.*;

public class EjemploEscritura {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String path = "1GS.txt";
		File f = new File(path);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		/* Escribimos a pelo en un archivo de manera manual */
//		String l = "Hola esto es la primera linea";
//		String l2 = "Hola esto es la segunda linea";
//		try {
//
//			/*
//			 * Si el parametro es True, respeta el contenido del archivo y añade las lineas
//			 * que has puesto 
//			 * Si el parametro es false, borra el contido del archivo y
//			 * escribe lo nuevo
//			 */
//
//			BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));
//			bw.write(l);
//			bw.newLine();
//			bw.write(l2);
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		Hacemos un array de nombres
		String[] nombres = { "Gonzalo", "Laura", "Javier", "Pablo", "Miguel", "Estefi" };
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path, false));
			for (String nom : nombres) {
				bw.write(nom);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
