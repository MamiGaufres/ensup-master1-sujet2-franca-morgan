package presentation;

import metier.Personne;
import service.Service;

public class Main {

	public static void main(String[] args) {
		Personne personne = new Personne(1, "Bullock", "Mathieu", "mabul", "fezl223", "02/02/2002");
		Personne personne2 = new Personne(2, "Gordon", "James", "gotham", "killthepinguin", "02/06/1976");
		Personne personne3 = new Personne(3, "Chamane", "Cédric", "chadric", "19161512", "19/01/2001");
		
		Service service = new Service();
		service.creerPersonne(Service.base, personne);
		service.creerPersonne(Service.base, personne2);
		service.creerPersonne(Service.base, personne3);
		
		System.out.println("Personnes en base :");
		System.out.println(Service.base);
		System.out.println(" ");
		
		Personne personne4 = new Personne(4, "Saku", "Nata", "NotNa", "azerty", "22/03/1994");
		service.creerPersonne(Service.base, personne);
		System.out.println("Personnes en base après ajout :");
		System.out.println(Service.base);
		System.out.println(" ");
		
		service.supprimerPersonne(Service.base, 2);
		System.out.println("Personnes en base après suppression de l'id 2 :");
		System.out.println(Service.base);
		System.out.println(" ");
	}

}
