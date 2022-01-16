package PlaneWar;

import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Sky extends FlyingObject {
	//only used by the Sky class, thus use private
	private double y0;
	public Sky(double x, double y, double width, double height, double step) {
		super(x,y,width,height);//super() must write in the first line
		this.step = step;
		image = new ImageIcon("Images/background.png");
		y = 0;
		y0 = -image.getIconHeight();// get the image height
		height = image.getIconHeight();
		width = image.getIconWidth();
		//System.out.println("y=" + y + " y0=" + y0 + " width=" + width + " height="+height);
		//output: y=0.0 y0=-700.0 width=420.0 height=700.0
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
