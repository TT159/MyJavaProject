package ExtendsDemo;

public class demo04 {

	public static void main(String[] args) {
		Sub2 sub = new Sub2();
		sub.test();

	}

}


class Super2{
	int a = 7;
}


class Sub2 extends Super2{
	int a = 8;
	public void test() {
		int a = 9;
		System.out.println(a);//local variable, 
		System.out.println(this.a);//instance variable, current object
		System.out.println(super.a);// 
	}
}