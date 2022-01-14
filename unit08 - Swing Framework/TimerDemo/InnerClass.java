package TimerDemo;

public class InnerClass {

	public static void main(String[] args) {
		Foo foo = new Foo();
		foo.demo();

	}

}

//Foo is the outside class
class Foo{
	int a = 9;
	
	//Koo is the inner class
	class Koo{
		public void test() {
			//inner class can directly use the attribution defined outside
			System.out.println(a);
		}
	}
	
	public void demo() {
		//using inner class inside the class
		Koo koo = new Koo();
		koo.test();
	}
	
}
