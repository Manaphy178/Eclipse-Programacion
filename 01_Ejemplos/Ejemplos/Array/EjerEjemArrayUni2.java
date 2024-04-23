package Array;

import java.util.Scanner;

public class EjerEjemArrayUni2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

//		Solicita al usuario 5 notas de alumno y metelas en un array de enteros

		double[] notas = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Dime una nota: ");
			notas[i] = sn.nextDouble();
		}
		
//		1. Di las notas del array
//		2. Que ponga un punto al final
//		3. Que solo muestre los aprovados
		
		System.out.print("Tus notas: ");
		int pos = 0;
		for (int x = 0; x < 5; x++) {
			if (notas[x] >= 5) {
//				Esto coge la posicion del ultimo aprovado para asi poder ponerle el punto
				pos = x;
			}
		}
		
//		4. Este for es para poder ponerle los puntos y las comas
		
		for (int x = 0; x < 5; x++) {
			if (notas[x] >= 5 && x == pos) {
				System.out.print(notas[x] + ".");
			} else if (notas[x] >= 5) {
				System.out.print(notas[x] + ", ");
			}
		}
	}
}
