package Model;

public class Case {

	private boolean occupe;
	private  Bateau bat;
	

	private boolean touche;
	
	
	public boolean isTouche() {
		return touche;
	}

	public void setTouche(boolean Touche) {
		this.touche = Touche;
	}

	public Case(){
		occupe=false;
		
	}

	public boolean isOccupe() {
		return occupe;
	}

	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}

	public Bateau getBat() {
		return bat;
	}

	public void setBat(Bateau bat) {
		this.bat = bat;
	}
	
	
	
}
