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
		j1.poserBateau(j1.getBateau(3), 4, 1, "h");
		j1.poserBateau(j1.getBateau(4), 7, 7, "v");
		j1.getGrille().VueGrille();
	    JoueurVue jv  = new JoueurVue();
	     jv.setVisible(true);
	JoueurMachine m1=new JoueurMachine();
		
	/*JFrame jf= new JFrame();
	jf.setVisible(true);
	jf.setSize(300, 300);*/
		
	}

}
