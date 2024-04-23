package Ejer03;

import java.util.*;
import java.io.*;

public class EjercicioEscritura {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> notas = new ArrayList<String>();

	public static void main(String[] args) {
		String ruta = "notasProgramacion.txt";
		File f = new File(ruta);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		volcarArchivo(f);
		boolean si = true;
		do {
			switch (menu()) {
			case 1: {
				System.out.println("Introduzca nombre de alumno con su nota");
				notas.add(sc.nextLine().toLowerCase());
				break;
			}
			case 2: {
//				Llamo al metodo que muestra el archivo por dentro
				mostrarNotas();
				break;
			}
			case 3: {
				borrarAlumno();
				break;
			}
			case 4: {
				notas.clear();
				break;
			}
			case 5: {
				meterAlumPos();
				break;
			}
			case 6: {
				modNotaAlum();
				break;
			}

			default:
				si = false;
				break;

			}
		} while (si);
		guardarNotas(ruta);
		System.out.println("Adioooos");

	}

	static int menu() {
		System.out.println();
		System.out.println("Dime una opcion");
		System.out.println("1. Meter notas");
		System.out.println("2. Mostrar las notas de los alumnos");
		System.out.println("3. Eliminar alumno y nota");
		System.out.println("4. Borrar todas las notas de los alumnos");
		System.out.println("5. Insertar alumno pero en posicion indicada");
		System.out.println("6. Modificar la nota de alumno");
		System.out.println("7. Salir");
		return sn.nextInt();
	}

	static void mostrarNotas() {
		for (String string : notas) {
			System.out.println(string);
		}
	}

//	Llamo al metodo que vuelca el contenido del archivo en el arraylist
	public static void volcarArchivo(File archivo) {
		String l = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				l = br.readLine();
				while (l != null) {
					notas.add(l.toLowerCase());
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

	public static void guardarNotas(String archivo) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			for (String not : notas) {
				bw.write(not);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void borrarAlumno() {
		System.out.println("Dime el nombre del alumno para buscarlo");
		String res = sc.nextLine().toLowerCase();
		boolean esta = false;
		for (String not : notas) {
			if (not.contains(res)) {
				esta = true;
			}
		}
		boolean removed = false;
		if (esta) {
			Iterator<String> it = notas.iterator();
			while (it.hasNext()) {
				String alum = (String) it.next();
				if (alum.contains(res)) {
					it.remove();
					removed = true;
				}
			}
		}

		System.out.println(removed ? "El alumno se ha eliminado" : "No se ha encontrado el alumno");
	}

	public static void meterAlumPos() {
		System.out.println(
				"Ahora mismo hay " + notas.size() + " alumnos\nEn que posicion quieres meter al nuevo alumno?");
		int pos = sn.nextInt();
		System.out.println("Introduzca al alumno en el formato: Alumno - Nota");
		String alum = sc.nextLine().toLowerCase();
		notas.add(pos, alum);
		System.out.println("Alumno introducido");
	}

	public static void modNotaAlum() {
		System.out.println("Dime el alumno que buscas");
		String alum = sc.nextLine().toLowerCase();
		boolean esta = false;
		boolean mod = false;
		int pos = 0;
		for (String nota : notas) {
			if (nota.contains(alum)) {
				esta = true;
			}
		}
		System.out.println(esta ? "Se ha encontrado al alumno" : "No se ha encontrado al alumno");
		if (esta) {

			Iterator<String> it = notas.iterator();
			while (it.hasNext()) {
				String temp = (String) it.next();
				String name = temp.split("-")[0].trim();
				if (alum.equalsIgnoreCase(name)) {
					System.out.println("Dime la nueva nota del alumno:");
					String nota = sc.nextLine();
					notas.set(pos, name + "-" + nota);
					mod = true;
				}
				pos++;
			}
		}
		System.out.println(mod ? "El alumno se le ha modificado la nota" : "Nota no se ha modificado");

	}
}
