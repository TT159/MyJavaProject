package Demo01;

public class Sky {
	double x;
	double y;
	double width;
	double height;
	double step;
	
	//click the right button of the mouse -> select source 
	//-> select "Generate constructor using fields"
	public Sky(double x, double y, double width, double height, double step) {
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


	@Override
	public String toString() {
		return "Sky [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", step=" + step + "]";
	}
	 
	 
	 
}
