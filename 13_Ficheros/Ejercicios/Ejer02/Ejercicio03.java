package Ejer02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			int cont = 0;
			for (String age : edad) {
				if (prime(Integer.parseInt(age))) {
					cont++;
				}
			}
			System.out.println("Hay " + cont + " personas que tienen edades primas");
		}
	}

	static boolean prime(int input) {
		boolean prime = true;

		if (input < 2) {
			prime = false;
		} else {
			for (int j = 2; j <= Math.sqrt(input); j++) {
				if (input % j == 0) {
					prime = false;
					break;
				}
			}
		}

		return prime;
	}

}
