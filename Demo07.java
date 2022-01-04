package unit03;

import java.awt.Color;
import java.awt.Graphics2D;
import cn.tedu.util.App;

public class Demo07 extends App {

	int d = (int) (Math.random() * (60 - 10)) + 10;
	// because of offset is double, x&y also need to be double
	double x = (int) (Math.random() * (800 - d));
	double y = (int) (Math.random() * (600 - d));

	// set random color for the bubble [0,255)
	int r = (int) (Math.random() * 255);
	int g = (int) (Math.random() * 255);
	int b = (int) (Math.random() * 255);
	Color color = new Color(r, g, b);

	// moving with random direction
	double offSetX = Math.random() * (6 - 1) + 1;
	double offSetY = Math.random() * (6 - 1) + 1;
	// we need to use {} to write statement in a CLASS
	// In CLASS, we can only write variable assignment and establish
	{// <0.5 offset is negative, otherwise, positive
		offSetX = Math.random() < 0.5 ? -offSetX : offSetX;
		offSetY = Math.random() < 0.5 ? -offSetY : offSetY;
	}

	public void painting(Graphics2D g) {
		x += offSetX;
		y += offSetY;

		// rebound
		if (x >= 800 - d) {
			offSetX = -offSetX;
			//System.out.println("Rigth side");
		}
		else if (x < 0) {
			offSetX = -offSetX;
			//System.out.println("Left side");
		}
		else if (y >= 600 - d) {
			offSetY = -offSetY;
			//System.out.println("Bottom side");
		}
		else if (y < 0) {
			offSetY = -offSetY;
			//System.out.println("Top side");
		}
		else {
			//test
			//System.out.println("Normal moving");
		}

		g.setColor(color);
		// g.fillOval() function can only accept int type
		g.fillOval((int) x, (int) y, d, d);
		// System.out.println(x+','+y);

	}

	public static void main(String[] args) {
		Demo07 demo = new Demo07();
		demo.start();

	}

}
