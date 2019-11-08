package service;

import java.util.ArrayList;
import java.util.List;
import metier.Personne;

public class Service {
	
	//Créer une personne
	public int creerPersonne(List<Personne> list, Personne personne) {
		list.add(personne);
		return 1;
	}
	
	//Obtenir une personne par ID
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		for(Personne x : list) {
			if(x.getPersonneId() == idPersonne) {
				return x;
			}
		}
		return null;
	}
	

	//Obtenir toutes les personnes
	public static List<Personne> base = new ArrayList<Personne>();
	public List<Personne> findAllPersonnes() {
		return (List<Personne>) base;
	}
	
}
