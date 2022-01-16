package StaticDemo;

//using static import, now we can use all Math funcitons
import static java.lang.Math.*;


public class demo04 {

	public static void main(String[] args) {
		System.out.println(sin(toRadians(30)));
		System.out.println(sin(toRadians(60)));
		System.out.println(sin(toRadians(75)));
		System.out.println(sin(toRadians(90)));
		System.out.println(sin(PI/2));

	}

}
