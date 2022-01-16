package PlaneWar;

import javax.swing.ImageIcon;

public class Airplane extends FlyingObject {
	
	public Airplane(double x, double y, 
			double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		image = new ImageIcon("Images/airplane0.png");
	}
	

}