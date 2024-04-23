package Ejer08_PacienteV2;

import java.util.*;

public class Paciente {
	private int id_paciente;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String localidad;
	private String provincia;
	private String telefono;
	private String nacimiento; // DD/MM/AAAA
	private ArrayList<String> enfermedades;
	private ArrayList<String> medicos;

	public Paciente() {
		super();
	}

	public Paciente(int id_paciente, String nombre, String apellidos, String direccion, String localidad,
			String provincia, String telefono, String nacimiento, ArrayList<String> enfermedades,
			ArrayList<String> medicos) {
		super();
		this.id_paciente = id_paciente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.telefono = telefono;
		this.nacimiento = nacimiento;
		this.enfermedades = enfermedades;
		this.medicos = medicos;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public ArrayList<String> getEnfermedades() {
		return enfermedades;
	}

	public ArrayList<String> getMedicos() {
		return medicos;
	}

	public void setEnfermedades(ArrayList<String> enfermedades) {
		this.enfermedades = enfermedades;
	}

	public void setMedicos(ArrayList<String> medicos) {
		this.medicos = medicos;
	}

	@Override
	public String toString() {

		String linea = id_paciente + "|" + nombre + "|" + apellidos + "|" + direccion + "|" + localidad + "|" + telefono
				+ "|" + nacimiento + "|";
		Iterator<String> illness = enfermedades.iterator();
		while (illness.hasNext()) {
			String malo = (String) illness.next();
			if (illness.hasNext()) {
				linea += malo + ",";
			} else {
				linea += malo;
			}

		}
		linea += "|";
		for (Iterator<String> medic = medicos.iterator(); medic.hasNext();) {
			String med = (String) medic.next();
			if (medic.hasNext()) {
				linea += med + ",";
			} else {
				linea += med;
			}

		}
		return linea;
	}

}
