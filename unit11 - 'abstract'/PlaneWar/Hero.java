package PlaneWar;

import javax.swing.ImageIcon;

public class Hero extends FlyingObject{

	public Hero(double x, double y) {
		//super(x,y,width,height);
		//image = new ImageIcon("Images/hero0.png");
		this.x = x;
		this.y = y;
		image = Images.hero[0];
		width = image.getIconWidth();
		height = image.getIconHeight(); 
		//initialize the animation frames
		images = Images.hero;
		bom = Images.bom;
	}
	
	public void move() {
		
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
