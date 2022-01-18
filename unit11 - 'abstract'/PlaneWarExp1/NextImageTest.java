package PlaneWarExp1;

public class NextImageTest {

	public static void main(String[] args) {
		// Test the display algorithm of the animation frames
		
		Airplane plane = new Airplane(10,10,2);
		plane.nextImage();
		System.out.println(plane.image);
		plane.nextImage();
		System.out.println(plane.image);
		plane.nextImage();
		System.out.println(plane.image);
		plane.nextImage();
		System.out.println(plane.image);
		plane.nextImage();
		System.out.println(plane.image);
		
		Bigplane p1 = new Bigplane(10,10,5);
		p1.nextImage();
		System.out.println(p1.image);
		p1.nextImage();
		System.out.println(p1.image);
		p1.nextImage();
		System.out.println(p1.image);
		p1.nextImage();
		System.out.println(p1.image);
		p1.nextImage();
		System.out.println(p1.image);
		
		Bullet b = new Bullet(2,3);
		b.nextImage();
		System.out.println(b.image);
		b.nextImage();
		System.out.println(b.image);
		b.nextImage();
		System.out.println(b.image);
		b.nextImage();
		System.out.println(b.image);
		b.nextImage();
		System.out.println(b.image);
		
	}

}
