package Ejer08_PacienteV2;

import java.util.*;
import java.io.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static String ruta = "pacientes.txt";
	static ArrayList<String> provincias = new ArrayList<String>();
	static String[] nombres = new String[2];
	static boolean nom = false;
	static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

	static int menu() {
		System.out.println("Menu");
		System.out.println("1. Mostrar en pantalla los datos de los pacientes");
		System.out.println("2. Mostrar en pantalla los datos de los pacientes nacidos en un año pedido");
		System.out.println("3. Generar un archivo de todos los pacientes nacidos en un año pedido");
		System.out.println("4. Generar un archivo por cada provincia con los datos de los pacientes");
		System.out.println("5. Generar archivo con los pacientes nacidos antes de un año pedido");
		System.out.println("6. Solicitar 2 nombres y generar dos archivos con los pacientes que se llamen asi");
		if (nom) {
			System.out.println("7. Generar un archivo con los dos nombres utilizados anteriormente con los datos");
		}
		System.out.println("8. Salir");
		System.out.println("Seleccione una opcion");
		return sn.nextInt();
	}

	static void opciones() {
		boolean si = true;
		do {
			switch (menu()) {
			case 1:
				mostrarContenido();
				break;
			case 2:
				mostrarPacientesAnno();
				break;
			case 3:
				generarArchivoAnno();
				break;
			case 4:
				ficherosProvincias();
				break;
			case 5:
				archivoAntesdeAnno();
				break;
			case 6:
				twoPersonFileAlone();
				nom = true;
				break;
			case 7:
				if (nom) {
					casamientoFichero();
				} else {
					System.out
							.println("Antes se tiene que elegir la opcion 6 para poder hacer el fichero de pacientes");
				}

				break;
			case 8:
				si = false;

			default:
				System.out.println(si ? "Opcion introducida invalida" : "Se va a salir del programa");
				break;
			}
		} while (si);
		System.out.println("Adios");
	}

	public static void main(String[] args) {
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		volcarArchivo(archivo);
		opciones();
	}

	public static void volcarArchivo(File arch) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(arch));
			try {
				l = br.readLine();
				while (l != null) {
					String[] paciente = l.split("\\|");
					ArrayList<String> enfermedades = new ArrayList<String>();
					ArrayList<String> medicos = new ArrayList<String>();
					int id = Integer.valueOf(paciente[0]);
					if (paciente.length >= 10) {
						String[] enfermedad = paciente[8].split(",");
						String[] medico = paciente[9].split(",");
						for (int i = 0; i < enfermedad.length; i++) {
							enfermedades.add(enfermedad[i]);
						}
						for (int i = 0; i < medico.length; i++) {
							medicos.add(medico[i]);
						}
						pacientes.add(new Paciente(id, paciente[1], paciente[2], paciente[3], paciente[4], paciente[5],
								paciente[6], paciente[7], enfermedades, medicos));

					} else if (paciente.length == 9) {
						String[] enfermedad = paciente[8].split(",");
						for (int i = 0; i < enfermedad.length; i++) {
							enfermedades.add(enfermedad[i]);
						}
						pacientes.add(new Paciente(id, paciente[1], paciente[2], paciente[3], paciente[4], paciente[5],
								paciente[6], paciente[7], enfermedades, medicos));

					} else {
						pacientes.add(new Paciente(id, paciente[1], paciente[2], paciente[3], paciente[4], paciente[5],
								paciente[6], paciente[7], enfermedades, medicos));
					}

					l = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void mostrarContenido() {
		for (Paciente paciente : pacientes) {
			System.out.println(paciente.toString());
		}
	}

	public static void mostrarPacientesAnno() {
		System.out.println("Dime el año para mostrar a los pacientes");
		String anno = sc.nextLine();
		for (Paciente paciente : pacientes) {
			String[] fecha = paciente.getNacimiento().split("\\/");
			if (fecha[2].equalsIgnoreCase(anno)) {
				System.out.println(paciente.toString());
			}
		}
	}

	public static void generarArchivoAnno() {
		System.out.println("Dime el año que quieres para hacer el nuevo archivo");
		String anno = sc.nextLine();
		System.out.println("Vamos a ver si existe algun paciente con ese año");
		boolean exist = false;
		for (Paciente paciente : pacientes) {
			String[] fecha = paciente.getNacimiento().split("\\/");
			if (fecha[2].equalsIgnoreCase(anno)) {
				exist = true;

				break;
			}
		}
		System.out.println(
				exist ? "Hay un usuario que tiene ese año" : "No hay nigun usuario con ese año, no se hara el archivo");
		if (exist) {
			File arch = crearArchivo(anno);
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(arch, false));
				for (Paciente paciente : pacientes) {
					String[] fecha = paciente.getNacimiento().split("\\/");
					if (fecha[2].equalsIgnoreCase(anno)) {
						bw.write(paciente.toString());
						bw.newLine();
					}
				}
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void ficherosProvincias() {
		for (Paciente paciente : pacientes) {
			if (!provincias.contains(paciente.getProvincia())) {

			}
		}
		for (String prov : provincias) {
			String r = prov;
			File arch = crearArchivo(r);
			if (!arch.exists()) {
				try {
					arch.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(arch, false));
				for (Paciente paciente : pacientes) {
					if (paciente.getProvincia().equals(prov)) {
						bw.write(paciente.toString());
						bw.newLine();
					}
				}
				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	public static void archivoAntesdeAnno() {
		System.out.println("Dime un año para hacer un fichero con los pacientes que nacieron antes de ese año");
		String pedido = sc.nextLine();
		String anno = "antesDe" + pedido + ".txt";
		File arch = new File(anno);
		if (!arch.exists()) {
			try {
				arch.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(arch, false));
			for (Paciente pac : pacientes) {
				int fecha = Integer.valueOf(pac.getNacimiento().split("\\/")[2]);
				if (fecha <= Integer.valueOf(pedido)) {
					bw.write(pac.toString());
					bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void twoPersonFileAlone() {
		System.out.println("Dime el nombre de la primera persona");
		nombres[0] = sc.nextLine();
		System.out.println("Dime el nombre de la segunda persona");
		nombres[1] = sc.nextLine();
		File nombre1 = crearArchivo(nombres[0]);
		File nombre2 = crearArchivo(nombres[1]);
		rellenarFicheroNombre(nombre1, nombres[0]);
		rellenarFicheroNombre(nombre2, nombres[1]);
	}

	public static void casamientoFichero() {

		ArrayList<String> ambosFicheros = new ArrayList<String>();
		File nombre1 = crearArchivo(nombres[0]);
		File nombre2 = crearArchivo(nombres[1]);
		File casamiento = crearArchivo(nombres[0] + "Y" + nombres[1]);
		meterAmbosnombres(ambosFicheros, nombre1);
		meterAmbosnombres(ambosFicheros, nombre2);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(casamiento, false));
			for (String string : ambosFicheros) {
				bw.write(string);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void meterAmbosnombres(ArrayList<String> arr, File f) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			try {
				l = br.readLine();
				while (l != null) {
					arr.add(l);
					l = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	static File crearArchivo(String r) {
		File archivo = new File(r + ".txt");
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return archivo;
	}

	static void rellenarFicheroNombre(File f, String nom) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f, false));
			for (Paciente pac : pacientes) {
				if (pac.getNombre().equalsIgnoreCase(nom)) {
					bw.write(pac.toString());
					bw.newLine();
				}
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
