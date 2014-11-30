package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Model.Grille;

public class JoueurVue extends JFrame {
	
	
	Grille grille =new Grille();
	public JoueurVue(Grille g){
		super();
		grille=g;
		setTitle("Bataille Naval");
		setSize(600, 650);
		setResizable(false);
		setVisible(true);
		setLocation(300, 300);
		//addMouseListener(new Mouse());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1, 1));
		contentPane.add(new JeuPanel(grille));
	}
	
	/*public class Mouse extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			int xCoord =e.getX();
			int yCoord=e.getY();
			
			System.out.println("x="+xCoord);
			System.out.println("y="+yCoord);
			
		}
		
		
	}*/

}
