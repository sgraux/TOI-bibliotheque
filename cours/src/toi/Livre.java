package toi;

public class Livre extends Document implements Imprimable{

	private String auteur;
	
	public Livre(int parId, String parTitre, String parAuteur) {
		super(parId, parTitre);
		auteur = parAuteur;
	}
	
	public String getAuteur(){
		return auteur;
	}

	@Override
	public String imprimer(){
		return "IMPRIME ---> " + toString();
	}

	
}
