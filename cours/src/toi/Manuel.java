package toi;

public class Manuel extends Livre{

	private int niveauScolaire;
	
	public Manuel(int parId, String parTitre, String parAuteur, int parNiveau) {
		super(parId, parTitre, parAuteur);
		niveauScolaire = parNiveau;
	}
	
	

}
