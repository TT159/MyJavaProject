package ExtendsDemo;

public class Sky extends FlyingObject {
	//double step;
	public Sky(double x, double y, double width, double height, double step) {
		super(x,y,width,height);
		this.step = step;
	}
//	// move function
//	public void move() {
//		y += step;
//	}
}
