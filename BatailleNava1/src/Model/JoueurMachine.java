package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JoueurMachine extends Joueur {
	
	
	
	public JoueurMachine() {
		super();
		int i=1;
		this.grille = new Grille();
		while(i<6){
			bateaux.add(new Bateau(i));
			System.out.println("bateau"+i+"creer");
			this.poserBateauMachine(this.getBateau(i-1));
			i++;
		}
		
		this.getGrille().VueGrille();
	}

	
	public void poserBateauMachine(Bateau b){
		Random rand=new Random();
		int x1=rand.nextInt(9);
		int y1 =rand.nextInt(9);
		int p=rand.nextInt(2);
		String position;
		if(p==0){
			position="h";
		}else{
			position ="v";
		}
		if(this.placeValide(b, x1, y1, position)){
		this.poserBateau(b, x1, y1, position);
		}else{
			this.poserBateauMachine(b);
		}
		
	}
	
	
	
	
	
}
