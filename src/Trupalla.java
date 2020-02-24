
public class Trupalla extends Carro{
	
	public int getNivelArm() {
		return NivelArm;
	}

	public void setNivelArm(int nivelArm) {
		NivelArm = nivelArm;
	}

	public String getNombrePiloto() {
		return NombrePiloto;
	}

	public void setNombrePiloto(String nombrePiloto) {
		NombrePiloto = nombrePiloto;
	}

	private int NivelArm; // nivel de la armadura (1-5)
	
	private String NombrePiloto; // Nombre de quien conduce la Trupalla
	
	public Trupalla(int cantidadOcup, String fechaingreso, int ubicaci�nTableroF, int ubicaci�nTableroC, int nivelArm,
			String nombrePiloto) {
		
		super(cantidadOcup, fechaingreso, ubicaci�nTableroF, ubicaci�nTableroC);
		
		NivelArm = nivelArm;
		
		NombrePiloto = nombrePiloto;
	}
	
	public Trupalla() {
	
		super();
	}
	
}
