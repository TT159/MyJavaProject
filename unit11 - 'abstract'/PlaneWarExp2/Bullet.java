package PlaneWarExp2;

import javax.swing.ImageIcon;


public class Bullet extends FlyingObject{

	public Bullet(double x, double y) {
		//update
		super(x,y,Images.bullet,null,null);
		this.step = 4;
	}
	
	
	public void move() {
		y -= step;
	}

}