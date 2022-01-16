package PlaneWar;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class FlyingObject {
	// used by child class, thus use protected key world
	protected double x,y;
	protected double width,height;
	protected double step;
	protected ImageIcon image;
	
	//constructor
	public FlyingObject(double x, double y, 
			double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		//the following line can get the current class name
		String className = getClass().getName();
		return className+ "[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	public void move() {
		y += step;
	}
	
	public void paint(Graphics g) {
		image.paintIcon(null, g, (int)x, (int)y);
	}
	
	

}