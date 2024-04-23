package Ejer06_Enigma;

import java.util.*;
import java.io.*;

public class Encriptar {
	static String mensaje = "";
	static String letras = "abcdefghijklmnñopqrstuvwxyz .,";
	static ArrayList<Integer> posiciones = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime el mensaje que quieres encriptar");
		mensaje = sc.nextLine().toLowerCase();
		String[] partido = mensaje.split("|");
		encriptarMensaje(partido);
		crearFichero();
	}

	static void encriptarMensaje(String[] partido) {
		int posLetra = 0;
		for (int i = 0; i < mensaje.length(); i++) {
			for (int j = 0; j < letras.length(); j++) {
				if (mensaje.charAt(i) == letras.charAt(j)) {
					posLetra = j;
					int numR = (int) (Math.random() * 30);
					int suma = posLetra + numR;
					posiciones.add(numR);
					if (suma >= 30) {
						suma = suma - 30;
						partido[i] = String.valueOf(letras.charAt(suma));
					} else {
						partido[i] = String.valueOf(letras.charAt(suma));
					}
					break;
				}
			}
		}
		mensaje = "";
		for (int i = 0; i < partido.length; i++) {
			mensaje += partido[i];
		}
		System.out.println("Mensaje encriptado: \n" + mensaje);
	}

	static void crearFichero() {
		System.out.println("Como quieres llamar al archivo donde se guardara el mensaje encriptado");
		String ruta= sc.nextLine().trim();
		if (!ruta.contains(".txt")) {
			ruta+=".txt";
		}
		File arch = new File(ruta);
		if (!arch.exists()) {
			try {
				arch.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(arch, false));
			bw.write(mensaje);
			bw.newLine();
			for (Integer inta : posiciones) {
				bw.write(String.valueOf(inta));
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
