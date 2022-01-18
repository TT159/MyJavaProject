package PlaneWar;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public abstract class FlyingObject {
	// used by child class, thus use protected key world
	protected double x,y;
	protected double width,height;
	protected double step;
	protected ImageIcon image;
	
	/*
	 *images is the animation frames array of current object
	 *if not has the frames such as Sky, Bullet, set this attribute as null 
	 */
	protected ImageIcon[] images;
	/*
	 *bom is the animation frames array of bomb, if no bomb, then set null
	 */
	protected ImageIcon[] bom;
	
	//used to count the animation frames
	protected int index = 0;
	public void nextImage() {
		if(images == null) {
			return;//avoid the Bullet class which does not have the animation frames 
		}
		//If not add above 'if block', will lead to NullPointerException bug
		//cauz we didn't initialize the images in Bullet class
		//System.out.println(index+","+(index % images.length));
		//image = images[index++ % images.length];
		//we can adjust the index to change the frames changing speed
		image = images[(index++/6) % images.length];
		
	}
	//2.update with polymorphisn
	public void paint(Graphics g) {
		nextImage();//paint a time when change a frame
		image.paintIcon(null, g, (int)x, (int)y);
	}
	
	//constructor
	//1.update with abstract
//	public FlyingObject(double x, double y, 
//			double width, double height) {
//		this.x = x;
//		this.y = y;
//		this.width = width;
//		this.height = height;
//	}

	//using abstract function; generate the items flying down-words:
	//big airplane, airplane, bee
	//create a new class plane which contains the above three classes
	public abstract void move();
	
	@Override
	public String toString() {
		//the following line can get the current class name
		String className = getClass().getName();
		return className+ "[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	

}