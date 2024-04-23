package Ejer02;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio01 {

	public static void main(String[] args) {
		String linea = "";
		File edades = new File("edades.txt");
		ArrayList<String> edad = new ArrayList<String>();
		if (edades.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(edades));
				try {
					linea = br.readLine();
					while (linea != null) {
						edad.add(linea);
						System.out.println(linea);
						linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		int cont = 0;
		for (String s : edad) {
			if (Integer.parseInt(s) < 50) {
				cont++;
			}
		}
		System.out.println("Hay " + cont + " personas que tienen menos de 50 años");
	}

}
