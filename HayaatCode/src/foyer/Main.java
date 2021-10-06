package foyer;

import java.util.ArrayList;

public class Main {
	  public static void main (String[] args){
		  ArrayList<String> prenom = new ArrayList<String>();
		  ArrayList<String> nom = new ArrayList<String>();
		  ArrayList<String> role = new ArrayList<String>();
		  ArrayList<ArrayList<Float>> anniversaires = new ArrayList<ArrayList<Float>>();
		  ArrayList<Float> a1 = new ArrayList<Float>();
		  ArrayList<Float> a2 = new ArrayList<Float>();
		  ArrayList<Float> a3 = new ArrayList<Float>();
		  ArrayList<Float> a4 = new ArrayList<Float>();
		  
		  prenom.add("Paul");
		  prenom.add("Pierre");
		  prenom.add("Marie");
		  prenom.add("Julie");
		  
		  nom.add("France");
		  nom.add("France");
		  nom.add("Paris");
		  nom.add("France");
		 
		  role.add("papa");
		  role.add("fils");
		  role.add("maman");
		  role.add("fille");
		  
		  a1.add((float) 20);
		  a1.add((float) 3);
		  a1.add((float) 1960);
		  
		  a2.add((float) 20);
		  a2.add((float) 3);
		  a2.add((float) 2000);
		  
		  a3.add((float) 20);
		  a3.add((float) 3);
		  a3.add((float) 1960);
		  
		  a4.add((float) 20);
		  a4.add((float) 3);
		  a4.add((float) 2000);
		  
		  anniversaires.add(a1);
		  anniversaires.add(a2);
		  anniversaires.add(a3);
		  anniversaires.add(a4);
		  
		  Famille famille = new Famille(nom,prenom,anniversaires, "idfoyer","idfoyer",role,4);
		  
		  famille.print();
		  

	  }
}
