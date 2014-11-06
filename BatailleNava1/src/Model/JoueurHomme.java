package Model;

public class JoueurHomme extends Joueur{
	
	public JoueurHomme() {
		super();
		int i=1;
		
		this.grille = new Grille();
		while(i<6){
			bateaux.add(new Bateau(i));
			i++;
			
		}
		
	}

}
