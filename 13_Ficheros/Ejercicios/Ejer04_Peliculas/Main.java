package Ejer04_Peliculas;

import java.util.*;
import java.io.*;

public class Main {
	static ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String ruta = "películas.txt";
		File f = new File(ruta);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		volcarPelis(f);
		opciones(ruta);

	}

	public static int menu() {
		System.out.println("\tMENU");
		System.out.println("1. Alta de pelicula");
		System.out.println("2. Baja de pelicula");
		System.out.println("3. Consultar las peliculas");
		System.out.println("4. Consultar pelicula por codigo");
		System.out.println("5. Salir");
		System.out.println("\nElige una opcion:");
		return sn.nextInt();
	}

	public static void opciones(String ruta) {
		boolean si = true;
		do {
			switch (menu()) {
			case 1:
				AltaPeli();
				break;
			case 2:
				BajaPeli();
				break;
			case 3:
				TodasPelis();
				break;
			case 4:
				ConsultaPeli();
				break;

			default:
				si = false;
				break;
			}
		} while (si);
		System.out.println("Adioooooos");
		guardarPelis(ruta);
	}

	public static void volcarPelis(File f) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			try {
				l = br.readLine();
				while (l != null) {
					pelis.add(new Pelicula(l.split("\\|\\|")[0], l.split("\\|\\|")[1], Integer.valueOf(l.split("\\|\\|")[2].trim()),
							l.split("\\|\\|")[3], Double.valueOf(l.split("\\|\\|")[4])));
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

	public static void AltaPeli() {
		System.out.println("Vamos a dar de alta una peli");
		System.out.println("Dime el codigo de la peli");
		String cod = sc.nextLine();
		System.out.println("Dime el nombre de la pelicula");
		String nombre = sc.nextLine();
		System.out.println("Dime el año en el que salio");
		int anno = sn.nextInt();
		System.out.println("Dime cual es el actor estrella de la pelicula");
		String estrella = sc.nextLine();
		System.out.println("Dime el coste que tuvo la pelicula");
		double coste = sn.nextDouble();
		pelis.add(new Pelicula(cod, nombre, anno, estrella, coste));
		System.out.println("Se ha dado de alta la pelicula");
	}

	public static void BajaPeli() {
		System.out.println("Vamos a dar de baja una peli");
		System.out.println("Dime el codigo de la pelicula");
		String cod = sc.nextLine();
		boolean baja = false;
		Iterator<Pelicula> it = pelis.iterator();
		while (it.hasNext()) {
			Pelicula codigo = it.next();
			if (codigo.getCod().equalsIgnoreCase(cod)) {
				it.remove();
				baja = true;
			}
		}
		System.out.println(baja ? "La pelicula se ha dado de baja" : "No se ha podido encontrar la pelicula");
	}

	public static void TodasPelis() {
		for (Pelicula pelicula : pelis) {
			System.out.println(pelicula.toString());
		}
	}

	public static void ConsultaPeli() {
		System.out.println("Dime el codigo de la pelicula que quieras consultar");
		String cod = sc.nextLine();
		for (Pelicula pelicula : pelis) {
			if (pelicula.getCod().equalsIgnoreCase(cod)) {
				System.out.println(pelicula.toString());
			}
		}
	}

	public static void guardarPelis(String archivo) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
			for (Pelicula pelicula : pelis) {
				bw.write(pelicula.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
