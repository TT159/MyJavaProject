package PlaneWar;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel {
	//when we don't know the variables created for whom
	//we prefer to use private key world
	private Airplane[] airplanes;
	private Bigplane[] bigplanes;
	
	
	//2.update with polymorphisn 
	private FlyingObject[] planes;
	
	private Bullet[] bullets;
	private Sky sky;
	private Hero hero;
	
	//using constructor to initialize the objects
	public World() {
		
		//1.update with abstract
		
//		airplanes = new Airplane[2];//2 is length of array
//		airplanes[0] = new Airplane(10,10,1.5);
//		airplanes[1] = new Airplane(10,100,1.5);
//		
//		bigplanes = new Bigplane[2];
//		bigplanes[0] = new Bigplane(100,20,2);
//		bigplanes[1] = new Bigplane(100,220,2);
		
		//create the polymorphic object array: can store multiple classes
		//one array manage multiple classes
		planes = new FlyingObject[6];
		planes[0] = new Airplane(10,10,1.5);
		planes[1] = new Airplane(10,100,1.5);
		planes[2] = new Bigplane(100,20,2);
		planes[3] = new Bigplane(100,220,2);
		planes[4] = new Bee(200,280,1.5);
		planes[5] = new Bee(200,200,1.5);	
		
		
		bullets = new Bullet[2];
		bullets[0] = new Bullet(200,250,4);
		bullets[1] = new Bullet(200,200,4);
		
		sky = new Sky();
		hero = new Hero(200,500);
		
	}
	
	//version 3:
	public void paint(Graphics g) {
		sky.paint(g);
		hero.paint(g);
		
		for(int i=0; i<bullets.length; i++) {
			bullets[i].paint(g);
		}
		//2.update with polymorphic
		for(int i=0; i<planes.length; i++) {
			planes[i].paint(g);
		}
		
//		for(int i=0; i<airplanes.length; i++) {
//			airplanes[i].paint(g);
//		}
//		
//		for(int i=0; i<bigplanes.length; i++) {
//			bigplanes[i].paint(g);
//		}
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		
		frame.add(world);
		frame.setSize(400,700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// start the timer task
		world.action();
	}
	
	//only used in World class, thus use private
	private class PaintTask extends TimerTask{
		public void run() {
			
			// add for loop
			for(int i=0; i<bullets.length; i++) {
				bullets[i].move();
			}
			//2.update with polymorphic
			for(int i=0; i<planes.length; i++) {
				planes[i].move();
			}
			
//			for(int i=0; i<airplanes.length; i++) {
//				airplanes[i].move();
//			}
//			
//			for(int i=0; i<bigplanes.length; i++) {
//				bigplanes[i].move();
//			}
			
			sky.move();
			repaint();
		}
	}
	
	//action function to start the timer task
	public void action() {
		Timer timer = new Timer();
		PaintTask task = new PaintTask();
		timer.schedule(task, 1000,1000/100);//1000/100 is the interval time
	}

	
}
