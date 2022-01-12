package ExtendsDemo;

public class Bee extends FlyingObject{
	public Bee(double x, double y, 
			double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
	}
	
	/*
	 * rewrite the super-class move function (fly down)
	 * change it to fly diagonal
	 */
	public void move() {
		// call the function in super-class
		super.move();
		x++;
	}

}
