// functions with same name - function reload


package Demo1;

public class demo2 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10,10,10);//x,y,r
		System.out.println(c1.contains(5,5));//true
		System.out.println(c1.contains(1,1));//false
		Circle c2 = new Circle(6,6,2);
		System.out.println(c1.contains(c2));//true
		Circle c3 = new Circle(23,23,2);
		System.out.println(c1.contains(c3));// false
	}

}

// design class
class Circle {
	int x,y,r;
	
	// constructor - initialization for variables 
	public Circle(int x, int y , int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	// function - check a point(x,y), whether it is in the circle or not 
	public boolean contains(int x,int y) {
		int a = this.x - x;
		int b = this.y - y;
		double c = Math.sqrt(a*a + b*b);
		return c <= r;
	}
	
	// same name function - check the circle c, whether it is in the circle or not
	public boolean contains(Circle c) {
		int R = this.r;
		int r = c.r;// test circle
		if(R < r) {
			return false;
		}
		double a = this.x - c.x;
		double b = this.y - c.y;
		double d = Math.sqrt(a*a + b*b);
		return d < R - r;
	}
	
}
