package metier;

import java.util.ArrayList;

public class Personne {
	private int personneId;
	private String nom;
	private String prenom;
	private String login;
	private String motDePasse;
	private String dateNaissance;
	private ArrayList<Annonce> Annonce = new ArrayList<>();
}
