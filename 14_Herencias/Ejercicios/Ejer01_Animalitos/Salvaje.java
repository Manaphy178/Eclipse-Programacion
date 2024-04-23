package Ejer01_Animalitos;

public class Salvaje extends Animal {
	private int fuerza;
	private String habitat;

	public Salvaje(String id, double altura, double peso, int edad, String especie, String apodo, String tipo,
			int fuerza, String habitat) {
		super(id, altura, peso, edad, especie, apodo, tipo);
		this.fuerza = fuerza;
		this.habitat = habitat;
	}

	public Salvaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salvaje(String id, double altura, double peso, int edad, String especie, String apodo, String tipo) {
		super(id, altura, peso, edad, especie, apodo, tipo);
		// TODO Auto-generated constructor stub
	}

	public int getFuerza() {
		return fuerza;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Salvaje [fuerza=" + fuerza + ", habitat=" + habitat + "]";
	}

}
