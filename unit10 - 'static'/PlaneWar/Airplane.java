package PlaneWar;

import javax.swing.ImageIcon;

public class Airplane extends FlyingObject {
	
	public Airplane(double x, double y, 
			double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
		
		/* image = new ImageIcon("Images/airplane0.png");
		 * 
		 * in this code, there is redundancy
		 * each time, we create an object, then it will create a variable image
		 * and load the image airplane0.png, however, these are the same image
		 * actually, we can just load once, all objects share it
		 * Can save a lot of memory   
		 */
		
		/*
		 * Also, no need to assign the width and height of the image manually
		 * we can just get the width & height of the image itself
		 */
		
		//call Images class to simplify
		image = Images.airplane[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		
	}
	

}