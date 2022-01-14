package ExtendsDemo;

import javax.swing.ImageIcon;

public class Bee extends FlyingObject{
	public Bee(double x, double y, 
			double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		image = new ImageIcon("Images/bee0.png");
	}

	public void move() {
		// call the function in super-class
		super.move();
		x++;
	}

}
