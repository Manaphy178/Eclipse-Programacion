package Ejer09_PeliculasV2;

import java.util.*;
import java.io.*;

public class Main {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static Pelicula movie = new Pelicula();

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
		opciones(ruta, f);

	}

	public static int menu() {
		System.out.println("\t\nMENU");
		System.out.println("1. Alta de pelicula");
		System.out.println("2. Baja de pelicula");
		System.out.println("3. Consultar las peliculas");
		System.out.println("4. Consultar pelicula por codigo");
		System.out.println("5. Salir");
		System.out.println("\nElige una opcion:");
		return sn.nextInt();
	}

	public static void opciones(String ruta, File f) {
		boolean si = true;
		do {
			switch (menu()) {
			case 1:
				movie = AltaPeli();
				guardarPelis(ruta, movie);
				break;
			case 2:
				BajaPeli(f, ruta);
				break;
			case 3:
				TodasPelis(f);
				break;
			case 4:
				ConsultaPeli(f);
				break;
			case 5:
				si = false;

			default:
				System.out.println(si ? "Opcion invalida" : "Se saldra del programa");
				break;
			}

		} while (si);
		System.out.println("Adioooooos");

	}

	public static Pelicula AltaPeli() {
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
		System.out.println("Se ha dado de alta la pelicula");
		Pelicula peli = new Pelicula(cod, nombre, anno, estrella, coste);
		return peli;
	}

	public static void BajaPeli(File f, String rutaPelis) {
		System.out.println("Vamos a dar de baja una peli");
		System.out.println("Dime el codigo de la pelicula");
		String cod = sc.nextLine();
		boolean esta = false;
		String mod = "mod.txt";
		File modi = new File(mod);
		if (!modi.exists()) {
			try {
				modi.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		limpiar(mod);
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			l = br.readLine();
			while (l != null) {
				Pelicula peli = new Pelicula(l.split("\\|\\|")[0].trim(), l.split("\\|\\|")[1].trim(),
						Integer.valueOf(l.split("\\|\\|")[2].trim()), l.split("\\|\\|")[3].trim(),
						Double.valueOf(l.split("\\|\\|")[4].trim()));
				if (peli.getCod().contains(cod)) {
					esta = true;
					break;
				}
				l = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(esta ? "La peli se ha encontrado, vamos a darla de baja"
				: "El codigo que has introducido no es valido");
		if (esta) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(f));
				try {
					l = br.readLine();
					while (l != null) {
						Pelicula peli = new Pelicula(l.split("\\|\\|")[0].trim(), l.split("\\|\\|")[1].trim(),
								Integer.valueOf(l.split("\\|\\|")[2].trim()), l.split("\\|\\|")[3].trim(),
								Double.valueOf(l.split("\\|\\|")[4].trim()));
						if (!peli.getCod().contains(cod)) {
							guardarMod(mod, peli);
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
			limpiar(rutaPelis); // limpiar el archivo principal
//			Meter todo en lo nuevo
			try {
				BufferedReader br = new BufferedReader(new FileReader(modi));
				try {
					l = br.readLine();
					while (l != null) {
						Pelicula peli = new Pelicula(l.split("\\|\\|")[0].trim(), l.split("\\|\\|")[1].trim(),
								Integer.valueOf(l.split("\\|\\|")[2].trim()), l.split("\\|\\|")[3].trim(),
								Double.valueOf(l.split("\\|\\|")[4].trim()));
						modificar(rutaPelis, peli);
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
		modi.delete();
	}

	public static void TodasPelis(File f) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			try {
				l = br.readLine();
				while (l != null) {
					System.out.println(l);
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

	public static void ConsultaPeli(File f) {
		System.out.println("Dime el codigo de la pelicula que quieras consultar");
		String cod = sc.nextLine();
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			try {
				l = br.readLine();
				while (l != null) {
					Pelicula peli = new Pelicula(l.split("\\|\\|")[0].trim(), l.split("\\|\\|")[1].trim(),
							Integer.valueOf(l.split("\\|\\|")[2].trim()), l.split("\\|\\|")[3].trim(),
							Double.valueOf(l.split("\\|\\|")[4].trim()));
					if (peli.getCod().contains(cod)) {
						System.out.println(peli.toString());
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

	public static void guardarPelis(String archivo, Pelicula peli) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true));
			bw.write(peli.toString());
			bw.newLine();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void guardarMod(String ruta, Pelicula peli) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
			bw.write(peli.toString());
			bw.newLine();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void limpiar(String ruta) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void modificar(String ruta, Pelicula peli) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, false));
			bw.write(peli.toString());
			bw.newLine();
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
