package Ejer08_NBAV02;

import java.util.*;
import java.io.*;

public class Main2 {
	static Scanner sn = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	static BDController bd = new BDController();
	static ArrayList<Jugador> jugadores = bd.todosJugadores();
	static ArrayList<Equipo> equipos = bd.todosEquipos();
	static ArrayList<Estadistica> stats = bd.todasEstadisticas();
	static ArrayList<Partido> partidos = bd.todosPartidos();
	static String numerico = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
archEq();

	ArrayList<Partido> all = bd.todosPartidos();
	ArrayList<String> equipos = new ArrayList<String>();
	for (Partido p : all) {
		if(!equipos.contains(p.getVisitante())) {
			equipos.add(p.getVisitante());
		}
		if (!equipos.contains(p.getLocal())) {
			equipos.add(p.getLocal());

		}
	}
	int max = 0;
	String nombre= "";
	for (Partido p : all) {
		if (p.getPtn_local()>max) {
			
		}
		if(p.getPtn_visitante()>max) {
			
		}
	}
	}

	static void archEq() {
		File east = new File("East.txt");
		File west = new File("West.txt");
		if (!east.exists()) {
			try {
				east.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!west.exists()) {
			try {
				west.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			BufferedWriter est = new BufferedWriter(new FileWriter(east,false));
			BufferedWriter wst = new BufferedWriter(new FileWriter(west,false));
			for (Equipo equipo : equipos) {
				if(equipo.getConferencia().equalsIgnoreCase("East")) {
					est.write(equipo.mostrarDatos());
					est.newLine();
				}
				if(equipo.getConferencia().equalsIgnoreCase("West")) {
					wst.write(equipo.mostrarDatos());
					wst.newLine();
				}
			}
			est.close();
			wst.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	static double eficiencia(int cod) {
		ArrayList<Estadistica> stat = bd.statJugTemp(cod);
		double ef=0;
		for (Estadistica st : stat) {
			ef+=(st.getPnt_partido()+st.getRebt_partido()+st.getTapn_partido()+st.getAsist_partido())/4;
		}
		ef= ef/stat.size();
		return ef;
	}
}