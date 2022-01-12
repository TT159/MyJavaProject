package ExtendsDemo;

public class demo01 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		System.out.println(sub.a);
		System.out.println(sub.b);
		sub.test();

	}

}

class Super{
	int a = 6;
	public void test() {
		System.out.println("Parent");
	}
}

class Sub extends Super{
	int b = 7;
}


