package metier;

public class Annonce {
	private int idAnnonce;
	private int idPersonne;
	private String intitule;
	private String details;
	private String prix;
	
	public Annonce(int idAnnonce, int idPersonne, String intitule, String details, String prix) {
		super();
		this.idAnnonce = idAnnonce;
		this.idPersonne = idPersonne;
		this.intitule = intitule;
		this.details = details;
		this.prix = prix;
	}
	
	public int getIdAnnonce() {
		return idAnnonce;
	}
	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	
}

