package PlaneWarExp1;

import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Sky extends FlyingObject {
	//only used by the Sky class, thus use private
	private double y0;
	public Sky() {
		//super(x,y,width,height);//super() must write in the first line
		//the sky image must be the right top of the panel
		//thus we can delete the x,y variables 
		//and we can set a fixed step value
		
		this.step = 0.8;
		image = Images.sky;
		x = 0;
		y = 0;
		y0 = -image.getIconHeight();// get the image height
		height = image.getIconHeight();
		width = image.getIconWidth();

	}
	
	public void move() {
		y += step;
		y0 += step;
		
		if(y>=height) {
			System.out.println("The first image return at: y="+y);
			y = -height;
			System.out.println("y=" + y + " y0=" + y0 + " width=" + width + " height="+height);
		}
		
		if(y0>=height) {
			System.out.println("The second image return at: y0="+y0);
			y0 = -height;
			System.out.println("y=" + y + " y0=" + y0 + " width=" + width + " height="+height);
		}
	}
	
	public void paint(Graphics g) {
		image.paintIcon(null, g, (int)x, (int)y);
		image.paintIcon(null, g, (int)x, (int)y0);
	}
	
	
}
