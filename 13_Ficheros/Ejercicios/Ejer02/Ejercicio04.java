package Ejer02;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio04 {

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
		for (int i = 1; i < 101; i++) {
			int cont = 0;
			for (String age : edad) {
				if (Integer.parseInt(age) == i) {
					cont++;
				}
			}
			if (i == 1) {
				System.out.println(i + " año: " + cont + " personas");
			} else if (cont == 1) {
				System.out.println(i + " años: " + cont + " persona");
			} else {
				System.out.println(i + " años: " + cont + " personas");
			}

		}
	}
}
