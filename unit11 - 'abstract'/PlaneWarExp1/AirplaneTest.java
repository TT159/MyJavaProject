package PlaneWarExp1;

public class AirplaneTest {

	public static void main(String[] args) {
		// Test the Airplane occurring on the top
		// call the non-parameter constructor
		Airplane plane = new Airplane();
		System.out.println(plane);
		System.out.println(plane.step);
		System.out.println(plane.image);
		System.out.println(plane.images);
		System.out.println(plane.bom);
		
		//test the Bigairplane
		Bigplane p1 = new Bigplane();
		System.out.println(p1);
		System.out.println(p1.step);
		System.out.println(p1.image);
		System.out.println(p1.images);
		System.out.println(p1.bom);
		
		//test the Bigairplane
		Bee p2 = new Bee();
		System.out.println(p1);
		System.out.println(p1.step);
		System.out.println(p1.image);
		System.out.println(p1.images);
		System.out.println(p1.bom);

	}

}
