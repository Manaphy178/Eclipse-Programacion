package Ejemplo;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ruta = "archivo.html";
		File archivo = new File(ruta);
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			bw.write("<HTML>" + "<body>" + "<h1>" + "Hola que tal estas" + "</h1>" + "</body>" + "</HTML>");
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
