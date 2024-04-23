package Ejemplos;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche carro = new Coche("Dick", "Supra", "Toyota", "Rojo", 2000, 2000.5);
		carro.imprimirAtributos();

		Coche carro2 = new Coche();
		carro2.setMatricula("Pitos");
		carro2.setMarca("Mercedes");
		carro2.setColor("Azul");
		carro2.setCv(400);
		carro2.setModelo("Benz");
		carro2.setPrecio(10000);
		carro2.imprimirAtributos();
	}

}
