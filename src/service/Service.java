package service;

import java.util.List;
import metier.Personne;

public class Service {
	
	public int creerPersonne(List<Personne> list, Personne personne) {
		list.add(personne);
		return 1;
	}
	
	public Personne getPersonne(List<Personne> list, int idPersonne) {
		for(Personne p : list) {
			if(p.getPersonneId() == idPersonne) {
				return p;
			}
		}
		return null;
	}
	
}
