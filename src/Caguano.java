package Oscurilandia;


public class Caguano extends Carro {
	
	private int alcanceTiro; // alcance de tiro del Caguano	
	private String ColorConfetti; //color del confeti que tira
	
	public Caguano() {
		super();		
	}
	
	public Caguano(int cantidadOcup, String fechaingreso, int ubicaciónTableroF, int ubicaciónTableroC, int alcanceTiro, String colorConfetti) {		
		super(cantidadOcup, fechaingreso, ubicaciónTableroF, ubicaciónTableroC);		
		this.alcanceTiro = alcanceTiro;		
		this.ColorConfetti = colorConfetti;
	}

	public int getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfetti() {
		return ColorConfetti;
	}

	public void setColorConfetti(String colorConfetti) {
		ColorConfetti = colorConfetti;
	}
	public obtenercaguanos(){
	Caguano[] caguanos= new Caguano[5];
	caguanos[0] = 3, "3 de febrero del 2016", 3, 4, 5,"blanco";
	caguanos[1] = 4, "3 de marzo del 2013", 2, 3, 5,"rosado";
	caguanos[2] = 3, "15 de febrero del 2016", 1, 7, 3,"blanco";
	caguanos[3] = 2, "3 de febrero del 2012", 8, 12, 5,"verde";
	caguanos[4] = 3, "3 de abril del 2001", 5, 4, 2,"blanco";
	return caguanos;
		
	}

}
