package AbstractDemo;

public class demo01 {

	public static void main(String[] args) {
		Student s = new Student("Tom",12);
		Teacher t = new Teacher("TT",23);
		
		//test abstract class
		s.whoru();
		s.study();
		
		t.whoru();
		t.teach();
		
		//bug! the output is meaningless
		//cause the super class is abstract
		//thus we need abstract key word in the super class Person
		//to confine it as abstract 
		//and Java not allow to create Person object directly
		//to avoid the creation of meaningless object
		
//		Person p = new Person();
//		p.whoru();// output: I am null
		
		
		//test abstract function
		s.schedule();
		t.schedule();
		
		Person p = new Teacher("Wang", 34);
		p.schedule();
		
		
		
		
	}

}
