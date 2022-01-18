package AbstractDemo;

public class Student extends Person {

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void study() {
		System.out.println("Study");
	}

	public void schedule() {
		System.out.println("eating, studing");
	}
}
