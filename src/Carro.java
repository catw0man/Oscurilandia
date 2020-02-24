
public class Carro {

	private int cantidadOcup; // cantidad de agentes que lleva dentro
	private String fechaingreso; //fecha de ingreso del carro
	private int ubicaciónTableroF; //Ubicación de carro en fila del tablero
	private int ubicaciónTableroC; // Ubicación de carro en columna del tablero
	
	public String toString() {
		return "Carro [cantidadOcup=" + cantidadOcup + ", fechaingreso=" + fechaingreso + ", ubicaciónTableroF="
				+ ubicaciónTableroF + ", ubicaciónTableroC=" + ubicaciónTableroC + "]";
	}

	public Carro(int cantidadOcup, String fechaingreso, int ubicaciónTableroF, int ubicaciónTableroC) {
		this.cantidadOcup = cantidadOcup;
		this.fechaingreso = fechaingreso;
		this.ubicaciónTableroF = ubicaciónTableroF;
		this.ubicaciónTableroC = ubicaciónTableroC;
	}

	public Carro() {
		
	}

	public int getCantidadOcup() {
		return cantidadOcup;
	}

	public void setCantidadOcup(int cantidadOcup) {
		this.cantidadOcup = cantidadOcup;
	}

	public String getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(String fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public int getUbicaciónTableroF() {
		return ubicaciónTableroF;
	}

	public void setUbicaciónTableroF(int ubicaciónTableroF) {
		this.ubicaciónTableroF = ubicaciónTableroF;
	}

	public int getUbicaciónTableroC() {
		return ubicaciónTableroC;
	}

	public void setUbicaciónTableroC(int ubicaciónTableroC) {
		this.ubicaciónTableroC = ubicaciónTableroC;
	}
	
	

}