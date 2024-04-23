package Ejer06_Enigma;

import java.util.*;
import java.io.*;

public class Desencriptar {
	
	static Scanner sn= new Scanner (System.in);
	static Scanner sc= new Scanner (System.in);
	static String encriptado = "";
	static String letras = "abcdefghijklmnñopqrstuvwxyz .,";
	static ArrayList<Integer> posiciones = new ArrayList<Integer>();

	public static void main(String[] args) {
		System.out.println("Dime el archivo de texto que quieres desencriptar");
		String ruta = sc.nextLine().trim();
		if (!ruta.contains(".txt")) {
			ruta+=".txt";
		}
		File arch = new File(ruta);
		if (arch.exists()) {
			leerArchivo(ruta);
			desencriptarMensaje(encriptado, posiciones);
		}else {
			System.out.println("El archivo introducido no existe");
		}
		
		
	}

	static void desencriptarMensaje(String mensaje, ArrayList<Integer> cod) {
		int posLetra = 0;
		String[] partio = mensaje.split("|");
		for (int i = 0; i < mensaje.length(); i++) {
			for (int j = 0; j < letras.length(); j++) {
				if (mensaje.charAt(i) == letras.charAt(j)) {
					posLetra = j;
					int resta = posLetra - cod.get(i);
					if (resta < 0) {
						resta += 30;
						partio[i] = String.valueOf(letras.charAt(resta));
					} else {
						partio[i] = String.valueOf(letras.charAt(resta));
					}
					break;
				}
			}
		}
		String mensajeDes = "";
		for (int i = 0; i < partio.length; i++) {
			mensajeDes += partio[i];
		}
		System.out.println("Mensaje desencriptado: \n" + mensajeDes);
	}

	static void leerArchivo(String ruta) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			try {
				encriptado = br.readLine();
				l = br.readLine();
				while (l != null) {
					posiciones.add(Integer.valueOf(l));
					l = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
