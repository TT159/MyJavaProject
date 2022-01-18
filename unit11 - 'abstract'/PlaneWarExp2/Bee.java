package PlaneWarExp2;

import java.util.Random;

import javax.swing.ImageIcon;


public class Bee extends Plane{
	
	public Bee() {
		super(Images.bee[0], Images.bee, Images.bom);
		step = Math.random()*5+2;
	}
	
	public Bee(double x, double y, double step) {
		super(x,y,Images.bee[0], Images.bee, Images.bom);
		this.step = step;
	}

	public void move() {
		super.move();
		x++;
	}

}