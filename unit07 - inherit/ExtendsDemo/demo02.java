package ExtendsDemo;

public class demo02 {

	public static void main(String[] args) {
		//In java, each sub-class can only have a exactly one super-class
		//Transmit.
		Coo coo = new Coo();
		System.out.println(coo.a);
		System.out.println(coo.b);
		System.out.println(coo.c);
	}

}

class Aoo {
	int a;
}

class Boo extends Aoo{
	int b;
}

class Coo extends Boo{
	int c;
	
}
