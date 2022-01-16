package AccessControl;

public class PrivateTest {
	
	private int a = 9;
	public int b = 7;
	
	public int add() {
		//in the class, we can access "a"
		return a+b;
	}

}