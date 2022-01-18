package PlaneWarExp2;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public abstract class FlyingObject {
	// used by child class, thus use protected key world
	protected double x,y;
	protected double width,height;
	protected double step;
	protected ImageIcon image;
	
	//update: reconstruct constructor
	//this non-parameter constructor is used to avoid the compile bug of child class
	public FlyingObject() {
	}
	
	public FlyingObject(double x, double y,
			ImageIcon image, ImageIcon[] images, ImageIcon[] bom) {
		this.x = x;
		this.y = y;
		this.image = image;
		this.images = images;
		this.bom = bom;
		width = image.getIconWidth();
		height = image.getIconHeight();
	}
	
	//make the animation frames
	protected ImageIcon[] images;
	protected ImageIcon[] bom;
	protected int index = 0;
	public void nextImage() {
		if(images == null) {
			return;//avoid the Bullet class which does not have the animation frames 
		}
		image = images[(index++/6) % images.length];
	}
	
	
	//2.update with polymorphisn
	public void paint(Graphics g) {
		nextImage();//paint a time when change a frame
		image.paintIcon(null, g, (int)x, (int)y);
	}

	
	//using abstract function; generate the items flying downward:
	//big airplane, airplane, bee
	//create a new class plane which contains the above three classes
	public abstract void move();
	
	
	@Override
	public String toString() {
		String className = getClass().getName();
		return className+ "[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	

}
