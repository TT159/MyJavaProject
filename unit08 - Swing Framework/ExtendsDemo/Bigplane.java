package ExtendsDemo;

import javax.swing.ImageIcon;

public class Bigplane extends FlyingObject {

	//double step;
	public Bigplane(double x, double y, double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		image = new ImageIcon("Images/bigairplane0.png");
	}
	
//	public void move() {
//		y += step;
//	}
}
