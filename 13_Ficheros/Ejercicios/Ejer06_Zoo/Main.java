package Ejer06_Zoo;

import java.util.*;
import java.io.*;

public class Main {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Animal> animales = new ArrayList<Animal>();
	static int pos = 0;
	static String ruta = "Zoo.txt";

	public static int menu() {
		System.out.println("\nMENU");
		System.out.println("0. Ver lista");
		System.out.println("1. Dar de alta a un animal");
		System.out.println("2. Dar de baja un animal");
		System.out.println("3. Modificar datos de animal");
		System.out.println("4. Listado de los animales por peso");
		System.out.println("5. Listado de los animales ordenados por apodo alfabeticamente");
		System.out.println("6. Salir");
		System.out.println("Escoge una opcion");
		return sn.nextInt();
	}

	public static void opciones() {
		boolean si = true;
		do {
			switch (menu()) {
			case 0:
				verLista();
				break;
			case 1:
				altaPet();
				escribirNuevo(ruta);
				break;
			case 2:
				bajaPet();
				escribirNuevo(ruta);
				break;
			case 3:
				modAnimal();
				escribirNuevo(ruta);
				break;
			case 4:
				listPeso();
				break;
			case 5:
				listAlfab();
				break;
			case 6:
				si = false;

			default:
				System.out.println(si ? "Opcion introducida invalida" : "Se va a salir del programa");
				break;
			}
		} while (si);
		System.out.println("Chaooo");
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
		escribirNuevo(ruta);
	}

	public static void volcarArchivo(File archivo) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			try {
				l = br.readLine();
				while (l != null) {
					boolean mimoso = true;
					if (l.split("\\$\\$")[8].toUpperCase().contains("NO")) {
						mimoso = false;
					}
					animales.add(new Animal(l.split("\\$\\$")[0], Double.valueOf(l.split("\\$\\$")[1]),
							Double.valueOf(l.split("\\$\\$")[2]), Integer.valueOf(l.split("\\$\\$")[3]),
							l.split("\\$\\$")[4], l.split("\\$\\$")[5], l.split("\\$\\$")[6], l.split("\\$\\$")[7],
							mimoso, l.split("\\$\\$")[9], l.split("\\$\\$")[10]));
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

	public static void escribirNuevo(String archivo) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			for (Animal animal : animales) {
				bw.write(animal.toString());
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void altaPet() {
		System.out.println("Dime el id del animal para buscar si esta en el registro");
		String id = sc.nextLine();
		if (existeAnimal(id) == false) {
			animales.add(pedirAtributos(id));
			System.out.println("Se ha dado de alta el animal");
		}
	}

	public static void bajaPet() {
		System.out.println("Dime el id del animal para darle de baja");
		String id = sc.nextLine();
		if (existeAnimal(id)) {
			boolean baja = false;
			Iterator<Animal> it = animales.iterator();
			while (it.hasNext()) {
				Animal cod = it.next();
				if (cod.getId().equalsIgnoreCase(id)) {
					it.remove();
					baja = true;
					break;
				}
			}
			System.out.println(
					baja ? "Se ha dado de baja al animal" : "Ha habido un problema y no se le ha podido dar de baja");
		}
	}

	public static void modAnimal() {
		System.out.println("Dime el id del animal para modificar sus datos");
		String id = sc.nextLine();
		if (existeAnimal(id)) {
			animales.set(pos, pedirAtributos(id));
			System.out.println("Se ha modificado los datos del animal");
		}
	}

	public static void listPeso() {
		System.out.println("Se mostrara los animales ordenados por peso de mayor a menor");
		double[] orden = ordenPesos();
		for (int i = 0; i < orden.length; i++) {
			for (Animal a : animales) {
				if (orden[i] == a.getPeso()) {
					a.datos();
					;
				}
			}
		}
	}

	public static void listAlfab() {
		System.out.println("Se mostrara los animales ordenados alfabeticamente por apodo");
		String[] apodos = ordenAlfb();
		for (int i = 0; i < apodos.length; i++) {
			for (Animal a : animales) {
				if (apodos[i].equalsIgnoreCase(a.getApodo())) {
					a.datos();
				}
			}
		}
	}

	static void verLista() {
		for (Animal animal : animales) {
			animal.datos();
		}
	}

	static double[] ordenPesos() {
		double[] pesos = new double[animales.size()];
		for (int i = 0; i < pesos.length; i++) {
			pesos[i] = Double.valueOf(animales.get(i).getPeso());
		}
		double num = 0;
		for (int i = 0; i < pesos.length; i++) {
			for (int x = i + 1; x < pesos.length; x++) {
				if (pesos[x] > pesos[i]) {
					num = pesos[i];
					pesos[i] = pesos[x];
					pesos[x] = num;
				}
			}
		}
		return pesos;
	}

	static String[] ordenAlfb() {
		String[] orden = new String[animales.size()];
		for (int i = 0; i < orden.length; i++) {
			orden[i] = animales.get(i).getApodo().toUpperCase();
		}
		for (int i = 0; i < orden.length; i++) {
			for (int j = i + 1; j < orden.length; j++) {
				if (orden[i].compareTo(orden[j]) > 0) {
					String aux = orden[i];
					orden[i] = orden[j];
					orden[j] = aux;
				}
			}

		}

		return orden;
	}

	static Animal pedirAtributos(String id) {
		System.out.println("Dime la altura del animal");
		double altura = sn.nextDouble();
		System.out.println("Dime el peso del animal");
		double peso = sn.nextDouble();
		System.out.println("Dime la edad del animal");
		int edad = sn.nextInt();
		System.out.println("Dime la especie del animal");
		String especie = sc.nextLine();
		System.out.println("Cual es el apodo del animal");
		String apodo = sc.nextLine();
		System.out.println("Que tipo de animal es (salvaje/domestico)");
		String tipo = sc.nextLine();
		System.out.println("Dime el nivel de fuerza del animal (bajo/medio/alto)");
		String nivelFuerza = sc.nextLine();
		System.out.println("El animal es mimoso?(si/no)");
		boolean mimoso = false;
		switch (sc.nextLine().toUpperCase()) {
		case "SI":
			mimoso = true;
			break;
		case "NO":
			mimoso = false;
			break;
		default:
			System.out.println("La respuesta no ha sido si o no, se le pondra como NO cariñoso");
			mimoso = false;
			break;
		}
		System.out.println("Que sonido emite");
		String sonido = sc.nextLine();
		System.out.println("Quien es su propietario");
		String propietario = sc.nextLine();
		Animal nuevo = new Animal(id, altura, peso, edad, especie, apodo, tipo, nivelFuerza, mimoso, sonido,
				propietario);
		return nuevo;
	}

	static boolean existeAnimal(String id) {
		boolean noEsta = false;
		pos = 0;
		for (Animal animal : animales) {
			if (animal.getId().equalsIgnoreCase(id)) {
				noEsta = true;
				break;
			}
			pos++;
		}
		System.out.println(noEsta ? "El id del animal esta en nuestro registro"
				: "El animal no esta en nuestro registros, vamos a registrarlo");
		return noEsta;
	}

}
