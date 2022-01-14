/*
 * FlyingObject is the super class obtains the common attributions & functions of
 * airplane, bigplane, bullet and so on.
 */

package ExtendsDemo;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class FlyingObject {
	double x,y;
	double width,height;
	double step;
	ImageIcon image;
	
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
	
	//corresponding to version 1: to simplify the paint in World.java
	//thus we write the paint function in the super class
	public void paint(Graphics g) {
		image.paintIcon(null, g, (int)x, (int)y);
	}
	
	

}
