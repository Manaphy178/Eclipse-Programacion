package Scanner;
import java.util.Scanner;

public class EjerScanner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		double sueldo = 0;
		
		
		System.out.println("Introduce tu nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce tu edad:");
		edad = sc.nextInt() + 5;
		System.out.println("Introduce tu sueldo:");
		sueldo = sc.nextDouble() * 1.1;
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años. Tienes un sueldo de " + sueldo + " euros");
	}

}
