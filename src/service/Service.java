package service;

import java.util.List;

import metier.Personne;

public class Service {
	
	public int creerPersonne(List<Personne> list, Personne personne) {
		list.add(personne);
		return 1;
	}
	
	
}
