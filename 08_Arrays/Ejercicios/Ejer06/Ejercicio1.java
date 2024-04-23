package Ejer06;

public class Ejercicio1 {

	public static void main(String[] args) {
		String[] partidos = { "PP", "PSOE", "CIUDADANOS", "PODEMOS", "VOX", "ERC", "JXCAT", "PNV", "EH", "CUP",
				"MASPAIS", "BNG", "PRC", "PACMA", "TERUELEXISTE" };
		String[] mad = new String[5];
		String[] cyl = new String[5];
		String[] gal = new String[5];
		String[] cat = new String[5];
		int[] votos = new int[partidos.length];
		int maxVotos = Integer.MIN_VALUE;
		String partNaci = "";
		for (int i = 0; i < mad.length; i++) {
			int ran = (int) (Math.random() * partidos.length);
			mad[i] = partidos[ran];
			ran = (int) (Math.random() * partidos.length);
			cyl[i] = partidos[ran];
			ran = (int) (Math.random() * partidos.length);
			gal[i] = partidos[ran];
			ran = (int) (Math.random() * partidos.length);
			cat[i] = partidos[ran];
		}
		System.out.println("Partidos politicos por comunidades: ");
		int maxVotosCyl = Integer.MIN_VALUE, maxVotosMad = Integer.MIN_VALUE, maxVotosCat = Integer.MIN_VALUE,
				maxVotosGal = Integer.MIN_VALUE;
		String partMad = "", partCyl = "", partGal = "", partCat = "";
		for (int i = 0; i < partidos.length; i++) {
			int cont = 0;
			for (int x = 0; x < mad.length; x++) {
				if (mad[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				votos[i] = cont;
				if (votos[i] > maxVotosMad) {
					maxVotosMad = votos[i];
					partMad = partidos[i];
				}
			}
			cont = 0;
			for (int x = 0; x < cyl.length; x++) {
				if (cyl[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				votos[i] = cont;
				if (votos[i] > maxVotosCyl) {
					maxVotosCyl = votos[i];
					partCyl = partidos[i];
				}
			}
			cont = 0;
			for (int x = 0; x < cat.length; x++) {
				if (cat[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				votos[i] = cont;
				if (votos[i] > maxVotosCat) {
					maxVotosCat = votos[i];
					partCat = partidos[i];
				}
			}
			cont = 0;
			for (int x = 0; x < gal.length; x++) {
				if (gal[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				votos[i] = cont;
				if (votos[i] > maxVotosGal) {
					maxVotosGal = votos[i];
					partGal = partidos[i];
				}
			}
		}
		System.out.println("El partido más votado de Madrid es: " + partMad + " - " + maxVotosMad + " votos.");
		System.out.println("El partido más votado de Castilla y León es: " + partCyl + " - " + maxVotosCyl + " votos.");
		System.out.println("El partido más votado de Galicia es: " + partGal + " - " + maxVotosGal + " votos.");
		System.out.println("El partido más votado de Cataluña es: " + partCat + " - " + maxVotosCat + " votos.\r");
		System.out.println("Partido ganador por Nacionalidad: ");
		for (int i = 0; i < partidos.length; i++) {
			int cont = 0;
			for (int x = 0; x < mad.length; x++) {
				if (mad[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				if (cyl[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				if (gal[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				if (cat[x].equalsIgnoreCase(partidos[i])) {
					cont++;
				}
				votos[i] = cont;
			}
		}
		for (int i = 0; i < partidos.length; i++) {
			if (votos[i] > maxVotos) {
				maxVotos = votos[i];
				partNaci = partidos[i];
			}
		}
		System.out.println(
				"El partido politico que ha ganado Nacionalmente es: " + partNaci + " - " + maxVotos + " votos.\r");
	}
}