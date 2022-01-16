package AccessControl;

public class demo01 {

	public static void main(String[] args) {
		PrivateTest test = new PrivateTest();
		/*
		 * System.out.println(test.a);
		 * "a" is not visible, WRONG!
		 */
		// public attribution&function can be accessed
		System.out.println(test.b);
		int c = test.add();
		System.out.println(c);

	}

}
