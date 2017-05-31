package toi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Etagere {
	
	private ArrayList<Document> listeDoc;
	private int capacite;
	
	public Etagere(int parCapacite){
		capacite = parCapacite;
		listeDoc = new ArrayList<Document>();
	}
	
	public void ajouterDoc(Document parDoc){
		if(listeDoc.size() < capacite){
			listeDoc.add(parDoc);
			parDoc.setEtagere(this);
		}
		else{
			JOptionPane joption = new JOptionPane();
			joption.showMessageDialog(null, "Capacité max atteinte", "Information ajout", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public boolean contient(Document parDoc){
		if(listeDoc.contains(parDoc))
			return true;
		else return false;
	}
	
	public ArrayList<Document> get_listeDoc(){
		return listeDoc;
	}
	
	public void triEtagere(){
		Collections.sort(listeDoc, new ComparateurDoc());
	}
	
	public String toString(){
		String chaine = "";
		Iterator iterateur = listeDoc.iterator();
		while(iterateur.hasNext()){
			chaine += ((Document)iterateur.next()).toString() + "\n";
		}
		chaine += "\n";
		return chaine;
	}

}
