package ForLoop;

public class Demo01 {

	public static void main(String[] args) {
		
		//calculate the sum of numbers from 0~100
		int sum = 0;
		for(int i = 0; i<=100; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
		//calculate the sum of even numbers from 0~100
		int EvenSum = 0;
		for(int i = 0; i<=100; i+=2) {
			EvenSum +=i;
		}
		System.out.println(EvenSum);
		
		// share the iteration variable j
		//we can use this format to do same relay work
		int j =0;
		//0-1-2-3-
		for( ; j<=3;j++) {
			System.out.print(j+"-");//print will not start a new line - difference with println
		}
		
		System.out.print("\n");
		System.out.println(j);//4
		
		//the loop will start with j = 4
		for( ; j<=6;j++) {
			System.out.print(j+"+");
		}
		
		
		
	}

}
