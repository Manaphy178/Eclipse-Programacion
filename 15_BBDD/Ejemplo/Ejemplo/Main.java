package Ejemplo;

/*
 * Aqui haremos el programa, no se hacen ni consultas ni nada en el main
 */
import java.util.*;
public class Main {
static Scanner sn= new Scanner (System.in);
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		BDController controladorBD = new BDController();
//		ArrayList<String> nombresOpo = new ArrayList<String>();
//		nombresOpo=controladorBD.nombresOpo();
//		for (String c : nombresOpo) {
//			System.out.println(c);
//		}
		ArrayList<Opositor> opositores = new ArrayList<Opositor>();
//		opositores= controladorBD.todosOpo();
//		for (Opositor ops : opositores) {
//			ops.mostrarDatos();
//		}
//		controladorBD.altaOpoistor("jorge", "909808a", "Madrid", "629544463");
		Opositor opo = new Opositor("mario", "909808a", "Cercedilla", "123456789");
		controladorBD.modificarOpositor(opo);
		opositores =controladorBD.opositroNomCiuPreparada("IVAN", "Madrid");
		System.out.println("a");
	}

}
