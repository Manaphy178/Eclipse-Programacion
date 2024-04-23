package Ejer01_Animalitos;

import java.util.*;
import java.io.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Animal> animales = new ArrayList<Animal>();
	static String ruta = "Zoo.txt";
	static File zoo = new File(ruta);

	public static void main(String[] args) {
		if (!zoo.exists()) {
			try {
				zoo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void volcarArchivo(File zoo) {
		String l = "";
		String id = "";
		double altura = 0;
		double peso = 0;
		int edad = 0;
		String especie = "";
		String apodo = "";
		String tipo = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(zoo));
			try {
				l = br.readLine();
				while (l != null) {
					String[] animal = l.split("\\$\\$");
					id = animal[0];
					altura = Double.valueOf(animal[1]);
					peso = Double.valueOf(animal[2]);
					edad = Integer.valueOf(animal[3]);
					especie = animal[4];
					apodo = animal[5];
					tipo = animal[6];
					if (tipo.equalsIgnoreCase("domestico")) {
						boolean mimoso = true;
						if (animal[7].toLowerCase().contains("no")) {
							mimoso = false;
						} else {
							mimoso = true;
						}

						String dni = animal[8];
						animales.add(crearDomestico(id, altura, peso, edad, especie, apodo, tipo, mimoso, dni));
					} else if (tipo.equalsIgnoreCase("salvaje")) {
						int fuerza = Integer.valueOf(animal[7]);
						String habitat = animal[8];
						animales.add(crearSalvaje(id, altura, peso, edad, especie, apodo, tipo, fuerza, habitat));
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void altaAnimal() {
		System.out.println("Dime el id del animal para ver si esta o no");
		String id = sc.nextLine();
		String tipo = "";
		boolean mimoso = true;
		boolean si = true;
		if (!existeAnimal(id)) {
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
			do {
				System.out.println("Que tipo de animal es (salvaje/domestico)");
				tipo = sc.nextLine().toLowerCase().trim();
				if (tipo.equalsIgnoreCase("domestico") || tipo.equalsIgnoreCase("salvaje")) {
					si = false;
				} else {
					System.out.println("El animal tiene que ser salvaje o domestico");
				}
			} while (si);

			switch (tipo) {
			case "domestico":
				System.out.println("El animal es mimoso? (si/no)");
				String res = sc.nextLine().trim();
				if (res.equalsIgnoreCase("si")) {
					mimoso = true;
				} else if (res.equalsIgnoreCase("no")) {
					mimoso = false;
				} else {
					System.out.println("La respuesta dada no ha sido si o no, se pondra como que el animal es mimoso");
				}
				System.out.println("Dime el DNI del propietario");
				String dni = sc.nextLine();
				animales.add(crearDomestico(id, altura, peso, edad, especie, apodo, tipo, mimoso, dni));
				break;
			case "salvaje":
				System.out.println("Dime la fuerza del animal");
				int fuerza = sn.nextInt();
				System.out.println("Dime el habitat del animal");
				String habitat = sc.nextLine();
				animales.add(crearSalvaje(id, altura, peso, edad, especie, apodo, tipo, fuerza, habitat));
				break;

			default:
				break;
			}
		}
	}

	static Domestico crearDomestico(String id, double altura, double peso, int edad, String especie, String apodo,
			String tipo, boolean mimoso, String dni) {
		Domestico animal = new Domestico(id, altura, peso, edad, especie, apodo, tipo, mimoso, dni);
		return animal;
	}

	static Salvaje crearSalvaje(String id, double altura, double peso, int edad, String especie, String apodo,
			String tipo, int fuerza, String habitat) {
		Salvaje animal = new Salvaje(id, altura, peso, edad, especie, apodo, tipo, fuerza, habitat);
		return animal;
	}

	static boolean existeAnimal(String id) {
		boolean noEsta = false;
		for (Animal animal : animales) {
			if (animal.getId().equalsIgnoreCase(id)) {
				noEsta = true;
				break;
			}
		}
		System.out.println(noEsta ? "El id del animal esta en nuestro registro"
				: "El animal no esta en nuestro registros, vamos a registrarlo");
		return noEsta;
	}
}
