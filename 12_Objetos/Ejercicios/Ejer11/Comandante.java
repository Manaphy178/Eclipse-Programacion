package Ejer11;

public class Comandante {

	private String nombre;
	private String apellido;
	private int telefono;
	private String id;
	private int edad;
	private String rango;

	public Comandante() {

	}

	public Comandante(String nombre, String apellido, int tlf, String id, int edad, String rango) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = tlf;
		this.edad = edad;
		this.rango = rango;
	}

	public Comandante(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public void mostrarDatos() {
		System.out.println("*****************************");
		System.out.println("* Nombre y Apellido: " + this.nombre + " " + this.apellido);
		System.out.println("* ID: " + this.id);
		System.out.println("* Edad: " + this.edad);
		System.out.println("* Rango: " + this.rango);
		System.out.print("* Disponible: ");
		if (Disponible(this.id)) {
			System.out.print("Si");

		} else {
			System.out.print("No");
		}
		System.out.println("\n*****************************");

	}

	@Override
	public String toString() {
		return "*****************************" + "\n* Nombre y Apellido: " + this.nombre + " " + this.apellido
				+ "\n* ID: " + this.id + "\n* Edad: " + this.edad + "\n* Rango: " + this.rango + "\n*"
				+ "*****************************";
	}

	public boolean sameRango(int rang) {
		String aux = "";
		for (int i = 0; i < this.rango.length(); i++) {
			if (Character.isDigit(this.rango.charAt(i))) {
				aux += this.rango.charAt(i);
				if (i != this.rango.length() - 1) {
					aux += this.rango.charAt(i + 1);
				}
				break;
			}
		}
		int num = Integer.parseInt(aux);
		if (num == rang) {
			return true;
		} else {
			return false;
		}
	}

	public boolean Disponible(String id) {
		for (int i = 0; i < Main.aviones.size(); i++) {
			if (Main.aviones.get(i).getComandante().getId().equalsIgnoreCase(id)) {
				return false;
			}
		}
		return true;
//		Quiero hacer que busque en aviones el id del comandante y poner si tiene un avion asgignado o no
	}
}