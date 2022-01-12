package ExtendsDemo;

public class FlyingObject {
	double x,y;
	double width,height;
	double step;
	
	public FlyingObject(double x, double y, 
			double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		//the following line can get the current class name
		String className = getClass().getName();
		return className+ "[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	
	public void move() {
		y += step;
	}
	
	

}
