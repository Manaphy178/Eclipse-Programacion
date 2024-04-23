package fifa;

public class Util {
	public static String clase(int dato) {
		String dat = "";
		if (dato <= 49) {
			dat = "cuadradito_rojo";
		} else if (dato >= 50 && dato <= 59) {
			dat = "cuadradito_naranja";
		} else if (dato >= 60 && dato <= 69) {
			dat = "cuadradito_amarillo";
		} else if (dato >= 70 && dato <= 89) {
			dat = "cuadradito_verde";
		} else if (dato >= 90 && dato <= 99) {
			dat = "cuadradito_verdeoscuro";
		}
		return dat;
	}
	public static String color(int dato) {
		String dat = "";
		if (dato <= 49) {
			dat = "#F44336";
		} else if (dato >= 50 && dato <= 59) {
			dat = "#FB8C00";
		} else if (dato >= 60 && dato <= 69) {
			dat = "#E9BC0B";
		} else if (dato >= 70 && dato <= 89) {
			dat = "#4CAF50";
		} else if (dato >= 90 && dato <= 99) {
			dat = "#007E33";
		}
		return dat;
	}
	public static String cartas(String nombre){
		String color="";
		if (nombre.equalsIgnoreCase("simple")){
			color="Simple";
		}else if (nombre.equalsIgnoreCase("IF")) {
			color="IF";
		}else if (nombre.equalsIgnoreCase("TOTY")) {
			color="TOTY";
		}else if (nombre.equalsIgnoreCase("MOTM")) {
			color="MOTM";
		}else if (nombre.equalsIgnoreCase("CL")) {
			color="CL";
		}
		return color;
	}
}
