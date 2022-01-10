package Demo2;

import java.awt.Graphics2D;

import cn.tedu.util.App;

public class demo extends App {
	
	Bubble ball1 = new Bubble();
	Bubble ball2 = new Bubble();
	
	//painting is a built-in function of App package 
	public void painting(Graphics2D g) {
		ball1.move();
		ball1.paint(g);
		ball2.move();
		ball2.paint(g);
	}
	
	public static void main(String[] args) {
		demo demo = new demo();
		demo.start();
	}

}


