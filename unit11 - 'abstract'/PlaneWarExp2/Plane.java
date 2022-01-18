package PlaneWarExp2;

import java.util.Random;

import javax.swing.ImageIcon;

public abstract class Plane extends FlyingObject{
	
	//non-parameter construct is only used for avoiding bug in child class
	public Plane() {
	}
	
	//this constructor is used for create a plane at the assigned location
	public Plane(double x, double y, ImageIcon image, 
			ImageIcon[] images, ImageIcon[] bom) {
		super(x, y, image, images, bom);

	}
	
	//constructor for the planes display on the top of the screen
	public Plane(ImageIcon image, 
		ImageIcon[] images, ImageIcon[] bom) {
		Random random = new Random();
		this.image = image;
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		x = random.nextInt(400-(int)width);
		y = -height;
		this.images = images;
		this.bom = bom;
	
	}

	public void move() {
		y += step;
	}

}
