import Model.Joueur;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Joueur j1=new Joueur("abdel");
		j1.poserBateau(j1.getBateau(0), 1, 7, "h");
		j1.poserBateau(j1.getBateau(1), 2, 1, "h");
		j1.poserBateau(j1.getBateau(2), 5, 1, "v");
		j1.poserBateau(j1.getBateau(3), 7, 1, "h");
		j1.poserBateau(j1.getBateau(4), 11, 7, "v");
		
	}

}
