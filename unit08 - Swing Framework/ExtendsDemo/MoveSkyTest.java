package ExtendsDemo;

public class MoveSkyTest {

	public static void main(String[] args) {
		
		Sky sky = new Sky(0,0,400,700,0.8);
		//700/(0.8) = 875, the first image(start at y=0) needs to move 875 times
		//then it will move out the panel and will paint the second image (y0)
		for(int i=0;i<5000;i++) {
			sky.move();
		}

	}

}
