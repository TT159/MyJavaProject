package AbstractDemo;

public abstract class Person {
	
	String name;
	int age;
	
	public void whoru() {
		System.out.println("I am "+name);

	}
	
	//abstract function: can not have a function block '{}'
	public abstract void schedule();

}