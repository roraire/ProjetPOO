package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JoueurVue extends JFrame {
	
	JeuPanel jeupanel= new JeuPanel();
	
	public JoueurVue(){
		super();
		setTitle("Bataille Naval");
		setSize(600, 650);
		setResizable(false);
		
		setLocation(300, 300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1, 1));
		contentPane.add(jeupanel);
	}
	

}
