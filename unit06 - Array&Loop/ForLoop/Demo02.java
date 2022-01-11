package ForLoop;

public class Demo02 {

	public static void main(String[] args) {
		
		long timeout = System.currentTimeMillis()+1000;// 1000 ms
		for( ; ; ) {
			System.out.println("I love Java");
			if(System.currentTimeMillis()>timeout) {
				break;
			}
		}

	}

}
