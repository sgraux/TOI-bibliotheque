package toi;

public class Dictionnaire extends Document{
	
	private String langue;

	public Dictionnaire(int parId, String parTitre, String parLangue){
		super(parId, parTitre);
		langue = parLangue;
	}

}
