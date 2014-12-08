package Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import Controller.Mouse;
import Model.Grille;

public class JeuPanel extends JPanel  {
	
	Grille grille=new Grille();
	
	
	
	public JeuPanel(Grille g){
		this.grille=g;
		addMouseListener(new Mouse());
	}
	
	public void updateDisplay(){
		repaint();
   	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawString("la bataille commence ", 320, 20);
		g.setColor(Color.BLUE);
		g.fillRect(20, 40, 300, 300);
		g.fillRect(420, 40, 300, 300);
		g.setColor(Color.BLACK);
		/*******************************************************************/
		
		for(int i=0;i<=10;i++){
		g.drawLine(20, 40+i*30, 320, 40+i*30);
		}
		for(int i=0;i<=10;i++){
			g.drawLine(20+i*30, 40, 20+i*30, 40+300);
			}
		
	//Grillle2
		
		for(int i=0;i<=10;i++){
			g.drawLine(420, 40+i*30, 720, 40+i*30);
			}
			for(int i=0;i<=10;i++){
				g.drawLine(420+i*30, 40, 420+i*30, 40+300);
				}
		
		
		/*******************************************************************/
			
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
			if(grille.getCaseGrille(i, j).isOccupe())
				
					g.fillRect(420+j*30, 40+i*30, 30, 30);
			
			}
		}
		/*******************************************************************/
		
	}
	
	
}


