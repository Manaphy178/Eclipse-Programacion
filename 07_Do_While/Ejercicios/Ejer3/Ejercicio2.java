package Ejer3;



public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=10;i++) {
			System.out.print(i);
			if (i%2==0) {
				System.out.println("");
				for(int x=0;x <500;x++) {
					System.out.print("x");
				}
			}
			
			System.out.println("");
		}
	}

}
