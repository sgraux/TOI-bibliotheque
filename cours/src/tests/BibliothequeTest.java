package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import toi.Bibliotheque;
import toi.Etagere;

public class BibliothequeTest {

	@Test
	public void ajouterEtagere() {
		Bibliotheque b = new Bibliotheque();
		Etagere e= new Etagere(2);
		ArrayList<Etagere> ar = new ArrayList<Etagere>();
		
		ar.add(e);
		b.ajouterEtagere(e);
		
		assertEquals(b.get_listeEtagere(), ar);
	}

}
