package toi;

import java.util.ArrayList;
import java.util.Iterator;

public class Bibliotheque {
	
	private ArrayList<Etagere> listeEtagere;

	/**
	Constructeur, instancie une arraylist d'Etagere
	 */
	public Bibliotheque(){
		listeEtagere = new ArrayList<Etagere>();
	}

	/**
	Recherche dans la arraylist un document
	@param parDoc
		Document a chercher
	@return true
		Document trouvé
	 */
	public boolean rechercheDoc(Document parDoc){
		Iterator iterateur = listeEtagere.iterator();
		while(iterateur.hasNext()){
			if(((Etagere)iterateur.next()).contient(parDoc))
				return true;
		}
		return false;
	}

	/**
	Recherche dans la arraylist si un document porte le nom d'un auteur
	@param parAuteur
		Nom de l'auteur a chercher
	@return true
		Auteur d'un document trouvé
	 */
	public boolean rechercheAuteur(String parAuteur){
		Iterator iterateur = listeEtagere.iterator();
		while(iterateur.hasNext()){
			if(((Etagere)iterateur.next()).rechercheParAuteur(parAuteur))
				return true;
		}
		return false;
	}
	/**
	Ajoute une etagere a la liste d'étagère
	@param parEtagere
		objet etagere a ajouter
	 */
	public void ajouterEtagere(Etagere parEtagere){
		listeEtagere.add(parEtagere);
	}

	/**
	Retourne la liste d'étagère
	@return
		ArrayList<Etagere> liste d'étagère
	 */
	public ArrayList<Etagere> get_listeEtagere(){
		return listeEtagere;
	}

	/**
	Ajoute un document dans une etagère precise
	@param parEtagere
		Etagere où ajouter le document
	@param parDoc
		Le document a ajouter
	 */
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
