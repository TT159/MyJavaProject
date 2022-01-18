package PlaneWarExp1;

import java.util.Random;

import javax.swing.ImageIcon;


public class Bigplane extends Plane {
	
	
	public Bigplane() {
		Random random = new Random();
		image = Images.bigairplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		x = random.nextInt(400-(int)width);//0 ~ (400-w)
		y = -height;
		step = random.nextDouble()*3+0.7;//0.7 ~ 3.7 random speed 
		images = Images.bigairplane;
		bom = Images.bom;
	}

	public Bigplane(double x, double y, double step) {
		//super(x,y,width,height);
		this.x = x;
		this.y = y;
		this.step = step;
		image = Images.bigairplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		
		//initialize the animation frames
		images = Images.bigairplane;
		bom = Images.bom;
	}
	
}