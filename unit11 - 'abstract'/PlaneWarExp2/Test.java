package PlaneWarExp2;

public class Test {

	public static void main(String[] args) {
		Sky sky = new Sky();
		System.out.println(sky);
		System.out.println(sky.image);
		
		Bullet bullet = new Bullet(10,10);
		System.out.println(bullet);
		System.out.println(bullet.image);
		
		Hero hero = new Hero(200,200);
		System.out.println(hero);
		System.out.println(hero.image);
		System.out.println(hero.images);
		System.out.println(hero.bom);
		
		Airplane p1 = new Airplane();
		System.out.println(p1);
		System.out.println(p1.image);
		System.out.println(p1.images);
		System.out.println(p1.bom);
		System.out.println(p1.step);
		
		Bigplane p2 = new Bigplane();
		System.out.println(p2);
		System.out.println(p2.image);
		System.out.println(p2.images);
		System.out.println(p2.bom);
		System.out.println(p2.step);
		
		Bee bee = new Bee();
		System.out.println(bee);
		System.out.println(bee.image);
		System.out.println(bee.images);
		System.out.println(bee.bom);
		System.out.println(bee.step);
		
	}

}
