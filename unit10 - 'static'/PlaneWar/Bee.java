package PlaneWar;

import javax.swing.ImageIcon;


public class Bee extends FlyingObject{
	public Bee(double x, double y, 
			double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		//image = new ImageIcon("Images/bee0.png");
		image = Images.bee[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
	}

	public void move() {
		super.move();
		x++;
	}

}