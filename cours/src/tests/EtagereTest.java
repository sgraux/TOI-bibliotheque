package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import toi.Document;
import toi.Etagere;


public class EtagereTest {

	@Test
	public void testAjouteDoc() {
		Document d=new Document(2,"cc");
		ArrayList<Document> ar = new ArrayList<Document>();
		
		Etagere e = new Etagere(2);
		
		ar.add(d);
		e.ajouterDoc(d);
		
		assertEquals(e.get_listeDoc(), ar);
	}

}
