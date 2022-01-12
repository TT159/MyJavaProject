package Demo01;

public class Hero {
	double x;
	double y;
	double width;
	double height;
	
	//click the right button of the mouse -> select source 
	//-> select "Generate constructor using fields"
	public Hero(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// move function, the move of Hero plane is followed by the location of mouse
	 public void move(int x, int y) {
		 this.x = x;
		 this.y = y;
	 }

	@Override
	public String toString() {
		return "Hero [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
	}
	 
	 
	 
}
