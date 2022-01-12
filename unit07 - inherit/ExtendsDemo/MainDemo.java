package ExtendsDemo;

import Demo01.Airplane;
import Demo01.Bigplane;
import Demo01.Bullet;
import Demo01.Hero;
import Demo01.Sky;

public class MainDemo {

	public static void main(String[] args) {
		Airplane plane = new Airplane(40,40,50,40,1);
		Bigplane plane2 = new Bigplane(300,20,150,180,2);
		Bullet bullet = new Bullet(300,500,10,20,5);
		Hero hero = new Hero(280,600,150,150);
		Sky sky = new Sky(0,0,560,800,0.8);// the sky moves slowly
				
		plane.move();// move one time
		/*System.out.println(plane.x+","+plane.y);
		 This can not work. Because the x is not declared in Airplane class.
		 It is declared in the super class FlyingObject.
		 Thus the Airplane.x is not visible
		 */
		System.out.println(plane);
		plane.move();
		System.out.println(plane);
		
		plane2.move();
		System.out.println(plane2);// println will automatically call the toString methons
		plane2.move();
		System.out.println(plane2);
		
		bullet.move();
		System.out.println(bullet);
		bullet.move();
		System.out.println(bullet);
		
		sky.move();
		System.out.println(sky);
		sky.move();
		System.out.println(sky);
		
		hero.move(200,300);
		System.out.println(hero);

	}

}
