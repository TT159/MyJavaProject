// default & parameter constructor
// this key word

package unit04;

public class Demo03 {

	public static void main(String[] args) {
		//Student TT = new Student();// WRONG! there isn't a non-parameter constructor
		Student TT = new Student("TT",16);
		System.out.println(TT);// will print the first address of the object (TT)
		System.out.println(TT.name);
		System.out.println(TT.age);
		
		Food meat = new Food();
		
	}

}

//parameter constructor
class Student {
	String name;
	int age;
	
	// format 1:
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/* format 2:
	public Student(String name_, int age_) {
		name = name_;
		age = age_;
	}
	*/
}

//default constructor
class Food {
	// write nothing, java will add a default constructor automatically
	// However, if there is a constructor written by you, java will not add anymore
}
