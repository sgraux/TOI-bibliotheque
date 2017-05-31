package toi;

import java.util.ArrayList;
import java.util.Iterator;

public class Bibliotheque {
	
	private ArrayList<Etagere> listeEtagere;
	
	public Bibliotheque(){
		listeEtagere = new ArrayList<Etagere>();
	}
	
	public boolean rechercheDoc(Document parDoc){
		Iterator iterateur = listeEtagere.iterator();
		while(iterateur.hasNext()){
			if(((Etagere)iterateur.next()).contient(parDoc))
				return true;
		}
		return false;
	}
	
	public void ajouterEtagere(Etagere parEtagere){
		listeEtagere.add(parEtagere);
	}
	
	public void ajouterDocDans(Etagere parEtagere, Document parDoc){
		Iterator iterateur = listeEtagere.iterator();
		Etagere etagereTemp;
		while(iterateur.hasNext()){
			etagereTemp = ((Etagere)iterateur.next());
			if( etagereTemp == parEtagere){
				etagereTemp.ajouterDoc(parDoc);
			}
		}
	}
	
	public String toString(){
		String chaine = "";
		Iterator iterateur = listeEtagere.iterator();
		while(iterateur.hasNext()){
			chaine += ((Etagere)iterateur.next()).toString();
		}
		return chaine;
	}

}
