package Ejer01;

import java.io.*;

public class Ejercicio03 {

	public static void main(String[] args) {
		File f = new File("temp");
		if (f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		File temporal = f.getAbsoluteFile().getParentFile();
		f.delete();
		String[] archivos = temporal.list();
		for (String s : archivos) {
			System.out.println(s);
		}
	}

}
