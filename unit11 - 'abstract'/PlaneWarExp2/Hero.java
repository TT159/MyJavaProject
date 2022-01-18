package PlaneWarExp2;

import javax.swing.ImageIcon;

public class Hero extends FlyingObject{

	public Hero(double x, double y) {
		super(x,y,Images.hero[0],Images.hero,Images.bom);
	}
	
	public void move() {
		
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
