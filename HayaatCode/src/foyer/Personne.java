package foyer;

import java.util.ArrayList;

public class Personne {
	String nom;
	String prenom;
	String idFoyer;
	// 0: jour 1:mois 2:annee
	ArrayList<Float> anniversaire = new ArrayList<Float>();	
	
	public Personne(String n , String p, String id, ArrayList<Float> a) {
		this.nom = n;
		this.prenom = p;
		this.idFoyer = id;
		this.anniversaire = a;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getIdFoyer() {
		return idFoyer;
	}

	public ArrayList<Float> getAnniversaire() {
		return anniversaire;
	}
	
}