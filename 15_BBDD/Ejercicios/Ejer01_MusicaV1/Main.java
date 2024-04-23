package Ejer01_MusicaV1;

import java.util.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static BDController controladorBD = new BDController();
	static ArrayList<Artista> artistas = new ArrayList<Artista>();
	static ArrayList<Cancion> canciones = new ArrayList<Cancion>();
	static ArrayList<Disco> discos = new ArrayList<Disco>();
	static ArrayList<Grupo> grupos = new ArrayList<Grupo>();

	public static void main(String[] args) {
		artistas = controladorBD.todosArts();
		canciones = controladorBD.todasCanciones();
		discos = controladorBD.todosDiscos();
		grupos = controladorBD.todosGrupos();
		opciones();
	}

	static int menu() {
		System.out.println("Menu" + "\n1. Listado de artistas" + "\n2. Listado de canciones" + "\n3. Listado de discos"
				+ "\n4. Listado de grupos" + "\n5. Eliminar una cancion" + "\n6. Eliminar un artista"
				+ "\n7. Insertar artista" + "\n8. Insertar cancion" + "\n9. Salir");

		return sn.nextInt();
	}

	static void opciones() {
		boolean si = true;
		String nombreC = "";
		String nombreA = "";
		String dni = "";
		int codC = 0;
		double duracionC = 0;
		do {
			switch (menu()) {
			case 1:
				for (Artista art : artistas) {
					art.mostrarDatos();
				}
				break;
			case 2:
				for (Cancion can : canciones) {
					can.mostrarDatos();
				}
				break;
			case 3:
				for (Disco disc : discos) {
					disc.mostrarDatos();
				}
				break;
			case 4:
				for (Grupo grp : grupos) {
					grp.mostrarDatos();
				}
				break;
			case 5:
				System.out.println("Dime el titulo de la cancion");
				nombreC = sc.nextLine();
				for (Cancion can : canciones) {
					if (can.getTitulo().equalsIgnoreCase(nombreC)) {
						canciones = controladorBD.borrarCancion(can.getCod());
					}
				}

				break;
			case 6:
				System.out.println("Dime el nombre del artista");
				nombreA = sc.nextLine();
				for (Artista art : artistas) {
					if (art.getNombre().equalsIgnoreCase(nombreA)) {

						artistas = controladorBD.borrarArt(art.getDni());
					}
				}

				break;
			case 7:
				System.out.println("Dime el nombre del artista");
				nombreA = sc.nextLine();
				System.out.println("Dime el DNI del artista");
				dni = sc.nextLine();
				artistas = controladorBD.altaArtista(dni, nombreA);
				break;
			case 8:
				System.out.println("Dime el titulo de la cancion");
				nombreC = sc.nextLine();
				System.out.println("Dime el codigo de la cancion");
				codC = sn.nextInt();
				System.out.println("Dime la duracion de la cancion");
				duracionC = sn.nextDouble();
				canciones = controladorBD.altaCancion(codC, nombreC, duracionC);
				break;
			case 9:

				si = false;

			default:
				System.out.println(si ? "Valor introducido incorrecto" : "Adios");
				break;
			}
		} while (si);
	}
}
