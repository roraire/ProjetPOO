package Model;

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

	

	
}
