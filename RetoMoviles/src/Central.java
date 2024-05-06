import java.util.*;

public class Central {
	private double consumoAct;
	private double consumoTtl;

	public Central() {

	}

	public Central(double consumoAct, double consumoTtl) {
		super();
		this.consumoAct = consumoAct;
		this.consumoTtl = consumoTtl;
	}

	public double getConsumoAct() {
		return consumoAct;
	}

	public void setConsumoAct(double consumoAct) {
		this.consumoAct = consumoAct;
	}

	public double getConsumoTtl() {
		return consumoTtl;
	}

	public void setConsumoTtl(double consumoTtl) {
		this.consumoTtl = consumoTtl;
	}

	public double actualizarConsumoActual(ArrayList<Aparato> apar) {
		this.consumoAct = 0;
		for (Aparato a : apar) {
			if (a.isEncendido()) {
				this.consumoAct += a.getWatios();
			}
		}
		return this.consumoAct;
	}

	public double actualizarConsumoTotal(ArrayList<Aparato> apar) {
		for (Aparato a : apar) {
			if (a.isEncendido()) {
				this.consumoTtl += a.getWatios();
			}
		}
		return this.consumoTtl;
	}
}
