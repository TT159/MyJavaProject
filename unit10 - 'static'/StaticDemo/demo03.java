package StaticDemo;

public class demo03 {

	public static void main(String[] args) {
		//code block
		Circle c1 = new Circle();
		Circle c2  = new Circle();
		System.out.println(Circle.angle);
		
		
	}

}


class Circle{
	
	static double angle;
	//static code block
	static {
		System.out.println("initialization angle");
		angle = Math.PI*2;
	}
}




