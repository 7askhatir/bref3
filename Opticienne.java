package bref3;

public class Opticienne extends Personne {

	public Opticienne(String nom, int age) {
		super(nom, age);
	}
	public void afficher() {
  	  System.out.print("Je suis "+this.nom  +", j’ai "+this.age+" ans et travaille en tant que opticienne ! \n");
    };
	

}
