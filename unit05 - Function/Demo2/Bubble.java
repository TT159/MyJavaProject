package Demo2;

import java.awt.Color;
import java.awt.Graphics2D;

public class Bubble {
		//declaration
		int d;
		double x,y;
		int r,g,b;
		Color color;
		double offSetX;
		double offSetY;	
		
		//constructor
		public Bubble() {
			d = (int)(Math.random()*(60-10))+10;
			x = Math.random()*(800-d);
			y = Math.random()*(600-d);
			r = (int)(Math.random()*256);
			g = (int)(Math.random()*256);
			b = (int)(Math.random()*256);
			color = new Color(r,g,b);
			offSetX = Math.random()*5+1;
			offSetY = Math.random()*5+1;
			offSetX = Math.random()>0.5 ? offSetX : -offSetX;
			offSetY = Math.random()>0.5 ? offSetY : -offSetY;
		}
		//move function
		public void move() {
			x += offSetX;
			y += offSetY;
			if(x > 800-d) {
				offSetX = -offSetX;
			}else if(y > 600-d) {
				offSetY = -offSetY;
			}else if(x < 0) {
				offSetX = -offSetX;
			}else if(y < 0) {
				offSetY = -offSetY;
			}
		}
		//paint function
		public void paint(Graphics2D g) {
			g.setColor(color);
			g.fillOval((int)x, (int)y, d, d);
		}
		

}
