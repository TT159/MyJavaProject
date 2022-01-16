package StaticDemo;

public class demo02 {

	public static void main(String[] args) {
		
		Person.add(7, 9);// using class name to call the method
		Person Tom = new Person("Tom");//using object name to call the method
		Tom.whoru();
	}

}



class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	//object method can use 'this' 
	public void whoru() {
		System.out.println("I am"+this.name);
	}
	
	//static method can't use 'this' 
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
}