package PlaneWarExp2;

import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;
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
		
		//update 
		//create the polymorphic object array: can store multiple classes
		//one array manage multiple classes
		planes = new FlyingObject[10];
		//start with the assigned location 
		planes[0] = new Airplane(10,10,1.5);
		planes[1] = new Airplane(10,100,1.5);
		planes[2] = new Bigplane(100,20,2);
		planes[3] = new Bigplane(100,220,2);
		planes[4] = new Bee(200,280,1.5);
		planes[5] = new Bee(200,200,1.5);	
		//start randomly on the top
		planes[6] = new Bee();
		planes[7] = new Airplane();
		planes[8] = new Bigplane();
		planes[9] = new Bee();
		
		bullets = new Bullet[2];
		bullets[0] = new Bullet(200,250);
		bullets[1] = new Bullet(200,200);
		
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
	
	//using index to confine the frequency of the new plane
	//when index can be divided by 4, then we create a new plane 
	private int index = 0;//counter, 0,1,2,3,4,5....
	
	public void createPlane() {
		if(index % 20 == 0) {
			//using random number to create different kinds of
			//planes with different ratio 
			Random random = new Random();
			int n = random.nextInt(10);//0 ~ 10 random number
			
			//using the super class, then plane can be a Airplane class
			// or Bigplane class, or Bee class
			//create one new plane 'plane'
			//Airplane plane = new Airplane();
			Plane plane;
//			if (n<=6){
//				plane = new Airplane();
//			} else if (n<=8) {
//				plane = new Bigplane();
//			} else {
//				plane = new Bee();
//			}
			//update with switch case statement, use it to replace if else
			switch(n) {
			case 9:
				plane = new Bee();
				break;
			case 8:
			case 7:
				plane = new Bigplane();
				break;
			default:
				plane = new Airplane();
			}
			
			

			//expand array -> create a new array planes whose length+1
			planes = Arrays.copyOf(planes, planes.length+1);
			//add the new plane in the end of the new array
			planes[planes.length-1] = plane;
		}
	}
	
	
	
	
	
	
	//only used in World class, thus use private
	private class PaintTask extends TimerTask{
		public void run() {
			//update: to create amount of planes randomly start at the top
			index++;
			createPlane();
			
			//update with polymorphic
			//make all planes move
			for(int i=0; i<bullets.length; i++) {
				bullets[i].move();
			}
			for(int i=0; i<planes.length; i++) {
				planes[i].move();
			}
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
