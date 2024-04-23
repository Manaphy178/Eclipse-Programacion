package Ejer07_Coches;

import java.util.*;
import java.io.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Coche> coches = new ArrayList<Coche>();
	static String ruta = "Coches.txt";
	static ArrayList<String> marcas = new ArrayList<String>();

	public static int menu() {
		System.out.println("\nMenu");
		System.out.println("1. Mostrar todos los datos de los coches");
		System.out.println("2. Generar archivos de las marcas");
		System.out.println("3. Salir");
		System.out.println("Seleccione una opcion");
		return sn.nextInt();
	}

	public static void opciones() {
		boolean si = true;
		do {
			switch (menu()) {
			case 1:
				mostrarDatos();
				break;
			case 2:
				ficherosMarcas();

				break;
			case 3:
				si = false;

			default:
				System.out.println(si ? "Opcion elegida invalida" : "Se va a salir del programa");
				break;
			}
		} while (si);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		volcarArchivo(archivo);

	}

	public static void volcarArchivo(File archivo) {
		String l = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				l = br.readLine();
				while (l != null) {
					ArrayList<String> c = new ArrayList<String>();
					String[] coche = l.split(";");

					if (coche.length <= 5) {
						coches.add(new Coche(coche[0], coche[1], coche[2], coche[3], Double.valueOf(coche[4]), null));
					} else if (coche.length >= 6) {
						String[] ex = coche[5].split(",");
						for (int i = 0; i < ex.length; i++) {
							c.add(ex[i]);
						}
						coches.add(new Coche(coche[0], coche[1], coche[2], coche[3], Double.valueOf(coche[4]), c));
					}
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

	public static void ficherosMarcas() {
		for (Coche coche : coches) {
			if (!marcas.contains(coche.getMarca())) {
				marcas.add(coche.getMarca());
			}
		}
		for (String m : marcas) {
			String r = m + ".txt";
			File archivo = new File(r);
			if (!archivo.exists()) {
				try {
					archivo.createNewFile();
					escribirNuevo(r, m);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public static void escribirNuevo(String r, String m) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(r, false));
			for (Coche coche : coches) {
				if (coche.getMarca().equalsIgnoreCase(m)) {
					bw.write(coche.toString());
					bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void mostrarDatos() {
		for (Coche coche : coches) {
			System.out.println(coche.toString());
		}
	}
}
