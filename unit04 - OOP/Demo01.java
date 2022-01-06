// oop - class

package unit04;

import java.awt.Color;

public class Demo01 {

	public static void main(String[] args) {
		Ball ball1 = new Ball();
		Ball ball2 = new Ball();
		Ball ball3 = new Ball();
		ball1.x = 5;
		ball2.x = 10;
		ball3.x = 100;
		System.out.println(ball1.x);
		System.out.println(ball2.x);
		System.out.println(ball3.x);

	}

}

// design a class
class Ball {
	int d;
	double x,y;
	int r,g,b;
	Color color;
	double offSetX, offSetY;
}


