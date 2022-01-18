package PlaneWar;

import javax.swing.ImageIcon;


public class Bee extends Plane{
	public Bee(double x, double y, double step) {
		//super(x,y,width,height);
		this.x = x;
		this.y = y;
		this.step = step;
		
		//image = new ImageIcon("Images/bee0.png");
		image = Images.bee[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		
		//initialize the animation frames
		images = Images.bee;
		bom = Images.bom;
	}

	public void move() {
		super.move();
		x++;
	}

}