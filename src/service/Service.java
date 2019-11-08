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
	public static List<Personne> tous = new ArrayList<Personne>();
	public List<Personne> findAllPersonnes() {
		return (List<Personne>) tous;
	}
	
	//Supprimer une personne de la liste
	public void supprimerPersonne(List<Personne> list, int idPersonne) {
		for(Personne p : list) {
			if(p.getPersonneId() == idPersonne) {
				list.remove(p);
				break;
			}
		}
	}
	
	//Mettre à jour une personne
	public void majPersonne(List<Personne> list, Personne p, String nom, String prenom, String dateNaissance) {
		for(Personne personne : list) {
			if(p.getPersonneId() == p.getPersonneId()) {
				personne.setPrenom(prenom);
				personne.setNom(nom);
				personne.setDateNaissance(dateNaissance);
				break;
			}
		}
	}
	
}
