package PlaneWarExp2;

import java.util.Random;

import javax.swing.ImageIcon;


public class Bigplane extends Plane {
	
	
	public Bigplane() {
		super(Images.bigairplane[0], Images.bigairplane, Images.bom);
		step = Math.random()*3+0.5;
	}

	public Bigplane(double x, double y, double step) {
		super(x,y,Images.bigairplane[0], Images.bigairplane, Images.bom);
		this.step = step;
	}
	
}