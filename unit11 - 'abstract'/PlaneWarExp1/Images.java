package PlaneWarExp1;

import javax.swing.ImageIcon;

public class Images {
	//create object
	public static ImageIcon[] airplane;
	public static ImageIcon[] bigairplane;
	public static ImageIcon[] bom;
	public static ImageIcon[] bee;
	public static ImageIcon[] hero;
	// only one image, thus no need the array
	public static ImageIcon bullet;
	public static ImageIcon start;
	public static ImageIcon sky;
	public static ImageIcon pause;
	public static ImageIcon gameover;
	
	//using static block to assign/initialize
	static {
		airplane = new ImageIcon[2];
		airplane[0] = new ImageIcon("images/airplane0.png");
		airplane[1] = new ImageIcon("images/airplane1.png");
		
		bigairplane = new ImageIcon[2];
		bigairplane[0] = new ImageIcon("images/bigairplane0.png");
		bigairplane[1] = new ImageIcon("images/bigairplane1.png");
		
		bee = new ImageIcon[2];
		bee[0] = new ImageIcon("images/bee0.png");
		bee[1] = new ImageIcon("images/bee1.png");
		
		hero = new ImageIcon[2];
		hero[0] = new ImageIcon("images/hero0.png");
		hero[1] = new ImageIcon("images/hero1.png");
		
		bom = new ImageIcon[4];
		bom[0] = new ImageIcon("images/bom1.png");
		bom[1] = new ImageIcon("images/bom2.png");
		bom[2] = new ImageIcon("images/bom3.png");
		bom[3] = new ImageIcon("images/bom4.png");
		
		bullet = new ImageIcon("images/bullet.png");
		sky = new ImageIcon("images/background.png");
		start = new ImageIcon("images/start.png");
		pause = new ImageIcon("images/pause.png");
		gameover = new ImageIcon("images/gameover.png");
	}
	
	public static void main(String[] args) {
		//if output 8, indicates that image load successfully
		System.out.println(airplane[0].getImageLoadStatus());
		System.out.println(airplane[1].getImageLoadStatus());
		System.out.println(bigairplane[0].getImageLoadStatus());
		System.out.println(bigairplane[1].getImageLoadStatus());
		System.out.println(bee[0].getImageLoadStatus());
		System.out.println(bee[1].getImageLoadStatus());
		System.out.println(hero[0].getImageLoadStatus());
		System.out.println(hero[1].getImageLoadStatus());
		System.out.println(bom[0].getImageLoadStatus());
		System.out.println(bom[1].getImageLoadStatus());
		System.out.println(bom[2].getImageLoadStatus());
		System.out.println(bom[3].getImageLoadStatus());
		
		System.out.println(bullet.getImageLoadStatus());
		System.out.println(sky.getImageLoadStatus());
		System.out.println(gameover.getImageLoadStatus());
		System.out.println(start.getImageLoadStatus());
		System.out.println(pause.getImageLoadStatus());
		
	}
	
}
