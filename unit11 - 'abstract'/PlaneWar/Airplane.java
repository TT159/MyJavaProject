package PlaneWar;

import javax.swing.ImageIcon;

public class Airplane extends Plane {
	
	public Airplane(double x, double y, double step) {
		
		//in this version we just commend the super() super class constructor
		//super(x,y,width,height);
		this.x = x;
		this.y = y;
		this.step = step;
		
		//call Images class to simplify
		image = Images.airplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		
		//initialize the animation frames
		images = Images.airplane;
		bom = Images.bom;
	}
	

}