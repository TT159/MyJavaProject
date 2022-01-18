package PlaneWarExp1;

import java.util.Random;

import javax.swing.ImageIcon;


public class Bee extends Plane{
	
	public Bee() {
		Random random = new Random();
		image = Images.bee[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		x = random.nextInt(400-(int)width);//0 ~ (400-w)
		y = -height;
		step = random.nextDouble()*5+1;//1 ~ 6 random speed 
		//initialize the animation frames
		images = Images.bee;
		bom = Images.bom;
	}
	
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