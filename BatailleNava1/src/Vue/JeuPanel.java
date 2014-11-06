package Vue;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JeuPanel extends JPanel {
	public JeuPanel(){
	}
	
	public void updateDisplay(){
		repaint();
   	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    
		for(int i=0;i<=10;i++){
		g.drawLine(50, 50+i*30, 550, 50+i*30);
		}
		for(int i=0;i<=10;i++){
			g.drawLine(50+i*50, 50, 50+i*50, 50+300);
			}
	
	}
	
	public Dimension getPreferredSize(){
      	return new Dimension(210, 50);
   	}

	public Dimension getMinimumSize(){
      	return getPreferredSize();
   	}

	public Dimension getMaximumSize(){
      	return getPreferredSize();
   	}
}