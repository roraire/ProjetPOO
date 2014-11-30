package Vue;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import Controller.Mouse;
import Model.Grille;

public class JeuPanel extends JPanel  {
	
	Grille grille=new Grille();
	
	int x,y;
	
	public JeuPanel(Grille g){
		this.grille=g;
		addMouseListener(new Mouse());
	}
	
	public void updateDisplay(){
		repaint();
   	}
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    
		for(int i=0;i<=10;i++){
		g.drawLine(20, 20+i*30, 320, 20+i*30);
		}
		for(int i=0;i<=10;i++){
			g.drawLine(20+i*30, 20, 20+i*30, 20+300);
			}
		
		/*******************************************************************/
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
			if(grille.getCaseGrille(i, j).isOccupe())
				
					g.fillRect(20+j*30, 20+i*30, 30, 30);
			
			}
		
		/*******************************************************************/
		
	}
	
	}
	
}


