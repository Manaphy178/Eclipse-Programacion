package Ejer01_Animalitos;

public class Domestico extends Animal {
	private boolean mimoso;
	private String dni_propietario;

	

	

	public Domestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Domestico(String id, double altura, double peso, int edad, String especie, String apodo, String tipo) {
		super(id, altura, peso, edad, especie, apodo, tipo);
		// TODO Auto-generated constructor stub
	}

	public Domestico(String id, double altura, double peso, int edad, String especie, String apodo, String tipo,
			boolean mimoso, String dni_propietario) {
		super(id, altura, peso, edad, especie, apodo, tipo);
		this.mimoso = mimoso;
		this.dni_propietario = dni_propietario;
	}

	public boolean isMimoso() {
		return mimoso;
	}

	public String getDni_propietario() {
		return dni_propietario;
	}

	public void setMimoso(boolean mimoso) {
		this.mimoso = mimoso;
	}

	public void setDni_propietario(String dni_propietario) {
		this.dni_propietario = dni_propietario;
	}

	@Override
	public String toString() {
		return "Domestico [mimoso=" + mimoso + ", dni_propietario=" + dni_propietario + "]";
	}

}
