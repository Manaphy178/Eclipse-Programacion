package Ejer04_MusicaV4;

import java.util.*;
import java.io.*;

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
		System.out.println("\nMenu");
		System.out.println("1. Listado de artistas" + "\n2. Listado de canciones" + "\n3. Listado de discos"
				+ "\n4. Listado de grupos" + "\n5. Listado de artistas con letra pedida" + "\n6. Eliminar una cancion"
				+ "\n7. Eliminar un artista" + "\n8. Insertar artista" + "\n9. Insertar grupo"
				+ "\n10. Inserta artista en grupo" + "\n11. Insertar cancion en un disco"
				+ "\n12. Eliminar artista de un grupo");
		System.out.println("13. Mostrar en pantalla cancion mas larga" + "\n14. Listado de canciones con menor duracion"
				+ "\n15. Listado de canciones de un disco"
				+ "\n16. Generar un archivo de texto con canciones de grupo");
		System.out.println(
				"17. Listado de nombre de artistas de grupo" + "\n18. Mostrar titulos de discos con mas de 6 canciones"
						+ "\n19. Listado de canciones que no esten en discos"
						+ "\n20. Listado de artistas que no esten en un grupo");
		System.out.println("21. Salir");

		return sn.nextInt();
	}

	static void opciones() {
		boolean si = true;
		boolean esta = true;
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
		double duracionC = 0;
		do {
			esta = false;
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
				controladorBD.devolverCancionLarga(canciones);
				break;
			case 14:
				System.out.println("Dime una duracion y mostrare las canciones con menor duracion a esa");
				duracionC = sn.nextDouble();
				ArrayList<Cancion> songOrden = controladorBD.listadoCanciones(duracionC);
				for (Cancion can : songOrden) {
					can.mostrarDatos();
				}
				break;
			case 15:
				mostrarDisc();
				System.out.println("Dime el nombre del disco");
				nomDisc = sn.nextLine().trim();
				for (Disco disc : discos) {
					if (disc.getNombre().equalsIgnoreCase(nomDisc)) {
						codD = disc.getCod();
						esta = true;
						break;
					}
				}
				if (esta) {
					ArrayList<Cancion> discSongs = controladorBD.listadoSongDisc(codD);
					for (Cancion cancion : discSongs) {
						cancion.mostrarDatos();
					}
				}
				break;
			case 16:
				mostrarGrup();
				System.out.println("Dime el nombre del grupo");
				nombreG = sc.nextLine().trim();
				archivoGrupo(nombreG);
				break;

			case 17:
				mostrarGrup();
				System.out.println("Dime el nombre del grupo");
				nombreG = sc.nextLine().trim();
				codG = sacarCodGrup(nombreG);
				ArrayList<String> artsNom = controladorBD.listadoArts(codG);
				System.out.println("Los artistas del grupo " + nombreG + " son:");
				for (String string : artsNom) {
					System.out.println(string);
				}
				break;
			case 18:
				ArrayList<Disco> grtSixDisc = controladorBD.greaterSix();
				System.out.println("Estos son los discos con 6 o mas canciones");
				for (Disco disco : grtSixDisc) {
					System.out.println(disco.getNombre());
				}
				break;
			case 19:
				System.out.println("Estos son los discos que no estan en ningun disco");
				ArrayList<String> noDiscSong = controladorBD.noDisc();
				for (String string : noDiscSong) {
					System.out.println(string);
				}
				break;
			case 20:
				System.out.println("Estos son los artistas que no estan en un grupo");
				ArrayList<String> artsNoGrup = controladorBD.noGrupArt();
				for (String string : artsNoGrup) {
					System.out.println(string);
				}
				break;
			case 21:

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

	private static void archivoGrupo(String nombre) {
		String codG = sacarCodGrup(nombre);
		File arch = new File(nombre + ".txt");
		if (!arch.exists()) {
			try {
				arch.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ArrayList<String> canc = controladorBD.grupArch(codG);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(arch, false));
			bw.write(nombre);
			bw.newLine();
			bw.write("Canciones:");
			bw.newLine();
			for (String ca : canc) {
				bw.write(ca);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
