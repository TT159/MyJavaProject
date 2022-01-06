// constructor

package unit04;

import java.awt.Color;

public class Demo02 {

	public static void main(String[] args) {
		Bubble bubble1 = new Bubble();
		Bubble bubble2 = new Bubble();
		Bubble bubble3 = new Bubble();
		
		System.out.println(bubble1.x);
		System.out.println(bubble2.x);
		System.out.println(bubble3.x);

	}

}

// design a class & constructor
// in the same package, cannot has two same class, so we change the class name "Bubble" to "Bubble"
class Bubble {
	//declare variables
	int d;
	double x,y;
	int r,g,b;
	Color color;
	double offSetX, offSetY;
	
	//Using non-parameter constructor to initialize variables
	//public void Ball(); WRONG! this is a function instead of a constructor
	//there is no return value for constructor, thus no need to write anything between
	//public and Class name
	public Bubble() {
		d = (int)(Math.random()*(60-10)+10);
		x = Math.random()*(800-d);
		y = Math.random()*(600-d);
		r = (int)(Math.random()*256);
		g = (int)(Math.random()*256);
		b = (int)(Math.random()*256);
		color = new Color(r,g,b);
		offSetX = Math.random()*5+1;
		offSetY = Math.random()*5+1;
		offSetX = Math.random()>0.5 ? -offSetX : offSetX;
		offSetY = Math.random()>0.5 ? -offSetY : offSetY;
	}
}


