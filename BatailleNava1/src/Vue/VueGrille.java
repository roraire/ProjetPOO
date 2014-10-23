package Vue;

import Model.Grille;

public class VueGrille {
     Grille grille=new Grille();
	public VueGrille()
	{
		
			System.out.println("  0   1   2   3   4   5   6   7   8   9\t\t\t\t\t");
			System.out.println(" _____________________________________");
			for(int i=0; i<10; i++){
				for(int j=0; j<10; j++){
					System.out.print("| ");
					System.out.print("x"+ " ");
				}
				System.out.println("|");
				System.out.println("|___|___|___|___|___|___|___|___|___|___|  "+i);
			}
			//System.out.println(" _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		}
		
		
	
	
}
