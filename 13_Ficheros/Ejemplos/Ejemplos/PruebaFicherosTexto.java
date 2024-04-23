package Ejemplos;


import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class PruebaFicherosTexto {

	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Primero hay que indicar la ruta de un fichero para acceder fisicamente a él
		 * Indicamos la ruta y el nombre del archivo (El archivo siempre tiene que estar
		 * en la carpeta del proyecto, en este ejemplo seria en 01_Ejemplos)
		 */
		String ruta = "fichero1.txt";

		/*
		 * Creamos el objeto de tipo File con la ruta del fichero
		 */
		File archivo = new File(ruta);

//		/*
//		 * Comprobacion de si el archivo existe Si existe comunicamos que este existe En
//		 * caso de que no lo crearemos
//		 */
		if (archivo.exists()) {
			System.out.println("El archivo ya existe");
			System.out.println("Nombre del archivo: "+archivo.getName());
				System.out.println("Peso del archivo: "+archivo.length());
				System.out.println("Ruta Absoluta del archivo: "+archivo.getAbsolutePath());
				System.out.println("Permiso de lectura del archivo: "+archivo.canRead());
				System.out.println("Permiso de escritura del archivo: "+archivo.canWrite());
		} else {
			
			/*
			 * Creacion del archivo con createNewFile(). Utilizamos un capturador de
			 * excepciones en caso de error
			 */
			try {
//			Intenta crearlo
				archivo.createNewFile();
				System.out.println("Archivo a sido creado");

			} catch (IOException e) {
//			En caso de que no funcione el try, el catch mostrara en la consola el error (Puede ser por permisos o porque no puede o cosas asi)
				e.printStackTrace();
			}
			
			
		}

		String linea = "";
		ArrayList<String> nombres = new ArrayList<String>();
		if (archivo.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(ruta));
				try {
					linea = br.readLine();
					while (linea != null) {
						nombres.add(linea);
						System.out.print(linea + ", ");
						linea = br.readLine();
					}
					br.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		String[] codigo = new String[36];

		codigo[0] = "@echo off";
		codigo[1] = "echo   ";
		codigo[2] = "echo  ";
		codigo[3] = "echo   ";
		codigo[4] = "echo  ";
		codigo[5] = "timeout /nobreak /t 5000000000 > nul";
		String rutaGato = "gato.bat";
		File cat = new File(rutaGato);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(rutaGato, false));
			for (int i = 0; i < codigo.length; i++) {
				bw.write(codigo[i]);
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) { // TODO: handle exception
			e.printStackTrace();
		}

	}

}
