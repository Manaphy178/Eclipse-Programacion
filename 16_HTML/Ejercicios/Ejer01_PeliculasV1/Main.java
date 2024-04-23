package Ejer01_PeliculasV1;

import java.io.*;
import java.util.*;

public class Main {
	static ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
	static ArrayList<String> directores = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "peliculas.txt";
		File arch = new File(ruta);
		if (!arch.exists()) {
			try {
				arch.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		meterPeliculas(arch);
		sacarDirectores();
		String html = "peliculas.html";
		File ar = new File(html);
		if (!ar.exists()) {
			try {
				ar.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		hacerHTML(ar);
	}

	private static void hacerHTML(File ar) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ar, false));
			bw.write("<html lang=\"en\">\n"
					+ "<head>\n"
					+ "<meta charset=\"UTF-8\" />\n"
					+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n"
					+ "<title>Peliculas</title>\n"
					+ "</head>\n"
					+ "<style type=\"text/css\">\n"
					+ "table {border-collapse: collapse;border-color: #93a1a1;border-spacing: 0;border: 1px solid;}\n"
					+ "table td {background-color: #fdf6e3;border-color: #93a1a1;border-style: solid;border-width: 1px 0px;color: #002b36;font-family: Arial, sans-serif;font-size: 14px;overflow: hidden;padding: 10px 5px;word-break: normal;}\n"
					+ "table th {background-color: #657b83;border-color: #93a1a1;border-style: solid;border-width: 1px;color: #fdf6e3;font-family: Arial, sans-serif;font-size: 14px;font-weight: normal;overflow: hidden;padding: 10px 5px;word-break: normal;}\n"
					+ "table td {border-color: #000000;text-align: center;vertical-align: top;}\n"
					+ "li {list-style: none;}\n"
					+ "</style>\n"
					+ "<body>\n"
					+ "<table>\n"
					+ "<thead>\n"
					+ "<tr>\n"
					+ "<th>Matricula</th>\n"
					+ "<th>Titulo</th>\n"
					+ "<th>Año</th>\n"
					+ "<th>Coste</th>\n"
					+ "<th>Pais</th>\n"
					+ "<th>Director</th>\n"
					+ "<th>Guionista</th>\n"
					+ "<th>Actores</th>\n"
					+ "</tr>\n"
					+ "</thead>\n"
					+ "<tbody>\n"
					);
					for (Pelicula peli : pelis) {
						bw.newLine();
						bw.write("<tr>\n" + "<td>" + peli.getMatricula() + "</td>\n" + "<td>" + peli.getTitulo()
								+ "</td>\n" + "<td>" + peli.getAnno() + "</td>\n" + "<td>" + peli.getCoste() + "</td>\n"
								+ "<td>" + peli.getPais() + "</td>\n" + "<td>" + peli.getDirector() + "</td>\n" + "<td>"
								+ peli.getGuionista() + "</td>\n" + "<td>" + peli.actor() + "</td>\n" + "</tr>\n");
					}

					bw.write("</tbody>\n" + "</table>\n");
					bw.write("<br />\n" + "<ul>\n");
					for (String director : directores) {
						bw.write("<li>" + director + "\n<ul>\n"
						);
						for (Pelicula peli : pelis) {

							if (peli.getDirector().equals(director)) {
								bw.write("<li>" + peli.getTitulo() + "</li>\n"
								);
							}
						}
						bw.write("</ul>" + "\n</li>\n");
					}
					bw.write("</ul>\n" + "</body>\n" + "</html>\n");
					bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void sacarDirectores() {
		for (int i = 0; i < pelis.size(); i++) {
			if(!directores.contains(pelis.get(i).getDirector())) {
				directores.add(pelis.get(i).getDirector());
			}
		}
	}

	private static void meterPeliculas(File arch) {
		String l = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(arch));
			try {
				l = br.readLine();
				while (l != null) {
					ArrayList<String> actores = new ArrayList<String>();
					String[] all = l.split("\\;");
					String[] acts = all[8].split("\\,");
					for (String string : acts) {
						actores.add(string);
					}
					pelis.add(new Pelicula(Integer.parseInt(all[0]), all[1], Integer.parseInt(all[2]),
							Integer.parseInt(all[3]), all[4], all[5], all[6], actores));
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

}
