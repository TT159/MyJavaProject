package AccessControl;

public class FinalDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goo goo = new Goo();
		goo.test();
		
	}

}

final class Goo {
	public void test() {
		System.out.println("test()");
	}
}


//final class can not be inherit
//class sub extends Goo{
//	
//}