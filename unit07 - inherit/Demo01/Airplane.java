package Demo01;

public class Airplane {
	double x;
	double y;
	double width;
	double height;
	double step;
	
	//constructor
	public Airplane(double x, double y, double width, double height, double step) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.step = step;
	}
	
	// move function
	 public void move() {
		 y += step;
	 }
	 
	//Java provide the toString method: help to print
	//right-click -> source -> generate toString()
	@Override
	public String toString() {
		return "Airplane [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", step=" + step + "]";
	}
	 
}
