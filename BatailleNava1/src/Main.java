import javax.swing.JFrame;

import Model.Joueur;
import Model.JoueurHomme;
import Model.JoueurMachine;
import Vue.JoueurVue;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoueurHomme j1=new JoueurHomme();
		j1.poserBateau(j1.getBateau(0), 9, 0, "h");
		j1.poserBateau(j1.getBateau(1), 0, 1, "h");
		j1.poserBateau(j1.getBateau(2), 5, 1, "v");
		j1.poserBateau(j1.getBateau(3), 8, 0, "h");
		j1.poserBateau(j1.getBateau(4), 4, 1, "h");
		//j1.getGrille().VueGrille();
		
		j1.getGrille().VueGrille();
		j1.touche(0, 1); 
		j1.touche(0, 2); 
		j1.touche(0, 0);
		j1.getGrille().VueGrille();


	    
	   
		JoueurMachine jm=new JoueurMachine();
		/*jm.touche(0, 0); 
		jm.touche(1, 2); 
		jm.touche(0, 9);
		
		*/

	   JoueurVue jv  = new JoueurVue(j1,jm);
	  //  jv.setVisible(true);
	//JoueurMachine m1=new JoueurMachine();

		
	 
	     
		
	}

}
