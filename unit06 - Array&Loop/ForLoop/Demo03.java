package ForLoop;

public class Demo03 {

	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			if(i%7==0 || i%10==0) {
				//ignore the rest statement, continue the loop 
				continue;
			}
			System.out.println(i);
		}

	}

}
