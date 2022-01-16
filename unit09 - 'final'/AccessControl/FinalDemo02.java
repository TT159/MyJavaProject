package AccessControl;

public class FinalDemo02 {

	public static void main(String[] args) {
		/*
		 * Using final to confine the instance variable (attributions of object)
		 */
		Eoo eoo = new Eoo(8);
		System.out.println(eoo.a);
		System.out.println(eoo.b);
		
		Eoo eoo1 = new Eoo(10);
		System.out.println(eoo1.a);
		System.out.println(eoo1.b);
	}

}


class Eoo {
	final int a = 1;
	final int b;
	public Eoo(int b) {
		this.b = b;
	}
}
