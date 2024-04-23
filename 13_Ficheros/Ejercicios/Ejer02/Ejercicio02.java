package Ejer02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Ejercicio02 {

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
		}
		int total = 0;
		for (String age : edad) {
			total += Integer.parseInt(age);
		}
		double media = total / edad.size();
		System.out.println("La media total de edades es: " + media);
	}

}
