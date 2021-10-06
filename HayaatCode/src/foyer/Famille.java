package foyer;

import java.util.ArrayList;

public class Famille {

	public String idFoyer;	
	public ArrayList<String> roleListe = new ArrayList<String>();
	public ArrayList<Personne> p = new ArrayList<Personne>();
	
	public Famille(ArrayList<String> nom, ArrayList<String> prenom, 
			ArrayList<ArrayList<Float>> anniversaires, String idFoyerPersonne, String idFoyerFoyer, 
			ArrayList<String> role, int taille){
		
		for(int i = 0; i<taille; i++) {
			Personne personne = new Personne (nom.get(i),prenom.get(i),idFoyerPersonne, anniversaires.get(i));
		
			this.p.add(personne);
			this.roleListe.add(role.get(i));
			this.idFoyer = idFoyerFoyer;	
		}
	}
	
	public ArrayList<Personne> getPersonnes(){
		return this.p;
	}
	
	public void print() {
		for (int i=0 ; i<p.size();i++) {
			System.out.println("Nom : " + p.get(i).getNom());
			System.out.println("Prenom : " +  p.get(i).getPrenom() );
			System.out.println("Role : " + roleListe.get(i));
			System.out.println("Anniversaire : " + p.get(i).getAnniversaire().toString());
			System.out.println("idFoyer : " + idFoyer);
		}

		
	}
	
}
