package Peliculas;

import java.io.*;
import java.util.*;

public class leerArchivo {

	public static ArrayList<Pelicula> leer() {
		File ar = new File("C:\\Users\\jgonzalez\\Desktop\\Eclipse\\PracticaPeliculasJSP\\peliculas.txt");
		if (!ar.exists()) {
			try {
				ar.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String l = "";
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(ar));
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
							Integer.parseInt(all[3]), all[4], all[5], all[6], all[7], actores));
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
		return pelis;
	}
}
