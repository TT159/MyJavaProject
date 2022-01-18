package AbstractDemo;

public class Teacher extends Person {
	
	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void teach() {
		System.out.println("teach");
	}
	
	public void schedule() {
		System.out.println("eating, teaching");
	}
	
}
