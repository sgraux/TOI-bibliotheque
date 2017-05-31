package toi;

public class Revues extends Document{

	private int mois;
	private int annee;
	
	public Revues(int parId, String parTitre, int parMois, int parAnnee) {
		super(parId, parTitre);
		mois = parMois;
		annee = parAnnee;
	}

}
