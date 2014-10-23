package Model;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

	private String nom;
	private Grille grille;
	private List<Bateau> bateaux=new ArrayList<Bateau>();
	
	

	public Joueur(String nom) {
		super();
		int i=1;
		this.nom = nom;
		this.grille = new Grille();
		while(i<6){
			bateaux.add(new Bateau(i));
			i++;
		}
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Grille getGrille() {
		return grille;
	}
	public void setGrille(Grille grille) {
		this.grille = grille;
	}
	public List<Bateau> getListBateaux() {
		return bateaux;
	}

	public Bateau getBateau(int i){
		return bateaux.get(i);
	}
	
	public void setBateaux(List<Bateau> bateaux) {
		this.bateaux = bateaux;
	}
	
	public boolean placeValide(Bateau b,int i,int j, String position)
	{
		boolean v=false;
		try{
		if(position=="h"){
			for(int k=0; k<b.getNbrCase();k++ )
			{
				if(!this.getGrille().getCaseGrille(i, j+k).isOccupe())
				{
					v=true;
				}
				else
				{
					return false;
				}
			}
		}
		if(position=="v"){
			for(int k=0; k<b.getNbrCase();k++ )
			{
				if(!this.getGrille().getCaseGrille(i+k, j).isOccupe())
				{
					v=true;
				}
				else
				{
					return false;
				}
			}
		}}
		catch(ArrayIndexOutOfBoundsException e )
		{
			return v;
		}
		
		return v;	
	}
	
	public void poserBateau(Bateau b,int i,int j, String position){
		
		if(this.placeValide(b, i, j, position)){
		if(position=="h"){
			
			for(int k=0; k<b.getNbrCase();k++ )
			{
				if(!this.getGrille().getCaseGrille(i, j+k).isOccupe())
				{
					this.getGrille().getCaseGrille(i, j+k).setOccupe(true);
					this.getGrille().getCaseGrille(i, j+k).setBat(b);
				}
			}
			System.out.println("case["+i+"]["+j+"] remplie !!!!!!");
		}
		if(position=="v"){
			for(int k=0; k<b.getNbrCase();k++ ){
			this.getGrille().getCaseGrille(i+k, j).setOccupe(true);
			this.getGrille().getCaseGrille(i+k, j).setBat(b);
			}
			System.out.println("case["+i+"]["+j+"] remplie !!!!!!");
		}
		
		
	}
	else
	{
		System.out.println("place["+i+"]["+j+"] invalide pour le bateaux");
	}
		
	}
	
	

	
}
