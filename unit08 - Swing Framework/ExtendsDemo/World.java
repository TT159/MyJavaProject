/*
 * World is the class obtains the whole things of the Plane Wars Game
 * seems like the main function of the app
 * or we can say it is the Panel to display the game 
 */

package ExtendsDemo;

import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel {
	//create objects, but not assign yet
	Airplane[] airplanes;
	Bigplane[] bigplanes;
	Bullet[] bullets;
	Sky sky;
	Hero hero;
	
	//using constructor to initialize the objects
	public World() {
		//not put the images in the same location
		//otherwise, there will be overlay
		airplanes = new Airplane[2];//2 is length of array
		airplanes[0] = new Airplane(10,10,50,40,1.5);
		airplanes[1] = new Airplane(10,100,50,40,1.5);
		
		bigplanes = new Bigplane[2];
		bigplanes[0] = new Bigplane(100,20,100,200,2);
		bigplanes[1] = new Bigplane(100,220,100,200,2);
		
		bullets = new Bullet[2];
		bullets[0] = new Bullet(200,250,10,10,4);
		bullets[1] = new Bullet(200,200,10,10,4);
		
		sky = new Sky(0,0,400,700,0.8);
		hero = new Hero(200,500,200,200);
		
	}
	
	//version 1: there are some repetitive redundancy 
	// we can abstract them to the superclass FlyingObejct
//	public void paint(Graphics g) {
//		sky.image.paintIcon(this, g, (int)sky.x, (int)sky.y);
//		hero.image.paintIcon(this, g, (int)hero.x, (int)hero.y);
//		
//		bullets[0].image.paintIcon(this, g, (int)bullets[0].x, (int)bullets[0].y);
//		bullets[1].image.paintIcon(this, g, (int)bullets[1].x, (int)bullets[1].y);
//		
//		airplanes[0].image.paintIcon(this, g, (int)airplanes[0].x, (int)airplanes[0].y);
//		airplanes[1].image.paintIcon(this, g, (int)airplanes[1].x, (int)airplanes[1].y);
//		
//		bigplanes[0].image.paintIcon(this, g, (int)bigplanes[0].x, (int)bigplanes[0].y);
//		bigplanes[1].image.paintIcon(this, g, (int)bigplanes[1].x, (int)bigplanes[1].y);
//	}
	
	//version 2: it can't deal with amount of obejcts
	//thus version 3: add for loop
//	public void paint(Graphics g) {
//		sky.paint(g);
//		hero.paint(g);
//		
//		bullets[0].paint(g);
//		bullets[1].paint(g);
//		
//		airplanes[0].paint(g);
//		airplanes[1].paint(g);
//		
//		bigplanes[0].paint(g);
//		bigplanes[1].paint(g);
//	}
	
	//version 3:
	public void paint(Graphics g) {
		sky.paint(g);
		hero.paint(g);
		
		for(int i=0; i<bullets.length; i++) {
			bullets[i].paint(g);
		}
		
		for(int i=0; i<airplanes.length; i++) {
			airplanes[i].paint(g);
		}
		
		for(int i=0; i<bigplanes.length; i++) {
			bigplanes[i].paint(g);
		}
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		World world = new World();
		
		//because world extend from JPanel, thus world is also a panel
		//thus world can be added to the frame
		frame.add(world);
		//set the panel
		frame.setSize(400,700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// start the timer task
		world.action();
	}
	
	
	/*
	 * add an inner class to accomplish the timer task
	 * 1.hide the timer task in the World class
	 * 2.can access the data and attribution from the outside class
	 */
	class PaintTask extends TimerTask{
		public void run() {
//			airplanes[0].move();
//			repaint();//repaint the image, will automatically execute the paint()
			
			// add for loop
			for(int i=0; i<bullets.length; i++) {
				bullets[i].move();
			}
			
			for(int i=0; i<airplanes.length; i++) {
				airplanes[i].move();
			}
			
			for(int i=0; i<bigplanes.length; i++) {
				bigplanes[i].move();
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



