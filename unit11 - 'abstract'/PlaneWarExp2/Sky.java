package PlaneWarExp2;

import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Sky extends FlyingObject {
	//only used by the Sky class, thus use private
	private double y0;
	public Sky() {
		//update
		super(0,0,Images.sky,null,null);//super() must write in the first line
		this.step = 0.8;
		// after updating. we no need the following three lines 
//		image = Images.sky;
//		x = 0;
//		y = 0;		
		y0 = -height;// get the image height
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
