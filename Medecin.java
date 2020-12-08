package bref3;

public class Medecin extends Personne {
      public Medecin(String nom, int age) {
		super(nom, age);		
	}
      public void afficher() {
    	  System.out.print("Je suis "+this.nom  +", j’ai "+this.age+" ans et je travaille en tant que médecin ! \n");
      };
      

	
      
}
