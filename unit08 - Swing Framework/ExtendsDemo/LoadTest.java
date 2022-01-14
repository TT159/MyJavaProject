package ExtendsDemo;

public class LoadTest {

	public static void main(String[] args) {
		// Test the image loading
		Airplane p1 = new Airplane(10,10,50,40,1.5);//1.5 is the step
		// if return 8, indicate the image load successfully
		System.out.println(p1.image.getImageLoadStatus());
		
		Bigplane p2 = new Bigplane(100,100,100,100,2.3);
		System.out.println(p2.image.getImageLoadStatus());
		
		Bullet p3 = new Bullet(10,10,8,8,5.8);
		System.out.println(p3.image.getImageLoadStatus());
		
		Hero p4 = new Hero(100,100,100,100);
		System.out.println(p4.image.getImageLoadStatus());
		
		Bee p5 = new Bee(10,10,10,10,2.4);
		System.out.println(p5.image.getImageLoadStatus());
		
		Sky p6 = new Sky(0,0,100,100,3);
		System.out.println(p6.image.getImageLoadStatus());
		
	}

}
