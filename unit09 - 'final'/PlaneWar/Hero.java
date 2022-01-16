package PlaneWar;

import javax.swing.ImageIcon;

public class Hero extends FlyingObject{

	public Hero(double x, double y, double width, double height) {
		super(x,y,width,height);
		image = new ImageIcon("Images/hero0.png");
	}
	
	public void move() {
		
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
