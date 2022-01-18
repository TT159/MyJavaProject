package PlaneWar;

import javax.swing.ImageIcon;


public class Bigplane extends Plane {

	public Bigplane(double x, double y, double step) {
		//super(x,y,width,height);
		this.x = x;
		this.y = y;
		this.step = step;
		//image = new ImageIcon("Images/bigairplane0.png");
		image = Images.bigairplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		
		//initialize the animation frames
		images = Images.bigairplane;
		bom = Images.bom;
	}
	
}