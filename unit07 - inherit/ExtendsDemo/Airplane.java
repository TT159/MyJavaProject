package ExtendsDemo;

public class Airplane extends FlyingObject {
	//double step;
	//constructor
	public Airplane(double x, double y, double width, double height, double step) {
/*		
 		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		//No need anymore. We can just call the super()
*/
		super(x,y,width,height);
		this.step = step;
	}
	
/*	// move function
	public void move() {
		y += step;
	}
	
	we write move() function in super-class to simplify code
	
*/
}
