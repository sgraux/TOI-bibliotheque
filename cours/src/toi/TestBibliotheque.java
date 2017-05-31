package toi;

public class TestBibliotheque {
	
	public static void main(String []args){
		
		Bibliotheque maBibli = new Bibliotheque();
		
		Etagere etagere1 = new Etagere(10);
		Etagere etagere2 = new Etagere(5);
		Etagere etagere3 = new Etagere(7);
		
		maBibli.ajouterEtagere(etagere1);
		maBibli.ajouterEtagere(etagere2);
		maBibli.ajouterEtagere(etagere3);
		
		Livre livre1 = new Livre(1,"ddd","jean");
		Livre livre2 = new Livre(2,"aab","jean");
		Livre livre3 = new Livre(3,"aaa","jean");
		Livre livre4 = new Livre(4,"ddc","jean");
		Manuel manuel = new Manuel(5,"manuel", "pierre", 2);
		
		Roman roman1 = new Roman(6,"don't dribble","jacques","Goncours");
		
		
		maBibli.ajouterDocDans(etagere1, livre1);
		maBibli.ajouterDocDans(etagere1, livre2);
		maBibli.ajouterDocDans(etagere1, livre3);
		maBibli.ajouterDocDans(etagere1, livre4);
		
		maBibli.ajouterDocDans(etagere2, manuel);
		
		System.out.println("---------------------------- PAS DE TRI -----------------------------");
		System.out.println(maBibli.toString());
		etagere1.triEtagere();
		System.out.println("---------------------------- AVEC TRI -----------------------------");
		System.out.println(maBibli.toString());
		
		//System.out.println(maBibli.rechercheAuteur("jean"));
		
		
		System.out.println(livre1.imprimer());
		System.out.println(roman1.imprimer());
		
		System.out.println(etagere1.imprimer());


		
		
		
	}

}
