//In this expanded unit, we add the random enemy planes starting at the top of screen

package PlaneWarExp1;

import java.util.Random;

import javax.swing.ImageIcon;

public class Airplane extends Plane {
	
	//constructor reload
	//this constructor is set for randomly occurring a plane on the top 
	public Airplane() {
		Random random = new Random();
		image = Images.airplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		x = random.nextInt(400-(int)width);//0 ~ (400-w)
		y = -height;
		step = random.nextDouble()*5+1;//1 ~ 6 random speed 
		//initialize the animation frames
		images = Images.airplane;
		bom = Images.bom;
				
	}
	
	//this constructor is used for setting a specific loacation
	public Airplane(double x, double y, double step) {
		this.x = x;
		this.y = y;
		this.step = step;
		
		//call Images class to simplify
		image = Images.airplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		
		//initialize the animation frames
		images = Images.airplane;
		bom = Images.bom;
	}
	

}