//key word: super()

package ExtendsDemo;

public class demo03 {

	public static void main(String[] args) {
		Student student = new Student();
	}

}

class Person{
	public Person() {
		System.out.println("Person");
	}
}

class Student extends Person {
	//Even if there is nothing written by ourselves
	//java will automatically call the non-parameter constructor of super-class
	//which looks like following
	public Student() {
		// super() need to be written in the first line
		super();
	}
}

class Super1{
	public Super1(int a) {
		System.out.println("Super1.a");
	}
}

class Sub1 extends Super1{
	public Sub1() {
		// if not write code to call super-class constructor, will get a bug
		super(5);
	}
}
