package toi;

public class Document {
	
	private int id;
	private Etagere etagere;
	private String titre;
	
	public Document(int parId, String parTitre){
		id = parId;
		titre = parTitre;
	}
	
	public void setEtagere(Etagere parEtagere){
		etagere = parEtagere;
	}
	
	public String toString(){
		return "doc n°" + id + " --- titre : " + titre;
		
	}
	
	public String getTitre(){
		return titre;
	}

}
