package Ejer6;
import java.util.*;
public class ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		System.out.println("Dame una frase");
		String palabras[] = sc.nextLine().split(" ");
		
		for (int i = (palabras.length-1); i >= 0; i--) {
			System.out.print(palabras[i]+" ");
		}
	}

}
