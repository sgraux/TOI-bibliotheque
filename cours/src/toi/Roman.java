package toi;

public class Roman extends Livre{

	private String prixLitteraire;
	
	public Roman(int parId, String parTitre, String parAuteur, String parPrixLitteraire) {
		super(parId, parTitre, parAuteur);
		prixLitteraire = parPrixLitteraire;
	}
	
	

}
