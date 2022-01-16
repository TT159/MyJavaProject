package PlaneWar;

import javax.swing.ImageIcon;


public class Bullet extends FlyingObject{

	public Bullet(double x, double y, double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		image = new ImageIcon("Images/bullet.png");
	}
	
	public void move() {
		y -= step;
	}

}