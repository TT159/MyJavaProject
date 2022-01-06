// use this() to
// reduce the redundancy in multiple constructor

package unit04;

public class Demo05 {

	public static void main(String[] args) {
		Rectangle1 special = new Rectangle1();
		Rectangle1 squre = new Rectangle1(10);
		Rectangle1 rectangle = new Rectangle1(20,30);
		
		System.out.println(special.width);
		System.out.println(squre.height);
		System.out.println(rectangle.width);

	}

}


//multiple constructor
class Rectangle1 {
	
	int width;
	int height;
	
	public Rectangle1() {
		// this() must be used in the first line of constructor
		// the order of this() is the same with 
		// Rectangle1(int width, int height) constructor
		// thus 4 is width, 21 is height
		// if you invert the order in that two parameters constructor
		// then, 4 is height, 21 is width
		this(4,21);
	}
	
	public Rectangle1(int width) {
		this(width,width);
	}
	
	public Rectangle1(int width, int height) {
		this.width = width;
		this.height = height;
	}
}