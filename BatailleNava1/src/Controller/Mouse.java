package Controller;

import java.awt.Color;
import java.awt.Graphics;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Mouse extends MouseAdapter {

	int x,y;
	
	public Mouse(){
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		int xCord =e.getX();
		int yCord=e.getY();
		this.getCase(xCord, yCord);
		Graphics g=e.getComponent().getGraphics();
			g.setColor(Color.RED);
			g.fillRect((20+y*30)+1,(40+x*30)+1 , 29, 29);
		
		
	}

	public void getCase(int xCord,int yCord){
		
		if(xCord>19 && xCord<321 && yCord>39 && yCord<341){
			
				
					for(int i=0;i<=10;i++){
					if(xCord<20+(i+1)*30 && xCord>20+i*30 )  {
					y=i;
					System.out.println("case i="+y);
					}
					}
					
					for(int j=0;j<=10;j++){
					if(yCord<40+(j+1)*30 && yCord>40+j*30){
					x=j;
					System.out.println("case j="+x);
					}
					}
					
				}
				
		}
		
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
