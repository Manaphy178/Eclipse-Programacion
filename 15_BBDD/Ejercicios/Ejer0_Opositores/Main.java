package Ejer0_Opositores;

import java.util.*;
import java.io.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static BDController controladorBD = new BDController();
	static ArrayList<Opositor> opositores = new ArrayList<Opositor>();
	static ArrayList<String> ciudades = new ArrayList<String>();

	public static void main(String[] args) {
		opositores = controladorBD.todosOpo();
		ciudadesArray();
		archivosCiudades();
		dnisOpos();

	}

	public static void ciudadesArray() {
		for (Opositor opo : opositores) {
			if (!ciudades.contains(opo.getCiudad())) {

				ciudades.add(opo.getCiudad());
			}
		}
	}

	public static void archivosCiudades() {
		File ciudad = new File("ciudades.txt");
		if (!ciudad.exists()) {
			try {
				ciudad.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ciudad, false));
			for (String ciu : ciudades) {
				bw.write(ciu);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void dnisOpos() {
		File dnis = new File("dnisOpos.txt");
		if (!dnis.exists()) {
			try {
				dnis.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Dime una letra para guardar los dnis especificos");
		char letra = sc.nextLine().trim().toUpperCase().charAt(0);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(dnis, false));
			for (Opositor opo : opositores) {
				if (opo.getDni().charAt(opo.getDni().length() - 1) == letra) {
					bw.write(opo.mostrarDatos());
					bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
