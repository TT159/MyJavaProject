// multiple constructor
package unit04;

public class Demo04 {

	public static void main(String[] args) {
		Rectangle special = new Rectangle();
		Rectangle squre = new Rectangle(10);
		Rectangle rectangle = new Rectangle(20,30);
		
		System.out.println(special.width);
		System.out.println(squre.height);
		System.out.println(rectangle.width);
	}

}

// multiple constructor
class Rectangle {
	int width;
	int height;
	
	public Rectangle() {
		width = 4;
		height = 21;
	}
	
	public Rectangle(int width) {
		this.width = width;
		this.height = width;
	}
	
	public Rectangle(int width_, int height_) {
		width = width_;
		height = height_;
	}
}