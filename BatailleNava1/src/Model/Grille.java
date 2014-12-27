package Model;

import Vue.JeuPanel;
import Vue.JoueurVue;

public class Grille {

	
	private Case cases[][]= new Case[10][10];
	
	public Grille(){
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				cases[i][j]=new Case();
			}
		}
		
	}
	
	public Case getCaseGrille(int i,int j){
		
		return cases[i][j];
	}

	public Case[][] getCases() {
		return cases;
	}
	public void  VueGrille()
	{
		
		
		
		System.out.println("  0   1   2   3   4   5   6   7   8   9\t\t\t\t\t");
		System.out.println(" _____________________________________");
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print("| ");
				
				if(getCaseGrille(i, j).isTouche())
					System.out.print("X" + " ");
					else
				if(getCaseGrille(i, j).isOccupe())
				System.out.print("O" + " ");
				else System.out.print(" " + " ");
			}
			System.out.println("|");
			System.out.println("|___|___|___|___|___|___|___|___|___|___|  "+i);
		}
			//System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		
			
		}
		
		
	

	
}
