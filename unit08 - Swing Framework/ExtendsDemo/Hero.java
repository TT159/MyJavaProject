package ExtendsDemo;

import javax.swing.ImageIcon;

public class Hero extends FlyingObject{

	public Hero(double x, double y, double width, double height) {
		super(x,y,width,height);
		image = new ImageIcon("Images/hero0.png");
	}
	
	/* rewrite the move function in super class 
	 * In super class, the move() aims to fly down
	 * In Hero class, the move() should be shut down. 
	 * Because the movement of the Hero follows the mouse
	 * Thus, we don't write anything in super-class move()  
	 */
	public void move() {
		
	}
	
	// move function
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
