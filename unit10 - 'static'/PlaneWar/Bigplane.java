package PlaneWar;

import javax.swing.ImageIcon;


public class Bigplane extends FlyingObject {

	public Bigplane(double x, double y, double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		//image = new ImageIcon("Images/bigairplane0.png");
		image = Images.bigairplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
	}
	
}