package StaticDemo;

public class demo01 {

	public static void main(String[] args) {
		/*
		 * instance variable 'a': each object has a variable 'a'
		 * static variable 'b': all objects share a variable 'b'
		 * just one 'b' in the class 
		 */
		// create two objects h1, h2
		Foo h1 = new Foo();
		Foo h2 = new Foo();
		h1.a = 8;
		h2.a = 10;
		//using class name to access the static variable
		Foo.b = 11;
		System.out.println(h1.a+","+h1.b);
		System.out.println(h2.a+","+h2.b);
		System.out.println(Foo.b);

	}

}

class Foo{
	int a;// instance variable/attribution of object
	static int b = 10;
}
