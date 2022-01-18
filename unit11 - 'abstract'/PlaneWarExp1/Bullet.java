package PlaneWarExp1;

import javax.swing.ImageIcon;


public class Bullet extends FlyingObject{

	public Bullet(double x, double y, double step) {
		//super(x,y,width,height);
		this.x = x;
		this.y = y;
		this.step = step;
		//image = new ImageIcon("Images/bullet.png");
		image = Images.bullet;
		width = image.getIconWidth();
		height = image.getIconHeight(); 
	}
	
	//constructor reloading
	public Bullet(double x,double y) {
		step = 4;
		image = Images.bullet;
		width = image.getIconWidth();
		height = image.getIconHeight(); 
	}
	
	
	public void move() {
		y -= step;
	}

}