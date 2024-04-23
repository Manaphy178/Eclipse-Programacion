package Ejer01;
import java.util.*;
import java.io.*;
public class Ejercicio01 {

static Scanner sn= new Scanner (System.in);
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
	System.out.println("Dime el fichero que deseas");
	File archivo= new File(sc.nextLine());
	if (archivo.exists()) {
		System.out.println("El archivo ya existe");
	}else {
		System.out.println("El archivo no existe. Vamos a crearlo");
		try {
			archivo.createNewFile();
			System.out.println("El archivo ha sido creado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
