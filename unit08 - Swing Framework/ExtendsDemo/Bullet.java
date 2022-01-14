package ExtendsDemo;

import javax.swing.ImageIcon;

public class Bullet extends FlyingObject{

	//double step;// written in super-class
	public Bullet(double x, double y, double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		image = new ImageIcon("Images/bullet.png");
	}
	
	/*
	 rewrite the function inherit from the super class.
	 modify the move function in super-class
	 */
	public void move() {
		y -= step;
	}

}
