package Ejer02_MusicaV2;

import java.util.*;

public class Main {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static BDController controladorBD = new BDController();
	static ArrayList<Artista> artistas = new ArrayList<>();
	static ArrayList<Cancion> canciones = new ArrayList<>();
	static ArrayList<Disco> discos = new ArrayList<>();
	static ArrayList<Grupo> grupos = new ArrayList<>();

	public static void main(String[] args) {
		artistas = controladorBD.todosArts();
		canciones = controladorBD.todasCanciones();
		discos = controladorBD.todosDiscos();
		grupos = controladorBD.todosGrupos();
		opciones();
	}

	static int menu() {
		System.out.println("Menu" + "\n1. Listado de artistas" + "\n2. Listado de canciones" + "\n3. Listado de discos"
				+ "\n4. Listado de grupos" + "\n5. Listado de artistas con letra pedida" + "\n6. Eliminar una cancion"
				+ "\n7. Eliminar un artista" + "\n8. Insertar artista" + "\n9. Insertar grupo"
				+ "\n10. Inserta artista en grupo" + "\n11. Insertar cancion en un disco"
				+ "\n12. Eliminar artista de un grupo" + "\n13. Salir");

		return sn.nextInt();
	}

	static void opciones() {
		boolean si = true;
		String nombreC = "";
		String nombreA = "";
		String nombreG = "";
		String fechaG = "";
		String paisG = "";
		String dni = "";
		String titulo = "";
		char letra = 'a';
		String nomDisc = "";
		int codC = 0;
		String codD = "";
		String codG = "";

		do {
			switch (menu()) {
			case 1:
				mostrarArt();
				break;
			case 2:
				mostrarSong();
				break;
			case 3:
				mostrarDisc();
				break;
			case 4:
				mostrarGrup();
				break;
			case 5:
				System.out.println("Dime la letra del artista");
				letra = sc.nextLine().trim().charAt(0);
				for (Artista art : artistas) {
					if (art.getNombre().charAt(0) == letra) {
						art.mostrarDatos();
					}
				}
				break;
			case 6:
				System.out.println("Dime el titulo de la cancion");
				nombreC = sc.nextLine();
				for (Cancion can : canciones) {
					if (can.getTitulo().equalsIgnoreCase(nombreC)) {
						canciones = controladorBD.borrarCancion(can.getCod());
					}
				}

				break;
			case 7:
				System.out.println("Dime el nombre del artista");
				nombreA = sc.nextLine();
				for (Artista art : artistas) {
					if (art.getNombre().equalsIgnoreCase(nombreA)) {
						artistas = controladorBD.borrarArt(art.getDni());
					}
				}

				break;
			case 8:
				System.out.println("Dime el nombre del artista");
				nombreA = sc.nextLine();
				System.out.println("Dime el DNI del artista");
				dni = sc.nextLine();
				artistas = controladorBD.altaArtista(dni, nombreA);
				break;
			case 9:
				System.out.println("Dime el codigo del grupo");
				codG = sc.nextLine();
				System.out.println("Dime el nombre del grupo");
				nombreG = sc.nextLine();
				System.out.println("Dime la fecha del grupo cuando se fundo");
				fechaG = sc.nextLine();
				System.out.println("Dime de donde es el grupo");
				paisG = sc.nextLine();
				grupos = controladorBD.altaGrupo(codG, nombreG, fechaG, paisG);
				break;
			case 10:
				mostrarArt();
				System.out.println("Dime el DNI del cantante");
				dni = sc.nextLine();
				mostrarGrup();
				System.out.println("Dime el codigo del grupo");
				codG = sc.nextLine();
				controladorBD.altaArtGrup(dni, codG);
				break;
			case 11:
				mostrarSong();
				System.out.println("Dime el titulo de la cancion");
				titulo = sc.nextLine();
				mostrarDisc();
				System.out.println("Dime el nombre del disco");
				nomDisc = sc.nextLine();
				codD = sacarCodDisco(nomDisc);
				codC = sacarCodCancion(titulo);
				controladorBD.altaDiscYSong(codD, codC);
				break;
			case 12:
				mostrarArt();
				System.out.println("Dime el nombre del artista");
				nombreA = sc.nextLine();
				dni = sacarDniArt(nombreA);
				mostrarGrup();
				System.out.println("Dime el nombre del grupo");
				nombreG = sc.nextLine();
				codG = sacarCodGrup(nombreG);
				controladorBD.sacarArtistaGrupo(dni, codG);

				break;
			case 13:

				si = false;

			default:
				System.out.println(si ? "Valor introducido incorrecto" : "Adios");
				break;
			}
		} while (si);
	}

	private static String sacarCodGrup(String nombreG) {
		String codG = "";
		for (Grupo grup : grupos) {
			if (grup.getNombre().equalsIgnoreCase(nombreG)) {
				codG = grup.getCod();
			}
		}
		return codG;
	}

	private static String sacarDniArt(String nombreA) {
		String dni = "";
		for (Artista art : artistas) {
			if (art.getNombre().equalsIgnoreCase(nombreA)) {
				dni = art.getDni();
			}
		}
		return dni;
	}

	private static void mostrarGrup() {
		System.out.println("\nGRUPOS");
		for (Grupo grp : grupos) {
			grp.mostrarDatos();
		}
	}

	private static void mostrarDisc() {
		System.out.println("\nDISCOS:");
		for (Disco disc : discos) {
			disc.mostrarDatos();
		}
	}

	private static void mostrarSong() {
		System.out.println("\nCANCIONES:");
		for (Cancion can : canciones) {
			can.mostrarDatos();
		}
	}

	private static void mostrarArt() {
		System.out.println("\nARTISTAS:");
		for (Artista art : artistas) {
			art.mostrarDatos();
		}
	}

	private static int sacarCodCancion(String titulo) {
		for (Cancion song : canciones) {
			if (song.getTitulo().equalsIgnoreCase(titulo)) {
				return song.getCod();
			}
		}
		return 0;
	}

	private static String sacarCodDisco(String nombre) {
		for (Disco disc : discos) {
			if (disc.getNombre().equalsIgnoreCase(nombre)) {
				return disc.getCod();
			}
		}
		return null;
	}

	
}
