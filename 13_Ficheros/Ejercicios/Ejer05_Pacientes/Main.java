package Ejer05_Pacientes;

import java.util.*;
import java.io.*;

public class Main {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "Pacientes.txt";
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
				System.out.println("Archivo creado");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		volcarArchivo(archivo);
		opciones();
	}

	public static void volcarArchivo(File archivo) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				l = br.readLine();
				while (l != null) {
					pacientes.add(new Paciente(Integer.valueOf(l.split("\\|")[0]), l.split("\\|")[1], l.split("\\|")[2],
							l.split("\\|")[3], l.split("\\|")[4], l.split("\\|")[5], Integer.valueOf(l.split("\\|")[6]),
							l.split("\\|")[7]));
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

	public static int menu() {
		System.out.println("\n\tMENU");
		System.out.println("1. Mostrar el contenido del fichero");
		System.out.println("2. Mostrar el contenido de pacientes nacidos el 24/01/1980");
		System.out.println("3. Mostrar el contenido de pacientes nacidos en Madrid");
		System.out.println("4. Mostrar numero de pacientes nacidos antes del 1960");
		System.out.println("5. Mostrar el codigo de los pacientes llamados Ana");
		System.out.println("6. Mostrar nombre completo si nacio en provincia introducida");
		System.out.println("7. Mostrar codigo y telefono si nacio en provincia introducida");
		System.out.println("8. Mostrar nombre completo de los pacientes nacidos el año mas antiguo");
		System.out.println("9. Mostrar nombre completo si codigo postal es el mismo que el del Centro Nelson");
		System.out.println("10. Salir");
		System.out.println("Elija una opcion");
		return sn.nextInt();
	}

	public static void opciones() {
		boolean si = true;
		do {
			switch (menu()) {
			case 1:
				mostrarTodo();
				break;
			case 2:
				mostrarNacidoEnFecha();
				break;
			case 3:
				nacidosMadrid();
				break;
			case 4:
				nacidosAntesDe();
				break;
			case 5:
				pacienteAna();
				break;
			case 6:
				nomApeProvincia();
				break;
			case 7:
				codTelProvincia();
				break;
			case 8:
				annoMasAntiguo();
				break;
			case 9:
				cpNelson();
				break;
			case 10:
				si = false;

			default:
				System.out.println(si ? "Numero introducido invalido" : "Usted va a salir del programa");
				break;
			}
		} while (si);
		System.out.println("Adioooooos");
	}

	/**
	 * Mostrar todo el contido del fichero/Array
	 */
	public static void mostrarTodo() {
		for (Paciente paciente : pacientes) {
			System.out.println(paciente.toString());
		}
	}

	/**
	 * Mostrar los pacientes nacidos el 24/01/1980
	 */
	public static void mostrarNacidoEnFecha() {
		String[] fecha = { "24", "01", "1980" };
		for (Paciente paciente : pacientes) {
			boolean same = true;
			String[] nacimiento = paciente.getNacimiento().split("/");
			for (int i = 0; i < fecha.length; i++) {
				if (!fecha[i].equalsIgnoreCase(nacimiento[i])) {
					same = false;
				}
			}
			System.out.print(same ? "\n" + paciente.toString() : "");
		}
	}

	/**
	 * Mostrar los pacientes nacidos en Madrid
	 */
	public static void nacidosMadrid() {
		for (Paciente paciente : pacientes) {
			if (paciente.getPoblacion().equalsIgnoreCase("Madrid")) {
				System.out.println(paciente.toString());
			}
		}
	}

	/**
	 * Mostrar el numero de pacientes nacidos antes del 1960
	 */
	public static void nacidosAntesDe() {
		for (Paciente paciente : pacientes) {
			int anno = Integer.valueOf(paciente.getNacimiento().split("/")[2]);
			if (anno <= 1960) {
				System.out.println(paciente.toString());
			}
		}
	}

	/**
	 * Mostrar datos de la paciente que se llame Ana
	 */
	public static void pacienteAna() {
		for (Paciente paciente : pacientes) {
			if (paciente.getNombre().equalsIgnoreCase("ana")) {
				System.out.println(paciente.toString());
			}
		}
	}

	/**
	 * Mostrar nombre y apellido si tiene la misma provincia que la introducida
	 */
	public static void nomApeProvincia() {
		System.out.println("Dime la provincia deseada");
		String provi = sc.nextLine();
		for (Paciente paciente : pacientes) {
			if (paciente.getPoblacion().equalsIgnoreCase(provi)) {
				paciente.nombreCompleto();
			}
		}
	}

	/**
	 * Mostrar codigo y telefono del paciente si tiene la misma provincia que la
	 * introducida
	 */
	public static void codTelProvincia() {
		System.out.println("Dime la provincia deseada");
		String provi = sc.nextLine();
		for (Paciente paciente : pacientes) {
			if (paciente.getPoblacion().equalsIgnoreCase(provi)) {
				paciente.codigoTelefono();
			}
		}
		;
	}

	/**
	 * Mostrar los pacientes con el año mas antiguo
	 */
	public static void annoMasAntiguo() {
		int antiguo = annoAntiguo();
		for (Paciente paciente : pacientes) {
			if (Integer.valueOf(paciente.getNacimiento().split("/")[2]) == antiguo) {
				paciente.nombreCompleto();
			}
		}
	}

	static int annoAntiguo() {
		int[] annos = new int[pacientes.size()];
		for (int i = 0; i < annos.length; i++) {
			annos[i] = Integer.valueOf(pacientes.get(i).getNacimiento().split("/")[2]);
		}
		int num = 0;
		for (int i = 0; i < annos.length; i++) {
			for (int x = i + 1; x < annos.length - 1; x++) {
				if (annos[x] < annos[i]) {
					num = annos[i];
					annos[i] = annos[x];
					annos[x] = num;
				}
			}
		}
		return annos[0];
	}

	/**
	 * Muestra los pacientes con el mismo codigo postal que le nelson
	 */
	public static void cpNelson() {
		int nelson = 28015;
		for (Paciente paciente : pacientes) {
			if (paciente.getCod() == nelson) {
				paciente.nombreCompleto();
			}
		}
	}
}
